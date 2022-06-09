/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.ExternalFunctionCall;
import org.xtext.example.if22.if22.If22Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.impl.ExternalFunctionCallImpl#getEfName <em>Ef Name</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.ExternalFunctionCallImpl#getEfParameter <em>Ef Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalFunctionCallImpl extends ExpressionImpl implements ExternalFunctionCall
{
  /**
   * The default value of the '{@link #getEfName() <em>Ef Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfName()
   * @generated
   * @ordered
   */
  protected static final String EF_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEfName() <em>Ef Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfName()
   * @generated
   * @ordered
   */
  protected String efName = EF_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEfParameter() <em>Ef Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfParameter()
   * @generated
   * @ordered
   */
  protected Expression efParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalFunctionCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return If22Package.Literals.EXTERNAL_FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEfName()
  {
    return efName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEfName(String newEfName)
  {
    String oldEfName = efName;
    efName = newEfName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.EXTERNAL_FUNCTION_CALL__EF_NAME, oldEfName, efName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getEfParameter()
  {
    return efParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEfParameter(Expression newEfParameter, NotificationChain msgs)
  {
    Expression oldEfParameter = efParameter;
    efParameter = newEfParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER, oldEfParameter, newEfParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEfParameter(Expression newEfParameter)
  {
    if (newEfParameter != efParameter)
    {
      NotificationChain msgs = null;
      if (efParameter != null)
        msgs = ((InternalEObject)efParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER, null, msgs);
      if (newEfParameter != null)
        msgs = ((InternalEObject)newEfParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER, null, msgs);
      msgs = basicSetEfParameter(newEfParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER, newEfParameter, newEfParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER:
        return basicSetEfParameter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_NAME:
        return getEfName();
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER:
        return getEfParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_NAME:
        setEfName((String)newValue);
        return;
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER:
        setEfParameter((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_NAME:
        setEfName(EF_NAME_EDEFAULT);
        return;
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER:
        setEfParameter((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_NAME:
        return EF_NAME_EDEFAULT == null ? efName != null : !EF_NAME_EDEFAULT.equals(efName);
      case If22Package.EXTERNAL_FUNCTION_CALL__EF_PARAMETER:
        return efParameter != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (efName: ");
    result.append(efName);
    result.append(')');
    return result.toString();
  }

} //ExternalFunctionCallImpl
