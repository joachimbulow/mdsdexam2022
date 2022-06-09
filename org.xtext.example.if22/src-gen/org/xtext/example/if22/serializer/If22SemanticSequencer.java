/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.if22.if22.Announcement;
import org.xtext.example.if22.if22.EXPBOOL;
import org.xtext.example.if22.if22.EXPINT;
import org.xtext.example.if22.if22.EXPSTRING;
import org.xtext.example.if22.if22.End;
import org.xtext.example.if22.if22.Exp;
import org.xtext.example.if22.if22.ID;
import org.xtext.example.if22.if22.If22Package;
import org.xtext.example.if22.if22.Logic;
import org.xtext.example.if22.if22.Parenthesis;
import org.xtext.example.if22.if22.Program;
import org.xtext.example.if22.if22.Question;
import org.xtext.example.if22.if22.Scenario;
import org.xtext.example.if22.if22.Target;
import org.xtext.example.if22.if22.TextExp;
import org.xtext.example.if22.if22.This;
import org.xtext.example.if22.if22.Type;
import org.xtext.example.if22.if22.VariableDefinition;
import org.xtext.example.if22.services.If22GrammarAccess;

@SuppressWarnings("all")
public class If22SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private If22GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == If22Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case If22Package.ANNOUNCEMENT:
				sequence_Announcement(context, (Announcement) semanticObject); 
				return; 
			case If22Package.EXPBOOL:
				sequence_Primary(context, (EXPBOOL) semanticObject); 
				return; 
			case If22Package.EXPINT:
				sequence_Primary(context, (EXPINT) semanticObject); 
				return; 
			case If22Package.EXPSTRING:
				sequence_Primary(context, (EXPSTRING) semanticObject); 
				return; 
			case If22Package.END:
				sequence_End(context, (End) semanticObject); 
				return; 
			case If22Package.EXP:
				sequence_Exp(context, (Exp) semanticObject); 
				return; 
			case If22Package.ID:
				sequence_Primary(context, (ID) semanticObject); 
				return; 
			case If22Package.LOGIC:
				sequence_Exp(context, (Logic) semanticObject); 
				return; 
			case If22Package.MATH:
				sequence_Exp(context, (org.xtext.example.if22.if22.Math) semanticObject); 
				return; 
			case If22Package.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case If22Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case If22Package.QUESTION:
				sequence_Question(context, (Question) semanticObject); 
				return; 
			case If22Package.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case If22Package.TARGET:
				sequence_Target(context, (Target) semanticObject); 
				return; 
			case If22Package.TEXT_EXP:
				sequence_Exp(context, (TextExp) semanticObject); 
				return; 
			case If22Package.THIS:
				sequence_Primary(context, (This) semanticObject); 
				return; 
			case If22Package.TYPE:
				sequence_Primary(context, (Type) semanticObject); 
				return; 
			case If22Package.VARIABLE_DEFINITION:
				sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Announcement
	 *     Announcement returns Announcement
	 *
	 * Constraint:
	 *     (name=ID exp=Exp target+=Target+)
	 * </pre>
	 */
	protected void sequence_Announcement(ISerializationContext context, Announcement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns End
	 *     End returns End
	 *
	 * Constraint:
	 *     (name=ID exp=Exp?)
	 * </pre>
	 */
	protected void sequence_End(ISerializationContext context, End semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Exp
	 *     Exp.Logic_2_0_0_0 returns Exp
	 *     Exp.Math_2_0_1_0 returns Exp
	 *     Exp.TextExp_2_0_2_0 returns Exp
	 *
	 * Constraint:
	 *     left=Primary
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.EXP__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Logic
	 *     Exp.Logic_2_0_0_0 returns Logic
	 *     Exp.Math_2_0_1_0 returns Logic
	 *     Exp.TextExp_2_0_2_0 returns Logic
	 *
	 * Constraint:
	 *     (left=Exp_Logic_2_0_0_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Logic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.LOGIC__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.LOGIC__LEFT));
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.LOGIC__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.LOGIC__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getLogicLeftAction_2_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_2_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Math
	 *     Exp.Logic_2_0_0_0 returns Math
	 *     Exp.Math_2_0_1_0 returns Math
	 *     Exp.TextExp_2_0_2_0 returns Math
	 *
	 * Constraint:
	 *     (left=Exp_Math_2_0_1_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, org.xtext.example.if22.if22.Math semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.MATH__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.MATH__LEFT));
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.MATH__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.MATH__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMathLeftAction_2_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_2_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns TextExp
	 *     Exp.Logic_2_0_0_0 returns TextExp
	 *     Exp.Math_2_0_1_0 returns TextExp
	 *     Exp.TextExp_2_0_2_0 returns TextExp
	 *
	 * Constraint:
	 *     (left=Exp_TextExp_2_0_2_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, TextExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.TEXT_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.TEXT_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.TEXT_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.TEXT_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getTextExpLeftAction_2_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_2_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 * </pre>
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns EXPBOOL
	 *
	 * Constraint:
	 *     {EXPBOOL}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, EXPBOOL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns EXPINT
	 *
	 * Constraint:
	 *     {EXPINT}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, EXPINT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns EXPSTRING
	 *
	 * Constraint:
	 *     {EXPSTRING}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, EXPSTRING semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns ID
	 *
	 * Constraint:
	 *     {ID}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, ID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns This
	 *
	 * Constraint:
	 *     {This}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, This semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primary returns Type
	 *
	 * Constraint:
	 *     {Type}
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=ID scenarios+=Scenario*)
	 * </pre>
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Question
	 *     Question returns Question
	 *
	 * Constraint:
	 *     (name=ID qString=Exp qType=Exp reffedVar=[VariableDefinition|ID]? target+=Target+)
	 * </pre>
	 */
	protected void sequence_Question(ISerializationContext context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (name=ID variableDefinitinos+=VariableDefinition* statements+=Statement*)
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Target returns Target
	 *
	 * Constraint:
	 *     (name=ID targetCheck=Exp?)
	 * </pre>
	 */
	protected void sequence_Target(ISerializationContext context, Target semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VariableDefinition returns VariableDefinition
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_VariableDefinition(ISerializationContext context, VariableDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.VARIABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.VARIABLE_DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, If22Package.Literals.VARIABLE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, If22Package.Literals.VARIABLE_DEFINITION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDefinitionAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
