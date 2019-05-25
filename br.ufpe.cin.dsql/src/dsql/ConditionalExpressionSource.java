/**
 */
package dsql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.ConditionalExpressionSource#getConditionalExpressionLink <em>Conditional Expression Link</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getConditionalExpressionSource()
 * @model abstract="true"
 * @generated
 */
public interface ConditionalExpressionSource extends EObject {

	/**
	 * Returns the value of the '<em><b>Conditional Expression Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.ConditionalExpressionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression Link</em>' reference.
	 * @see #setConditionalExpressionLink(ConditionalExpressionLink)
	 * @see dsql.DsqlPackage#getConditionalExpressionSource_ConditionalExpressionLink()
	 * @see dsql.ConditionalExpressionLink#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	ConditionalExpressionLink getConditionalExpressionLink();

	/**
	 * Sets the value of the '{@link dsql.ConditionalExpressionSource#getConditionalExpressionLink <em>Conditional Expression Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Expression Link</em>' reference.
	 * @see #getConditionalExpressionLink()
	 * @generated
	 */
	void setConditionalExpressionLink(ConditionalExpressionLink value);
} // ConditionalExpressionSource
