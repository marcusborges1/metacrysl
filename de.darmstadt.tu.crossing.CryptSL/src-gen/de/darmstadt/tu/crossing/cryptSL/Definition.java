/**
 * generated by Xtext 2.18.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Definition#getMetaVariable <em>Meta Variable</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Definition#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Variable</em>' attribute.
   * @see #setMetaVariable(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getDefinition_MetaVariable()
   * @model
   * @generated
   */
  String getMetaVariable();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Definition#getMetaVariable <em>Meta Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Variable</em>' attribute.
   * @see #getMetaVariable()
   * @generated
   */
  void setMetaVariable(String value);

  /**
   * Returns the value of the '<em><b>Algorithms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithms</em>' containment reference.
   * @see #setAlgorithms(LitList)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getDefinition_Algorithms()
   * @model containment="true"
   * @generated
   */
  LitList getAlgorithms();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Definition#getAlgorithms <em>Algorithms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithms</em>' containment reference.
   * @see #getAlgorithms()
   * @generated
   */
  void setAlgorithms(LitList value);

} // Definition
