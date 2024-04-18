import java.util.Stack;
class LLVMGenerator{

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str = 1;
    static String buffer = "";
    static int main_tmp = 1;
    static int br = 0;
    static Stack<Integer> brstack = new Stack<Integer>();

    static void close_main(){
        main_text += buffer;
    }

    static void call(String id){
        buffer += "%"+reg+" = call i32 @"+id+"()\n";
        reg++;
    }

    static void functionstart(String id){
        main_text += buffer;
        main_tmp = reg;
        buffer = "define i32 @"+id+"() {\n";
        reg = 1;
    }

    static void functionend(){
        buffer += "ret i32 %"+(reg-1)+"\n";
        buffer += "}\n";
        header_text += buffer;
        buffer = "";
        reg = main_tmp;
    }

    static void printf_string(String id){
        buffer += "%"+reg+" = load i8*, i8** "+id+"\n";
        reg++;
        buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_int(String id){
        buffer += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
        buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_real(String id){
        buffer += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
        buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }
    static void printf_bool(String id){
        buffer += "%" + reg + " = load i1, i1* " + id + "\n";
        int boolReg = reg;  // Store the register number of the loaded boolean
        reg++;
        // Convert i1 to i32 for printing purposes
        buffer += "%" + reg + " = zext i1 %" + boolReg + " to i32\n";
        int intReg = reg;  // Store the register number of the extended boolean
        reg++;
        // Call printf function to print the integer
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + intReg + ")\n";
        reg++;
    }


    static void scanfstring(String id, int l,boolean global){
        if( global ){
            allocate_string("str"+str, l,true);
            header_text += id+" = global i8*\n";
        }
        else {
            allocate_string("str"+str, l,false);
            buffer += id+" = alloca i8*\n";
        }
        buffer += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        buffer += "store i8* %"+(reg-1)+", i8** "+id+"\n";
        str++;
        buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void scanfint(String id){
        buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32* "+id+")\n";
        reg++;
    }

    static void scanfreal(String id){
        buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strspd, i32 0, i32 0), double* "+id+")\n";
        reg++;
    }


    static void declare_int(String id, Boolean global){
        if( global ){
            header_text += "@"+id+" = global i32 0\n";
        } else {
            buffer += "%"+id+" = alloca i32\n";
        }
    }

    static void declare_real(String id, Boolean global){
        if( global ){
            header_text += "@"+id+" = global double 0.0\n";
        } else {
            buffer += "%"+id+" = alloca double\n";
        }
    }

    static void declare_string(String id, Boolean global){
        if( global ){
            header_text += "@"+id+" = global i8 0\n";
        } else {
            buffer += "%"+id+" = alloca i8\n";
        }
    }

    static void declare_bool(String id, Boolean global){
        if( global ){
            header_text += "@"+id+" = global i1 0\n";
        } else {
            buffer += "%"+id+" = alloca i1\n";
        }
    }

    static void allocate_string(String id, int l, boolean global){
        if(global) {
            header_text += "@" + id + " = global [" + (l + 1) + " x i8]\n";
        } else {
            buffer += "%" + id + " = alloca [" + (l + 1) + " x i8]\n";
        }
    }

    static void assign_int(String id, String value){
        buffer += "store i32 "+value+", i32* "+id+"\n";
    }

    static void assign_real(String id, String value){
        buffer += "store double "+value+", double* "+id+"\n";
    }

    static void assign_string(String id){
        buffer += "store i8* %"+(reg-1)+", i8** "+id+"\n";
    }

    static void assign_bool(String id, String value){
//    if (!"0".equals(value) && !"1".equals(value)) {
//        if (!isRegisteredBoolVariable(value)) {
//            throw new IllegalArgumentException("Value must be '0', '1', or a registered boolean variable.");
//        }
//        main_text += "store i1 %" + value + ", i1* %" + id + "\n";
//    } else {
        buffer += "store i1 " + value + ", i1* " + id + "\n";
//    }
    }


