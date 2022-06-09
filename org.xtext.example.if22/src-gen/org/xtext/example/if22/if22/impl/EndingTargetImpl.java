/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.if22.if22.End;
import org.xtext.example.if22.if22.EndingTarget;
import org.xtext.example.if22.if22.If22Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ending Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.impl.EndingTargetImpl#getCallableEnd <em>Callable End</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.EndingTargetImpl#getSelfdefinedEnd <em>Selfdefined End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndingTargetImpl extends MinimalEObjectImpl.Container implements EndingTarget
{
  /**
   * The cached value of the '{@link #getCallableEnd() <em>Callable End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallableEnd()
   * @generated
   * @ordered
   */
  protected End callableEnd;

  /**
   * The cached value of the '{@link #getSelfdefinedEnd() <em>Selfdefined End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfdefinedEnd()
   * @generated
   * @ordered
   */
  protected End selfdefinedEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndingTargetImpl()
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
    return If22Package.Literals.ENDING_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End getCallableEnd()
  {
    if (callableEnd != null && callableEnd.eIsProxy())
    {
      InternalEObject oldCallableEnd = (InternalEObject)callableEnd;
      callableEnd = (End)eResolveProxy(oldCallableEnd);
      if (callableEnd != oldCallableEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, If22Package.ENDING_TARGET__CALLABLE_END, oldCallableEnd, callableEnd));
      }
    }
    return callableEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End basicGetCallableEnd()
  {
    return callableEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCallableEnd(End newCallableEnd)
  {
    End oldCallableEnd = callableEnd;
    callableEnd = newCallableEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.ENDING_TARGET__CALLABLE_END, oldCallableEnd, callableEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End getSelfdefinedEnd()
  {
    if (selfdefinedEnd != null && selfdefinedEnd.eIsProxy())
    {
      InternalEObject oldSelfdefinedEnd = (InternalEObject)selfdefinedEnd;
      selfdefinedEnd = (End)eResolveProxy(oldSelfdefinedEnd);
      if (selfdefinedEnd != oldSelfdefinedEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, If22Package.ENDING_TARGET__SELFDEFINED_END, oldSelfdefinedEnd, selfdefinedEnd));
      }
    }
    return selfdefinedEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End basicGetSelfdefinedEnd()
  {
    return selfdefinedEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelfdefinedEnd(End newSelfdefinedEnd)
  {
    End oldSelfdefinedEnd = selfdefinedEnd;
    selfdefinedEnd = newSelfdefinedEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.ENDING_TARGET__SELFDEFINED_END, oldSelfdefinedEnd, selfdefinedEnd));
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
      case If22Package.ENDING_TARGET__CALLABLE_END:
        if (resolve) return getCallableEnd();
        return basicGetCallableEnd();
      case If22Package.ENDING_TARGET__SELFDEFINED_END:
        if (resolve) return getSelfdefinedEnd();
        return basicGetSelfdefinedEnd();
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
      case If22Package.ENDING_TARGET__CALLABLE_END:
        setCallableEnd((End)newValue);
        return;
      case If22Package.ENDING_TARGET__SELFDEFINED_END:
        setSelfdefinedEnd((End)newValue);
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
      case If22Package.ENDING_TARGET__CALLABLE_END:
        setCallableEnd((End)null);
        return;
      case If22Package.ENDING_TARGET__SELFDEFINED_END:
        setSelfdefinedEnd((End)null);
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
      case If22Package.ENDING_TARGET__CALLABLE_END:
        return callableEnd != null;
      case If22Package.ENDING_TARGET__SELFDEFINED_END:
        return selfdefinedEnd != null;
    }
    return super.eIsSet(featureID);
  }

} //EndingTargetImpl
