import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Miniwalker extends HelloParserBaseListener {

	public void enterProg(HelloParser.ProgContext ctx ) throws IOException {
		FileWriter fws = new FileWriter("C:\\Users\\mrhjs\\Desktop\\pl\\testfile.symbol", true);
		String aa = ctx.Word().toString();
		fws.write(aa+"    function\n");
		fws.close();
	}

	public void exitProg(HelloParser.ProgContext ctx ) {
		//System.out.println( "Exiting prog" );
	}

	public void enterDecl(HelloParser.DeclContext ctx ) throws IOException {
		FileWriter fws = new FileWriter("C:\\Users\\mrhjs\\Desktop\\pl\\testfile.symbol", true);
		fws.write(ctx.words().Word()+"       "+ctx.vtype().getText()+"\n");
		HelloParser.WordsContext wtx = ctx.words();
		for (; wtx.children.size() == 3;) {
			wtx = wtx.words();
			fws.write(wtx.Word()+"       "+ctx.vtype().getText()+"\n");
		}
		fws.close();
	}
	public void exitDecl(HelloParser.DeclContext ctx ) {
		//System.out.println( "Exiting decl" );
	}	
}