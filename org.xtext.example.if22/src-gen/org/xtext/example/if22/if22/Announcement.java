/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Announcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.Announcement#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.Announcement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.if22.if22.If22Package#getAnnouncement()
 * @model
 * @generated
 */
public interface Announcement extends Statement
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute.
   * @see #setExp(String)
   * @see org.xtext.example.if22.if22.If22Package#getAnnouncement_Exp()
   * @model
   * @generated
   */
  String getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.if22.if22.Announcement#getExp <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' attribute.
   * @see #getExp()
   * @generated
   */
  void setExp(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.if22.if22.Target}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see org.xtext.example.if22.if22.If22Package#getAnnouncement_Target()
   * @model containment="true"
   * @generated
   */
  EList<Target> getTarget();

} // Announcement
