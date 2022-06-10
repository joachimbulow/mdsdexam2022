/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.if22.if22.Announcement;
import org.xtext.example.if22.if22.EXPBOOL;
import org.xtext.example.if22.if22.EXPINT;
import org.xtext.example.if22.if22.EXPSTRING;
import org.xtext.example.if22.if22.End;
import org.xtext.example.if22.if22.EndingTarget;
import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.ExternalFunctionCall;
import org.xtext.example.if22.if22.Function;
import org.xtext.example.if22.if22.ID;
import org.xtext.example.if22.if22.If22Package;
import org.xtext.example.if22.if22.Logic;
import org.xtext.example.if22.if22.Parenthesis;
import org.xtext.example.if22.if22.Program;
import org.xtext.example.if22.if22.Question;
import org.xtext.example.if22.if22.Scenario;
import org.xtext.example.if22.if22.ScenarioParameter;
import org.xtext.example.if22.if22.ScenarioParameterInput;
import org.xtext.example.if22.if22.Statement;
import org.xtext.example.if22.if22.Target;
import org.xtext.example.if22.if22.TargetDestination;
import org.xtext.example.if22.if22.TextExp;
import org.xtext.example.if22.if22.This;
import org.xtext.example.if22.if22.Type;
import org.xtext.example.if22.if22.TypeBoolean;
import org.xtext.example.if22.if22.TypeNumber;
import org.xtext.example.if22.if22.TypeText;
import org.xtext.example.if22.if22.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.if22.if22.If22Package
 * @generated
 */
public class If22AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static If22Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If22AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = If22Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected If22Switch<Adapter> modelSwitch =
    new If22Switch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseScenarioParameter(ScenarioParameter object)
      {
        return createScenarioParameterAdapter();
      }
      @Override
      public Adapter caseScenarioParameterInput(ScenarioParameterInput object)
      {
        return createScenarioParameterInputAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseAnnouncement(Announcement object)
      {
        return createAnnouncementAdapter();
      }
      @Override
      public Adapter caseQuestion(Question object)
      {
        return createQuestionAdapter();
      }
      @Override
      public Adapter caseEnd(End object)
      {
        return createEndAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTargetDestination(TargetDestination object)
      {
        return createTargetDestinationAdapter();
      }
      @Override
      public Adapter caseEndingTarget(EndingTarget object)
      {
        return createEndingTargetAdapter();
      }
      @Override
      public Adapter caseLogic(Logic object)
      {
        return createLogicAdapter();
      }
      @Override
      public Adapter caseMath(org.xtext.example.if22.if22.Math object)
      {
        return createMathAdapter();
      }
      @Override
      public Adapter caseTextExp(TextExp object)
      {
        return createTextExpAdapter();
      }
      @Override
      public Adapter caseThis(This object)
      {
        return createThisAdapter();
      }
      @Override
      public Adapter caseEXPSTRING(EXPSTRING object)
      {
        return createEXPSTRINGAdapter();
      }
      @Override
      public Adapter caseEXPINT(EXPINT object)
      {
        return createEXPINTAdapter();
      }
      @Override
      public Adapter caseEXPBOOL(EXPBOOL object)
      {
        return createEXPBOOLAdapter();
      }
      @Override
      public Adapter caseID(ID object)
      {
        return createIDAdapter();
      }
      @Override
      public Adapter caseExternalFunctionCall(ExternalFunctionCall object)
      {
        return createExternalFunctionCallAdapter();
      }
      @Override
      public Adapter caseParenthesis(Parenthesis object)
      {
        return createParenthesisAdapter();
      }
      @Override
      public Adapter caseTypeBoolean(TypeBoolean object)
      {
        return createTypeBooleanAdapter();
      }
      @Override
      public Adapter caseTypeText(TypeText object)
      {
        return createTypeTextAdapter();
      }
      @Override
      public Adapter caseTypeNumber(TypeNumber object)
      {
        return createTypeNumberAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.ScenarioParameter <em>Scenario Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.ScenarioParameter
   * @generated
   */
  public Adapter createScenarioParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.ScenarioParameterInput <em>Scenario Parameter Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.ScenarioParameterInput
   * @generated
   */
  public Adapter createScenarioParameterInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Announcement <em>Announcement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Announcement
   * @generated
   */
  public Adapter createAnnouncementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Question
   * @generated
   */
  public Adapter createQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.End
   * @generated
   */
  public Adapter createEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.TargetDestination <em>Target Destination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.TargetDestination
   * @generated
   */
  public Adapter createTargetDestinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.EndingTarget <em>Ending Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.EndingTarget
   * @generated
   */
  public Adapter createEndingTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Logic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Logic
   * @generated
   */
  public Adapter createLogicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Math <em>Math</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Math
   * @generated
   */
  public Adapter createMathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.TextExp <em>Text Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.TextExp
   * @generated
   */
  public Adapter createTextExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.This
   * @generated
   */
  public Adapter createThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.EXPSTRING <em>EXPSTRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.EXPSTRING
   * @generated
   */
  public Adapter createEXPSTRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.EXPINT <em>EXPINT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.EXPINT
   * @generated
   */
  public Adapter createEXPINTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.EXPBOOL <em>EXPBOOL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.EXPBOOL
   * @generated
   */
  public Adapter createEXPBOOLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.ID
   * @generated
   */
  public Adapter createIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.ExternalFunctionCall <em>External Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.ExternalFunctionCall
   * @generated
   */
  public Adapter createExternalFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.Parenthesis
   * @generated
   */
  public Adapter createParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.TypeBoolean <em>Type Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.TypeBoolean
   * @generated
   */
  public Adapter createTypeBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.TypeText <em>Type Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.TypeText
   * @generated
   */
  public Adapter createTypeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.if22.if22.TypeNumber <em>Type Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.if22.if22.TypeNumber
   * @generated
   */
  public Adapter createTypeNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //If22AdapterFactory
