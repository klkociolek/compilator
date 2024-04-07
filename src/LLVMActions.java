
import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, REAL,STRING, UNKNOWN }

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type ){
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends CompilatorBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override
    public void exitWrite(CompilatorParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        variables.put(ID, v.type);
        if( v.type == VarType.INT ){
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, v.name);
        }
        if( v.type == VarType.REAL ){
            LLVMGenerator.declare_double(ID);
            LLVMGenerator.assign_double(ID, v.name);
        }
        //if( v.type == VarType.STRING ){
        //    LLVMGenerator.declare_string(ID);
        //    LLVMGenerator.assign_string(ID, v.name);
        //}
    }

    //@Override
    //public void exitString(LangXParser.ValueContext ctx) {
    //    if( ctx.ID() != null ){
    //        String ID = ctx.ID().getText();
    //        if( variables.containsKey(ID) ) {
    //            Value v = variables.get( ID );
    //            if( v.type == VarType.STRING ){
    //                LLVMGenerator.load_string( ID );
    //            }
    //            stack.push( new Value("%"+(LLVMGenerator.reg-1), v.type, v.length));
    //        } else {
    //            error(ctx.getStart().getLine(), "unknown variable "+ID);
    //        }
    //    }
    //    if( ctx.INT() != null ){
    //        stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
    //    }
    //    if( ctx.STRING() != null ){
    //        String tmp = ctx.STRING().getText();
    //        String content = tmp.substring(1, tmp.length()-1);
    //        LLVMGenerator.constant_string(content);
    //        String n = "ptrstr"+(LLVMGenerator.str-1);
    //        stack.push( new Value(n, VarType.STRING, content.length()) );
    //    }
    //}

    @Override
    public void exitProg(CompilatorParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitInt(CompilatorParser.IntContext ctx) {
        stack.push( new Value(ctx.INT().getText(), VarType.INT) );
    }

    @Override
    public void exitReal(CompilatorParser.RealContext ctx) {
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
    }


    @Override
    public void exitAdd(CompilatorParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
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
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
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
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
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
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitToint(CompilatorParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    }

    @Override
    public void exitToreal(CompilatorParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
    }

    @Override
    public void exitPrint(CompilatorParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type != null ) {
            if( type == VarType.INT ){
                LLVMGenerator.printf_i32( ID );
            }
            if( type == VarType.REAL ){
                LLVMGenerator.printf_double( ID );
            }
            if( type == VarType.STRING ){
                LLVMGenerator.printf_string( ID );
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    @Override
    public void exitRead(CompilatorParser.ReadContext ctx) {
    }

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }

}