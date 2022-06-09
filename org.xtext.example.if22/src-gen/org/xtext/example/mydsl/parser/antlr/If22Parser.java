/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalIf22Parser;
import org.xtext.example.mydsl.services.If22GrammarAccess;

public class If22Parser extends AbstractAntlrParser {

	@Inject
	private If22GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIf22Parser createParser(XtextTokenStream stream) {
		return new InternalIf22Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public If22GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(If22GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
