/**
 * generated by Xtext 2.18.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.DestroysBlock;
import de.darmstadt.tu.crossing.cryptSL.EnforceConsBlock;
import de.darmstadt.tu.crossing.cryptSL.EnsuresBlock;
import de.darmstadt.tu.crossing.cryptSL.Expression;
import de.darmstadt.tu.crossing.cryptSL.ForbiddenBlock;
import de.darmstadt.tu.crossing.cryptSL.MetaCrysl;
import de.darmstadt.tu.crossing.cryptSL.RequiredBlock;
import de.darmstadt.tu.crossing.cryptSL.RequiresBlock;
import de.darmstadt.tu.crossing.cryptSL.UseBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Crysl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getArray <em>Array</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getForbEvent <em>Forb Event</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getReq_events <em>Req events</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getReqConstraints <em>Req Constraints</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getEnsure <em>Ensure</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MetaCryslImpl#getDestroy <em>Destroy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaCryslImpl extends DomainmodelImpl implements MetaCrysl
{
  /**
   * The default value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected static final String ARRAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected String array = ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #getGenericType() <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected String genericType = GENERIC_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsage()
   * @generated
   * @ordered
   */
  protected UseBlock usage;

  /**
   * The cached value of the '{@link #getForbEvent() <em>Forb Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForbEvent()
   * @generated
   * @ordered
   */
  protected ForbiddenBlock forbEvent;

  /**
   * The cached value of the '{@link #getReq_events() <em>Req events</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq_events()
   * @generated
   * @ordered
   */
  protected RequiredBlock req_events;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected Expression order;

  /**
   * The cached value of the '{@link #getReqConstraints() <em>Req Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqConstraints()
   * @generated
   * @ordered
   */
  protected EnforceConsBlock reqConstraints;

  /**
   * The cached value of the '{@link #getRequire() <em>Require</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequire()
   * @generated
   * @ordered
   */
  protected RequiresBlock require;

  /**
   * The cached value of the '{@link #getEnsure() <em>Ensure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnsure()
   * @generated
   * @ordered
   */
  protected EnsuresBlock ensure;

  /**
   * The cached value of the '{@link #getDestroy() <em>Destroy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestroy()
   * @generated
   * @ordered
   */
  protected DestroysBlock destroy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaCryslImpl()
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
    return CryptSLPackage.Literals.META_CRYSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(String newArray)
  {
    String oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGenericType()
  {
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGenericType(String newGenericType)
  {
    String oldGenericType = genericType;
    genericType = newGenericType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__GENERIC_TYPE, oldGenericType, genericType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseBlock getUsage()
  {
    return usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsage(UseBlock newUsage, NotificationChain msgs)
  {
    UseBlock oldUsage = usage;
    usage = newUsage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__USAGE, oldUsage, newUsage);
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
  public void setUsage(UseBlock newUsage)
  {
    if (newUsage != usage)
    {
      NotificationChain msgs = null;
      if (usage != null)
        msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__USAGE, null, msgs);
      if (newUsage != null)
        msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__USAGE, null, msgs);
      msgs = basicSetUsage(newUsage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__USAGE, newUsage, newUsage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForbiddenBlock getForbEvent()
  {
    return forbEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForbEvent(ForbiddenBlock newForbEvent, NotificationChain msgs)
  {
    ForbiddenBlock oldForbEvent = forbEvent;
    forbEvent = newForbEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__FORB_EVENT, oldForbEvent, newForbEvent);
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
  public void setForbEvent(ForbiddenBlock newForbEvent)
  {
    if (newForbEvent != forbEvent)
    {
      NotificationChain msgs = null;
      if (forbEvent != null)
        msgs = ((InternalEObject)forbEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__FORB_EVENT, null, msgs);
      if (newForbEvent != null)
        msgs = ((InternalEObject)newForbEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__FORB_EVENT, null, msgs);
      msgs = basicSetForbEvent(newForbEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__FORB_EVENT, newForbEvent, newForbEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequiredBlock getReq_events()
  {
    return req_events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReq_events(RequiredBlock newReq_events, NotificationChain msgs)
  {
    RequiredBlock oldReq_events = req_events;
    req_events = newReq_events;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQ_EVENTS, oldReq_events, newReq_events);
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
  public void setReq_events(RequiredBlock newReq_events)
  {
    if (newReq_events != req_events)
    {
      NotificationChain msgs = null;
      if (req_events != null)
        msgs = ((InternalEObject)req_events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQ_EVENTS, null, msgs);
      if (newReq_events != null)
        msgs = ((InternalEObject)newReq_events).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQ_EVENTS, null, msgs);
      msgs = basicSetReq_events(newReq_events, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQ_EVENTS, newReq_events, newReq_events));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(Expression newOrder, NotificationChain msgs)
  {
    Expression oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__ORDER, oldOrder, newOrder);
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
  public void setOrder(Expression newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__ORDER, newOrder, newOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnforceConsBlock getReqConstraints()
  {
    return reqConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReqConstraints(EnforceConsBlock newReqConstraints, NotificationChain msgs)
  {
    EnforceConsBlock oldReqConstraints = reqConstraints;
    reqConstraints = newReqConstraints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS, oldReqConstraints, newReqConstraints);
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
  public void setReqConstraints(EnforceConsBlock newReqConstraints)
  {
    if (newReqConstraints != reqConstraints)
    {
      NotificationChain msgs = null;
      if (reqConstraints != null)
        msgs = ((InternalEObject)reqConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS, null, msgs);
      if (newReqConstraints != null)
        msgs = ((InternalEObject)newReqConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS, null, msgs);
      msgs = basicSetReqConstraints(newReqConstraints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS, newReqConstraints, newReqConstraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequiresBlock getRequire()
  {
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequire(RequiresBlock newRequire, NotificationChain msgs)
  {
    RequiresBlock oldRequire = require;
    require = newRequire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQUIRE, oldRequire, newRequire);
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
  public void setRequire(RequiresBlock newRequire)
  {
    if (newRequire != require)
    {
      NotificationChain msgs = null;
      if (require != null)
        msgs = ((InternalEObject)require).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQUIRE, null, msgs);
      if (newRequire != null)
        msgs = ((InternalEObject)newRequire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__REQUIRE, null, msgs);
      msgs = basicSetRequire(newRequire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__REQUIRE, newRequire, newRequire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnsuresBlock getEnsure()
  {
    return ensure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnsure(EnsuresBlock newEnsure, NotificationChain msgs)
  {
    EnsuresBlock oldEnsure = ensure;
    ensure = newEnsure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__ENSURE, oldEnsure, newEnsure);
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
  public void setEnsure(EnsuresBlock newEnsure)
  {
    if (newEnsure != ensure)
    {
      NotificationChain msgs = null;
      if (ensure != null)
        msgs = ((InternalEObject)ensure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__ENSURE, null, msgs);
      if (newEnsure != null)
        msgs = ((InternalEObject)newEnsure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__ENSURE, null, msgs);
      msgs = basicSetEnsure(newEnsure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__ENSURE, newEnsure, newEnsure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DestroysBlock getDestroy()
  {
    return destroy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestroy(DestroysBlock newDestroy, NotificationChain msgs)
  {
    DestroysBlock oldDestroy = destroy;
    destroy = newDestroy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__DESTROY, oldDestroy, newDestroy);
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
  public void setDestroy(DestroysBlock newDestroy)
  {
    if (newDestroy != destroy)
    {
      NotificationChain msgs = null;
      if (destroy != null)
        msgs = ((InternalEObject)destroy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__DESTROY, null, msgs);
      if (newDestroy != null)
        msgs = ((InternalEObject)newDestroy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.META_CRYSL__DESTROY, null, msgs);
      msgs = basicSetDestroy(newDestroy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.META_CRYSL__DESTROY, newDestroy, newDestroy));
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
      case CryptSLPackage.META_CRYSL__USAGE:
        return basicSetUsage(null, msgs);
      case CryptSLPackage.META_CRYSL__FORB_EVENT:
        return basicSetForbEvent(null, msgs);
      case CryptSLPackage.META_CRYSL__REQ_EVENTS:
        return basicSetReq_events(null, msgs);
      case CryptSLPackage.META_CRYSL__ORDER:
        return basicSetOrder(null, msgs);
      case CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS:
        return basicSetReqConstraints(null, msgs);
      case CryptSLPackage.META_CRYSL__REQUIRE:
        return basicSetRequire(null, msgs);
      case CryptSLPackage.META_CRYSL__ENSURE:
        return basicSetEnsure(null, msgs);
      case CryptSLPackage.META_CRYSL__DESTROY:
        return basicSetDestroy(null, msgs);
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
      case CryptSLPackage.META_CRYSL__ARRAY:
        return getArray();
      case CryptSLPackage.META_CRYSL__GENERIC_TYPE:
        return getGenericType();
      case CryptSLPackage.META_CRYSL__USAGE:
        return getUsage();
      case CryptSLPackage.META_CRYSL__FORB_EVENT:
        return getForbEvent();
      case CryptSLPackage.META_CRYSL__REQ_EVENTS:
        return getReq_events();
      case CryptSLPackage.META_CRYSL__ORDER:
        return getOrder();
      case CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS:
        return getReqConstraints();
      case CryptSLPackage.META_CRYSL__REQUIRE:
        return getRequire();
      case CryptSLPackage.META_CRYSL__ENSURE:
        return getEnsure();
      case CryptSLPackage.META_CRYSL__DESTROY:
        return getDestroy();
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
      case CryptSLPackage.META_CRYSL__ARRAY:
        setArray((String)newValue);
        return;
      case CryptSLPackage.META_CRYSL__GENERIC_TYPE:
        setGenericType((String)newValue);
        return;
      case CryptSLPackage.META_CRYSL__USAGE:
        setUsage((UseBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__FORB_EVENT:
        setForbEvent((ForbiddenBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__REQ_EVENTS:
        setReq_events((RequiredBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__ORDER:
        setOrder((Expression)newValue);
        return;
      case CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS:
        setReqConstraints((EnforceConsBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__REQUIRE:
        setRequire((RequiresBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__ENSURE:
        setEnsure((EnsuresBlock)newValue);
        return;
      case CryptSLPackage.META_CRYSL__DESTROY:
        setDestroy((DestroysBlock)newValue);
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
      case CryptSLPackage.META_CRYSL__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case CryptSLPackage.META_CRYSL__GENERIC_TYPE:
        setGenericType(GENERIC_TYPE_EDEFAULT);
        return;
      case CryptSLPackage.META_CRYSL__USAGE:
        setUsage((UseBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__FORB_EVENT:
        setForbEvent((ForbiddenBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__REQ_EVENTS:
        setReq_events((RequiredBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__ORDER:
        setOrder((Expression)null);
        return;
      case CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS:
        setReqConstraints((EnforceConsBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__REQUIRE:
        setRequire((RequiresBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__ENSURE:
        setEnsure((EnsuresBlock)null);
        return;
      case CryptSLPackage.META_CRYSL__DESTROY:
        setDestroy((DestroysBlock)null);
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
      case CryptSLPackage.META_CRYSL__ARRAY:
        return ARRAY_EDEFAULT == null ? array != null : !ARRAY_EDEFAULT.equals(array);
      case CryptSLPackage.META_CRYSL__GENERIC_TYPE:
        return GENERIC_TYPE_EDEFAULT == null ? genericType != null : !GENERIC_TYPE_EDEFAULT.equals(genericType);
      case CryptSLPackage.META_CRYSL__USAGE:
        return usage != null;
      case CryptSLPackage.META_CRYSL__FORB_EVENT:
        return forbEvent != null;
      case CryptSLPackage.META_CRYSL__REQ_EVENTS:
        return req_events != null;
      case CryptSLPackage.META_CRYSL__ORDER:
        return order != null;
      case CryptSLPackage.META_CRYSL__REQ_CONSTRAINTS:
        return reqConstraints != null;
      case CryptSLPackage.META_CRYSL__REQUIRE:
        return require != null;
      case CryptSLPackage.META_CRYSL__ENSURE:
        return ensure != null;
      case CryptSLPackage.META_CRYSL__DESTROY:
        return destroy != null;
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
    result.append(" (array: ");
    result.append(array);
    result.append(", genericType: ");
    result.append(genericType);
    result.append(')');
    return result.toString();
  }

} //MetaCryslImpl
