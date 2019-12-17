/**
 * generated by Xtext 2.18.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.RequiredBlock#getReq_event <em>Req event</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getRequiredBlock()
 * @model
 * @generated
 */
public interface RequiredBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Req event</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req event</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getRequiredBlock_Req_event()
   * @model containment="true"
   * @generated
   */
  EList<Event> getReq_event();

} // RequiredBlock
