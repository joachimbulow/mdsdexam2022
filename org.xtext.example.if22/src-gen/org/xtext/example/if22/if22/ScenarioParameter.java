/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.ScenarioParameter#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.ScenarioParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.if22.if22.If22Package#getScenarioParameter()
 * @model
 * @generated
 */
public interface ScenarioParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Expression)
   * @see org.xtext.example.if22.if22.If22Package#getScenarioParameter_Parameter()
   * @model containment="true"
   * @generated
   */
  Expression getParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.ScenarioParameter#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Expression value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Expression)
   * @see org.xtext.example.if22.if22.If22Package#getScenarioParameter_Type()
   * @model containment="true"
   * @generated
   */
  Expression getType();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.ScenarioParameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Expression value);

} // ScenarioParameter
