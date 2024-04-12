class LLVMGenerator{

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str = 1;

    static void printf_string(String id){
        main_text += "%"+reg+" = load i8*, i8** %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_int(String id){
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_real(String id){
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }
    static void printf_bool(String id){
        main_text += "%" + reg + " = load i1, i1* %" + id + "\n";
        int boolReg = reg;  // Store the register number of the loaded boolean
        reg++;
        // Convert i1 to i32 for printing purposes
        main_text += "%" + reg + " = zext i1 %" + boolReg + " to i32\n";
        int intReg = reg;  // Store the register number of the extended boolean
        reg++;
        // Call printf function to print the integer
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + intReg + ")\n";
        reg++;
    }


    static void scanfstring(String id, int l){
        allocate_string("str"+str, l);
        main_text += "%"+id+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+(l+1)+" x i8], ["+(l+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
        str++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void scanfint(String id){
        main_text += "%"+id+" = alloca i32\n";
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32* %"+id+")\n";
        reg++;
    }

    static void scanfreal(String id){
        main_text += "%"+id+" = alloca double\n";
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strspd, i32 0, i32 0), double* %"+id+")\n";
        reg++;
    }


    static void declare_int(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_real(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void declare_string(String id){
        main_text += "%"+id+" = alloca i8*\n";
    }

    static void declare_bool(String id){
        main_text += "%" + id + " = alloca i1\n";
    }

    static void allocate_string(String id, int l){
        main_text += "%"+id+" = alloca ["+(l+1)+" x i8]\n";
    }

    static void assign_int(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_real(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }

    static void assign_string(String id){
        main_text += "store i8* %"+(reg-1)+", i8** %"+id+"\n";
    }

static void assign_bool(String id, String value){
//    if (!"0".equals(value) && !"1".equals(value)) {
//        if (!isRegisteredBoolVariable(value)) {
//            throw new IllegalArgumentException("Value must be '0', '1', or a registered boolean variable.");
//        }
//        main_text += "store i1 %" + value + ", i1* %" + id + "\n";
//    } else {
    main_text += "store i1 " + value + ", i1* %" + id + "\n";
//    }
}


    static void constant_string(String content){
        int l = content.length()+1;
        header_text += "@str"+str+" = constant ["+l+" x i8] c\""+content+"\\00\"\n";
        String n = "str"+str;
        LLVMGenerator.allocate_string(n, (l-1));
        main_text += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
        main_text += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %"+reg+", i8* align 1 getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
        reg++;
        main_text += "%ptr"+n+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
        str++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){
        main_text += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){
        main_text += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }

    static void mult_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void div_i32(String val1, String val2){
        main_text += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    static void div_double(String val1, String val2){
        main_text += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }


    static void load_int(String id){
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
    }

    static void load_real(String id){
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
    }

    static void load_string(String id){
        main_text += "%"+reg+" = load i8*, i8** %"+id+"\n";
        reg++;
    }

    static void load_bool(String id){
    main_text += "%" + reg + " = load i1, i1* %" + id + "\n";
    reg++;
    }


    static void add_string(String id1, int l1, String id2, int l2){
        allocate_string("str"+str, l1+l2);
        main_text += "%ptrstr"+str+" = alloca i8*\n";
        main_text += "%"+reg+" = getelementptr inbounds ["+(l1+l2+1)+" x i8], ["+(l1+l2+1)+" x i8]* %str"+str+", i64 0, i64 0\n";
        reg++;
        main_text += "store i8* %"+(reg-1)+", i8** %ptrstr"+str+"\n";
        main_text += "%"+reg+" = load i8*, i8** %ptrstr"+str+"\n";
        reg++;
        main_text += "%"+reg+" = call i8* @strcpy(i8* %"+(reg-1)+", i8* "+id1+")\n";
        reg++;
        main_text += "%"+reg+" = call i8* @strcat(i8* %"+(reg-2)+", i8* "+id2+")\n";
        reg++;
        str++;
    }

    static void string_to_int(String in){
        main_text += "%"+reg+" = call i32 @atoi(i8* "+in+")\n";
        reg++;
    }

    static void and_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean AND operation
       main_text += "%"+reg+" = and i1 "+val2+", "+val2+"\n";  // AND the results of the comparisons
        reg++;
    }

    static void or_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean OR operation
        main_text += "%" + reg + " = or i1 " + val1 + ", " + val2 + "\n";  // OR the results of the comparisons
        reg++;
    }


    static void xor_boolean(String val1, String val2) {
        // Generate LLVM IR code for the boolean XOR operation
        main_text += "%" + reg + " = xor i1 " + val1 + ", " + val2 + "\n";  // XOR the results of the comparisons
        reg++;
    }

    static void not_boolean(String val) {
        // Generate LLVM IR code for the boolean NOT operation
        main_text += "%" + reg + " = xor i1 " + val + ", true\n";  // NOT the result (XOR with true)
        reg++;
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