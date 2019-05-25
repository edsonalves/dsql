/**
 */
package dsql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.SubqueryTarget#getSubqueryLinkTarget <em>Subquery Link Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getSubqueryTarget()
 * @model abstract="true"
 * @generated
 */
public interface SubqueryTarget extends EObject {

	/**
	 * Returns the value of the '<em><b>Subquery Link Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.SubqueryLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subquery Link Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subquery Link Target</em>' reference.
	 * @see #setSubqueryLinkTarget(SubqueryLink)
	 * @see dsql.DsqlPackage#getSubqueryTarget_SubqueryLinkTarget()
	 * @see dsql.SubqueryLink#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	SubqueryLink getSubqueryLinkTarget();

	/**
	 * Sets the value of the '{@link dsql.SubqueryTarget#getSubqueryLinkTarget <em>Subquery Link Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subquery Link Target</em>' reference.
	 * @see #getSubqueryLinkTarget()
	 * @generated
	 */
	void setSubqueryLinkTarget(SubqueryLink value);
} // SubqueryTarget