    static void constant_string(String content){
        int l = content.length()+1;
        header_text += "@str"+str+" = constant ["+l+" x i8] c\""+content+"\\00\"\n";
        String n = "str"+str;
        LLVMGenerator.allocate_string(n, (l-1),false);
        buffer += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
        buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %"+reg+", i8* align 1 getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
        reg++;
        buffer += "%ptr"+n+" = alloca i8*\n";
        buffer += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
        reg++;
        buffer += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
        str++;
    }

    static void add_i32(String val1, String val2){
        buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){
        buffer += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){
        buffer += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }

    static void mult_i32(String val1, String val2){
        buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_double(String val1, String val2){
        buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void div_i32(String val1, String val2){
        buffer += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void div_double(String val1, String val2){
        buffer += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }


    static void load_int(String id){
        buffer += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
    }

    static void load_real(String id){
        buffer += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
    }

    static void load_string(String id){
        buffer += "%"+reg+" = load i8*, i8** "+id+"\n";
        reg++;
    }

    static void load_bool(String id){
        buffer += "%" + reg + " = load i1, i1* " + id + "\n";
        reg++;
    }


    static void add_string(String id1, int l1, String id2, int l2){
        allocate_string("str"+str, l1+l2,false);
        buffer += "%ptrstr"+str+" = alloca i8*\n";
        buffer += "%"+reg+" = getelementptr inbounds ["+(l1+l2+1)+" x i8], ["+(l1+l2+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        buffer += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n";
        buffer += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
        reg++;
        buffer += "%"+reg+" = call i8* @strcpy(i8* %"+(reg-1)+", i8* "+id1+")\n";
        reg++;
        buffer += "%"+reg+" = call i8* @strcat(i8* %"+(reg-2)+", i8* "+id2+")\n";
        reg++;
        str++;
    }

    static void string_to_int(String in){
        buffer += "%"+reg+" = call i32 @atoi(i8* "+in+")\n";
        reg++;
    }

    static void and_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean AND operation
        buffer += "%"+reg+" = and i1 "+val1+", "+val2+"\n";  // AND the results of the comparisons
        reg++;
    }

    static void or_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean OR operation
        buffer += "%" + reg + " = or i1 " + val1 + ", " + val2 + "\n";  // OR the results of the comparisons
        reg++;
    }


    static void xor_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean XOR operation
        buffer += "%" + reg + " = xor i1 " + val1 + ", " + val2 + "\n";  // XOR the results of the comparisons
        reg++;
    }

    static void not_boolean(String val) {
        // Generate LLVM IR code for the boolean NOT operation
        buffer += "%" + reg + " = xor i1 " + val + ", true\n";  // NOT the result (XOR with true)
        reg++;
    }

    static void neq_boolean(String val1, String val2) {
//        for init for now
        buffer += "%" + reg + " = icmp ne i32 " + val1 + ", " + val2 + "\n";  // Compare the two integer values for equality
        reg++;
    }

    static void equal_boolean(String val1, String val2) {
//        for init for now
        buffer += "%" + reg + " = icmp eq i32 " + val1 + ", " + val2 + "\n";  // Compare the two integer values for equality
        reg++;
    }



    static void if_statement_start(String val){
        br++;
        buffer +=  "br i1 "+val+", label %true"+br+", label %false"+br+"\n";
        buffer += "true" + br + ":\n";
        brstack.push(br);
    }


    static void if_statement_exit(){
         int b = brstack.pop();
         buffer += "br label %false"+b+"\n";
         buffer += "false"+b+":\n";

    }

    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @sprintf(i8*, i8*, ...)\n";
        text += "declare i8* @strcpy(i8*, i8*)\n";
        text += "declare i8* @strcat(i8*, i8*)\n";
        text += "declare i32 @atoi(i8*)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";
        text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strspd = constant [4 x i8] c\"%lf\\00\"\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strs = constant [5 x i8] c\"%10s\\00\"\n";
        text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";
        text += header_text;
        text += "define i32 @main(){\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }

}
