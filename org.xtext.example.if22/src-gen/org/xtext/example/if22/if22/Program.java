/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.Program#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.Program#getExternalFunctions <em>External Functions</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.Program#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.if22.if22.If22Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.if22.if22.If22Package#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>External Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.if22.if22.Function}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Functions</em>' containment reference list.
   * @see org.xtext.example.if22.if22.If22Package#getProgram_ExternalFunctions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getExternalFunctions();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.if22.if22.Scenario}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see org.xtext.example.if22.if22.If22Package#getProgram_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // Program
