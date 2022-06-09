/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.if22.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.If22Package;
import org.xtext.example.if22.if22.Question;
import org.xtext.example.if22.if22.Target;
import org.xtext.example.if22.if22.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.if22.if22.impl.QuestionImpl#getQString <em>QString</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.QuestionImpl#getQType <em>QType</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.QuestionImpl#getReffedVar <em>Reffed Var</em>}</li>
 *   <li>{@link org.xtext.example.if22.if22.impl.QuestionImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends StatementImpl implements Question
{
  /**
   * The cached value of the '{@link #getQString() <em>QString</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQString()
   * @generated
   * @ordered
   */
  protected Expression qString;

  /**
   * The cached value of the '{@link #getQType() <em>QType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQType()
   * @generated
   * @ordered
   */
  protected Expression qType;

  /**
   * The cached value of the '{@link #getReffedVar() <em>Reffed Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReffedVar()
   * @generated
   * @ordered
   */
  protected VariableDeclaration reffedVar;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<Target> targets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return If22Package.Literals.QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getQString()
  {
    return qString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQString(Expression newQString, NotificationChain msgs)
  {
    Expression oldQString = qString;
    qString = newQString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, If22Package.QUESTION__QSTRING, oldQString, newQString);
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
  public void setQString(Expression newQString)
  {
    if (newQString != qString)
    {
      NotificationChain msgs = null;
      if (qString != null)
        msgs = ((InternalEObject)qString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - If22Package.QUESTION__QSTRING, null, msgs);
      if (newQString != null)
        msgs = ((InternalEObject)newQString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - If22Package.QUESTION__QSTRING, null, msgs);
      msgs = basicSetQString(newQString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.QUESTION__QSTRING, newQString, newQString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getQType()
  {
    return qType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQType(Expression newQType, NotificationChain msgs)
  {
    Expression oldQType = qType;
    qType = newQType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, If22Package.QUESTION__QTYPE, oldQType, newQType);
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
  public void setQType(Expression newQType)
  {
    if (newQType != qType)
    {
      NotificationChain msgs = null;
      if (qType != null)
        msgs = ((InternalEObject)qType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - If22Package.QUESTION__QTYPE, null, msgs);
      if (newQType != null)
        msgs = ((InternalEObject)newQType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - If22Package.QUESTION__QTYPE, null, msgs);
      msgs = basicSetQType(newQType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.QUESTION__QTYPE, newQType, newQType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration getReffedVar()
  {
    if (reffedVar != null && reffedVar.eIsProxy())
    {
      InternalEObject oldReffedVar = (InternalEObject)reffedVar;
      reffedVar = (VariableDeclaration)eResolveProxy(oldReffedVar);
      if (reffedVar != oldReffedVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, If22Package.QUESTION__REFFED_VAR, oldReffedVar, reffedVar));
      }
    }
    return reffedVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetReffedVar()
  {
    return reffedVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReffedVar(VariableDeclaration newReffedVar)
  {
    VariableDeclaration oldReffedVar = reffedVar;
    reffedVar = newReffedVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, If22Package.QUESTION__REFFED_VAR, oldReffedVar, reffedVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Target> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectContainmentEList<Target>(Target.class, this, If22Package.QUESTION__TARGETS);
    }
    return targets;
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
      case If22Package.QUESTION__QSTRING:
        return basicSetQString(null, msgs);
      case If22Package.QUESTION__QTYPE:
        return basicSetQType(null, msgs);
      case If22Package.QUESTION__TARGETS:
        return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
      case If22Package.QUESTION__QSTRING:
        return getQString();
      case If22Package.QUESTION__QTYPE:
        return getQType();
      case If22Package.QUESTION__REFFED_VAR:
        if (resolve) return getReffedVar();
        return basicGetReffedVar();
      case If22Package.QUESTION__TARGETS:
        return getTargets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case If22Package.QUESTION__QSTRING:
        setQString((Expression)newValue);
        return;
      case If22Package.QUESTION__QTYPE:
        setQType((Expression)newValue);
        return;
      case If22Package.QUESTION__REFFED_VAR:
        setReffedVar((VariableDeclaration)newValue);
        return;
      case If22Package.QUESTION__TARGETS:
        getTargets().clear();
        getTargets().addAll((Collection<? extends Target>)newValue);
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
      case If22Package.QUESTION__QSTRING:
        setQString((Expression)null);
        return;
      case If22Package.QUESTION__QTYPE:
        setQType((Expression)null);
        return;
      case If22Package.QUESTION__REFFED_VAR:
        setReffedVar((VariableDeclaration)null);
        return;
      case If22Package.QUESTION__TARGETS:
        getTargets().clear();
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
      case If22Package.QUESTION__QSTRING:
        return qString != null;
      case If22Package.QUESTION__QTYPE:
        return qType != null;
      case If22Package.QUESTION__REFFED_VAR:
        return reffedVar != null;
      case If22Package.QUESTION__TARGETS:
        return targets != null && !targets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QuestionImpl
