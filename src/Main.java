import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName("test.x");
        CompilatorLexer lexer = new CompilatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CompilatorParser parser = new CompilatorParser(tokens);
        ParseTree tree = parser.prog();
//        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);
    }
}
