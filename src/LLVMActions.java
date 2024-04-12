
import java.util.HashMap;
import java.util.Stack;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

enum VarType{ INT,REAL, STRING, UNKNOWN, BOOL }

class Value{
    public String name;
    public VarType type;
    public int length;
    public Value( String name, VarType type, int length ){
        this.name = name;
        this.type = type;
        this.length = length;
    }
}

public class LLVMActions extends CompilatorBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    Stack<Value> stack = new Stack<Value>();

    static int BUFFER_SIZE = 16;

    private void exitAssign0ByID(String ID, Value v, int line){
        if( !variables.containsKey(ID) ) {
            variables.put(ID, v);
            if( v.type == VarType.INT ) {
                LLVMGenerator.declare_int(ID);
            }
            if( v.type == VarType.REAL ){
                LLVMGenerator.declare_real(ID);
            }
            if( v.type == VarType.STRING ){
                LLVMGenerator.declare_string(ID);
            }
            if ( v.type == VarType.BOOL ){
                LLVMGenerator.declare_bool(ID);
            }
        } else if (v.type != variables.get(ID).type ) {
            error(line,"Reassignment of a variable is only possible for the same type");
        }
        if( v.type == VarType.INT ){
            LLVMGenerator.assign_int(ID, v.name);
        }
        if( v.type == VarType.REAL ){
            LLVMGenerator.assign_real(ID, v.name);
        }
        if( v.type == VarType.STRING ){
            LLVMGenerator.assign_string(ID);
       }
        if( v.type == VarType.BOOL ){
            LLVMGenerator.assign_bool(ID,v.name);
       }
    }

    @Override
    public void exitAssign0(CompilatorParser.Assign0Context ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        exitAssign0ByID(ID,v,ctx.start.getLine());
    }

    @Override
    public void exitValue(CompilatorParser.ValueContext ctx) {
        if (ctx.ID() != null && !"false".equals(ctx.ID().getText()) && !"true".equals(ctx.ID().getText())) {
            String ID = ctx.ID().getText();
            if( variables.containsKey(ID) ) {
                Value v = variables.get( ID );
                if( v.type == VarType.INT ){
                    LLVMGenerator.load_int( ID );
                }
                if( v.type == VarType.REAL ){
                    LLVMGenerator.load_real( ID );
                }
                if( v.type == VarType.STRING ){
                    LLVMGenerator.load_string( ID );
                }
                if( v.type == VarType.BOOL ){
                    LLVMGenerator.load_bool( ID );
                }
                stack.push( new Value("%"+(LLVMGenerator.reg-1), v.type, v.length));
            } else {
                error(ctx.getStart().getLine(), "unknown variable "+ID);
            }
        }
        if( ctx.INT() != null ){
            stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
        }
        if( ctx.REAL() != null ){
            stack.push( new Value(ctx.REAL().getText(), VarType.REAL, 0) );
        }
        if (ctx.ID() != null && ("false".equals(ctx.ID().getText()) || "true".equals(ctx.ID().getText()))) {
            String boolVal = ctx.ID().getText();
            String llvmBoolVal = boolVal.equals("true") ? "1" : "0";
            stack.push(new Value(llvmBoolVal, VarType.BOOL, 0));
        }
        if( ctx.STRING() != null ){
            String tmp = ctx.STRING().getText();
            String content = tmp.substring(1, tmp.length()-1);
            LLVMGenerator.constant_string(content);
//            String n = "ptrstr"+(LLVMGenerator.str-1);
//            stack.push( new Value(n, VarType.STRING, content.length()) );
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.STRING, content.length())); // added to a="a" + "b"
        }
    }

    @Override
    public void exitAdd(CompilatorParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) );
            }
            if( v1.type==VarType.STRING ){
                LLVMGenerator.add_string( v2.name, v2.length,v1.name, v1.length); // to add in good order
                Value v = new Value("%"+(LLVMGenerator.reg-3), VarType.STRING, v1.length);
                stack.push(v);
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitSub(CompilatorParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) );
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitMult(CompilatorParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) );
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitDiv(CompilatorParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) );
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }


    @Override
    public void exitProg(CompilatorParser.ProgContext ctx) {
        String llvmCode = LLVMGenerator.generate();
        System.out.println(llvmCode);
        String filePath = "output.ll";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(llvmCode);
            System.out.println("Successfully wrote LLVM code to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    @Override
    public void exitWrite(CompilatorParser.WriteContext exp) {
        Value v1 = stack.pop();
        String ID="";
        int line = exp.start.getLine();
        if( v1.type == VarType.INT ){
            ID = "tmpint";
        } else if (v1.type == VarType.REAL ) {
            ID = "tmpreal";
        } else if (v1.type == VarType.STRING) {
            ID = "tmpstr";
        } else if (v1.type == VarType.BOOL) {
            ID = "tmpBOOL";
        } else{
            error(line, "unknown variable");
        }
        exitAssign0ByID(ID,v1,line);
        if( variables.containsKey(ID) ) {
            Value v = variables.get( ID );
            if( v.type != null ) {
                if( v.type == VarType.INT ){
                    LLVMGenerator.printf_int( ID );
                }
                if( v.type == VarType.REAL ){
                    LLVMGenerator.printf_real( ID );
                }
                if( v.type == VarType.STRING ){
                    LLVMGenerator.printf_string( ID );
                }
                if( v.type == VarType.BOOL ){
                    LLVMGenerator.printf_bool( ID );
                }
            }
        }else{
            error(line, "unknown variable");
        }
    }


    @Override
    public void exitReadstring(CompilatorParser.ReadstringContext ctx) {
        String ID = ctx.ID().getText();
//        Value v = new Value(ID, VarType.STRING, BUFFER_SIZE-1);
        LLVMGenerator.scanfstring(ID, BUFFER_SIZE);
        Value v = new Value("%"+(LLVMGenerator.reg-1), VarType.STRING, BUFFER_SIZE-1); // declaration should be after LLVMGenerator
        variables.put(ID, v);
   }

    @Override
    public void exitReadint(CompilatorParser.ReadintContext ctx) {
        String ID = ctx.ID().getText();
        LLVMGenerator.scanfint(ID);
        Value v = new Value("%"+(LLVMGenerator.reg-1), VarType.INT, 0);
        variables.put(ID, v);
    }

    @Override
    public void exitReadreal(CompilatorParser.ReadrealContext ctx) {
        String ID = ctx.ID().getText();
        LLVMGenerator.scanfreal(ID);
        Value v = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, 0);
        variables.put(ID, v);
    }

    @Override
    public void exitAnd(CompilatorParser.AndContext ctx) {
        Value v1 = stack.pop(); // Right operand
        Value v2 = stack.pop(); // Left operand
        if (v1.type != VarType.BOOL || v2.type != VarType.BOOL) {
            error(ctx.getStart().getLine(), "Logical AND requires boolean operands");
        }
        LLVMGenerator.and_boolean(v1.name, v2.name);
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL,0) );
    }

    @Override
    public void exitOr(CompilatorParser.OrContext ctx) {
        Value v1 = stack.pop(); // Right operand
        Value v2 = stack.pop(); // Left operand
        if (v1.type != VarType.BOOL || v2.type != VarType.BOOL) {
            error(ctx.getStart().getLine(), "Logical OR requires boolean operands");
        }
        LLVMGenerator.or_boolean(v1.name, v2.name);
        stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL, 0));
    }

    @Override
    public void exitXor(CompilatorParser.XorContext ctx) {
        Value v1 = stack.pop(); // Right operand
        Value v2 = stack.pop(); // Left operand
        if (v1.type != VarType.BOOL || v2.type != VarType.BOOL) {
            error(ctx.getStart().getLine(), "Logical XOR requires boolean operands");
        }
        LLVMGenerator.xor_boolean(v1.name, v2.name);
        stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL, 0));
    }

    @Override
    public void exitNeg(CompilatorParser.NegContext ctx) {
        Value v = stack.pop(); // Operand
        if (v.type != VarType.BOOL) {
            error(ctx.getStart().getLine(), "Logical NOT requires a boolean operand");
        }
        LLVMGenerator.not_boolean(v.name);
        stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL, 0));
    }


    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }

}