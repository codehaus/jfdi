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
	
	
	protected JFDIParser createParser(String path) throws IOException {
		JFDIParser parser = new JFDIParser( createTokenStream( path ) );
		parser.setValueHandlerFactory( factory );
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
		if ( path.endsWith( ".jfdi" ) ) {
			return new ANTLRReaderStream( createReader( path ) );
		}
		
		return new ANTLRStringStream( path );
	}
	
	private Reader createReader(String path) {
		InputStream in = getClass().getResourceAsStream( path );
		return new InputStreamReader( in );
	}

}
