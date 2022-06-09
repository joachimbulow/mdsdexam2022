/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.if22.ide.contentassist.antlr.internal.InternalIf22Parser;
import org.xtext.example.if22.services.If22GrammarAccess;

public class If22Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(If22GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, If22GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives(), "rule__Exp__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getAnnouncementAccess().getGroup(), "rule__Announcement__Group__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
			builder.put(grammarAccess.getEndAccess().getGroup(), "rule__End__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup(), "rule__Target__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getScenariosAssignment_2(), "rule__Program__ScenariosAssignment_2");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getStatementsAssignment_3(), "rule__Scenario__StatementsAssignment_3");
			builder.put(grammarAccess.getAnnouncementAccess().getNameAssignment_1(), "rule__Announcement__NameAssignment_1");
			builder.put(grammarAccess.getAnnouncementAccess().getTargetAssignment_2(), "rule__Announcement__TargetAssignment_2");
			builder.put(grammarAccess.getQuestionAccess().getNameAssignment_1(), "rule__Question__NameAssignment_1");
			builder.put(grammarAccess.getEndAccess().getNameAssignment_1(), "rule__End__NameAssignment_1");
			builder.put(grammarAccess.getEndAccess().getExpAssignment_2(), "rule__End__ExpAssignment_2");
			builder.put(grammarAccess.getTargetAccess().getNameAssignment_1(), "rule__Target__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private If22GrammarAccess grammarAccess;

	@Override
	protected InternalIf22Parser createParser() {
		InternalIf22Parser result = new InternalIf22Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public If22GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(If22GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
