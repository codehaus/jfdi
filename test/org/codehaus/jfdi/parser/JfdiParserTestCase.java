package org.codehaus.jfdi.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

public abstract class JfdiParserTestCase extends TestCase {
	
	protected void setUp() throws Exception  {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	protected JFDIParser createParser(String path) throws IOException {
		JFDIParser parser = new JFDIParser( createTokenStream( path ) );
		return parser;
	}
	
	private TokenStream createTokenStream(String path) throws IOException {
		return new CommonTokenStream( createLexer( path ) );
	}
	
	private JFDIParserLexer createLexer(String path) throws IOException {
		JFDIParserLexer lexer = new JFDIParserLexer( createStream( path ) );
		return lexer;
	}
	
	private CharStream createStream(String path) throws IOException {
		return new ANTLRReaderStream( createReader( path ) );
	}
	
	private Reader createReader(String path) {
		InputStream in = getClass().getResourceAsStream( path );
		return new InputStreamReader( in );
	}

}
