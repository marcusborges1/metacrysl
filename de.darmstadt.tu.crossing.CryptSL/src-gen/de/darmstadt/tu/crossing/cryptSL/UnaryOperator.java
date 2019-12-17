/**
 * generated by Xtext 2.18.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.UnaryOperator#getNOT <em>NOT</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getUnaryOperator()
 * @model
 * @generated
 */
public interface UnaryOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>NOT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NOT</em>' attribute.
   * @see #setNOT(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getUnaryOperator_NOT()
   * @model
   * @generated
   */
  String getNOT();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.UnaryOperator#getNOT <em>NOT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NOT</em>' attribute.
   * @see #getNOT()
   * @generated
   */
  void setNOT(String value);

} // UnaryOperator
