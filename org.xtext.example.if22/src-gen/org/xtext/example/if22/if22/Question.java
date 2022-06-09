/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.Question#getQString <em>QString</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.Question#getQType <em>QType</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.Question#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.if22.if22.If22Package#getQuestion()
 * @model
 * @generated
 */
public interface Question extends Statement
{
  /**
   * Returns the value of the '<em><b>QString</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>QString</em>' attribute.
   * @see #setQString(String)
   * @see org.xtext.example.if22.if22.If22Package#getQuestion_QString()
   * @model
   * @generated
   */
  String getQString();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.Question#getQString <em>QString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QString</em>' attribute.
   * @see #getQString()
   * @generated
   */
  void setQString(String value);

  /**
   * Returns the value of the '<em><b>QType</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>QType</em>' attribute.
   * @see #setQType(String)
   * @see org.xtext.example.if22.if22.If22Package#getQuestion_QType()
   * @model
   * @generated
   */
  String getQType();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.Question#getQType <em>QType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QType</em>' attribute.
   * @see #getQType()
   * @generated
   */
  void setQType(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.if22.if22.Target}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see org.xtext.example.if22.if22.If22Package#getQuestion_Target()
   * @model containment="true"
   * @generated
   */
  EList<Target> getTarget();

} // Question
