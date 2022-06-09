/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.If22Package;
import org.xtext.example.if22.if22.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.impl.TargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.TargetImpl#getTargetCheck <em>Target Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetCheck() <em>Target Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetCheck()
   * @generated
   * @ordered
   */
  protected Expression targetCheck;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetImpl()
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
    return If22Package.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.TARGET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getTargetCheck()
  {
    return targetCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetCheck(Expression newTargetCheck, NotificationChain msgs)
  {
    Expression oldTargetCheck = targetCheck;
    targetCheck = newTargetCheck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, If22Package.TARGET__TARGET_CHECK, oldTargetCheck, newTargetCheck);
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
  public void setTargetCheck(Expression newTargetCheck)
  {
    if (newTargetCheck != targetCheck)
    {
      NotificationChain msgs = null;
      if (targetCheck != null)
        msgs = ((InternalEObject)targetCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - If22Package.TARGET__TARGET_CHECK, null, msgs);
      if (newTargetCheck != null)
        msgs = ((InternalEObject)newTargetCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - If22Package.TARGET__TARGET_CHECK, null, msgs);
      msgs = basicSetTargetCheck(newTargetCheck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.TARGET__TARGET_CHECK, newTargetCheck, newTargetCheck));
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
      case If22Package.TARGET__TARGET_CHECK:
        return basicSetTargetCheck(null, msgs);
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
      case If22Package.TARGET__NAME:
        return getName();
      case If22Package.TARGET__TARGET_CHECK:
        return getTargetCheck();
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
      case If22Package.TARGET__NAME:
        setName((String)newValue);
        return;
      case If22Package.TARGET__TARGET_CHECK:
        setTargetCheck((Expression)newValue);
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
      case If22Package.TARGET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case If22Package.TARGET__TARGET_CHECK:
        setTargetCheck((Expression)null);
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
      case If22Package.TARGET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case If22Package.TARGET__TARGET_CHECK:
        return targetCheck != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TargetImpl
