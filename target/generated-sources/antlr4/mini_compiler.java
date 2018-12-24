import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class mini_compiler {
	public static void main( String[] args) throws Exception {
		String path = "C:\\Users\\mrhjs\\Desktop\\pl";
		String filename = "testfile";
		FileWriter fw = new FileWriter(path+"\\"+filename+".code");
		FileWriter fws = new FileWriter(path+"\\"+filename+".symbol");
		fws.write("name    type\n");
		fws.close();
		String testscript = path+"\\"+filename;
		String script = readFile(testscript, Charset.forName("UTF-8"));
		ANTLRInputStream input = new ANTLRInputStream(script);
		ParseTreeWalker walker = new ParseTreeWalker();
		HelloLexer lexer = new HelloLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.prog(); // begin parsing at rule
		walker.walk(new Miniwalker(),tree);
		printtree(tree, parser, fw);
		fw.close();
	}
	static String readFile(String path, Charset encoding) throws IOException {
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded, encoding);
	}
	public static void printtree(ParseTree tree, HelloParser parser, FileWriter fw) throws IOException {
		if (tree.getChildCount() != 0) {
			for (int i = 0; i < tree.getChildCount(); i++) {
				printtree(tree.getChild(i), parser, fw);
			}
		} else {
			if (tree.toStringTree(parser).contains("decls")) {
				fw.write(tree.toStringTree(parser).substring(5));
			} else if (tree.toStringTree(parser).contains("statb")) {
				fw.write(tree.toStringTree(parser).substring(5));
			} else {
				fw.write(tree.toStringTree(parser));
			}
			
		}
	}
}