package org.codehaus.jfdi.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.codehaus.jfdi.interpreter.ClassTypeResolver;
import org.codehaus.jfdi.interpreter.DefaultValueHandlerFactory;

public abstract class JfdiParserTestCase extends TestCase {
	
	private DefaultValueHandlerFactory factory;
	
	protected void setUp() throws Exception  {
		super.setUp();
		this.factory = new DefaultValueHandlerFactory( new ClassTypeResolver() );
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	protected void addVariable(String identifier, Object instance) {
		factory.addVariable( identifier, instance );
	}
	
	
	protected JFDIParser createParser(String text) throws IOException {
		JFDIParser parser = new JFDIParser( createTokenStream( text ) );
		parser.setValueHandlerFactory( factory );
		return parser;
	}
	
	private TokenStream createTokenStream(String text) throws IOException {
		return new CommonTokenStream( createLexer( text ) );
	}
	
	private JFDIParserLexer createLexer(String text) throws IOException {
		JFDIParserLexer lexer = new JFDIParserLexer( createStream( text ) );
		return lexer;
	}
	
	private CharStream createStream(String text) throws IOException {
		if ( text.endsWith( ".jfdi" ) ) {
			return new ANTLRReaderStream( createReader( text ) );
		}
		
		return new ANTLRStringStream( text );
	}
	
	private Reader createReader(String text) {
		InputStream in = getClass().getResourceAsStream( text );
		return new InputStreamReader( in );
	}

}
