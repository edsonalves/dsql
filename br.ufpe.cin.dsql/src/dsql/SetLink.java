/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.SetLink#getSetQuantifier <em>Set Quantifier</em>}</li>
 *   <li>{@link dsql.SetLink#getSetOperator <em>Set Operator</em>}</li>
 *   <li>{@link dsql.SetLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.SetLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getSetLink()
 * @model annotation="gmf.link style='dash' target.decoration='filledclosedarrow' label='setOperator'"
 * @generated
 */
public interface SetLink extends Link {
	/**
	 * Returns the value of the '<em><b>Set Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.SetQuantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Quantifier</em>' attribute.
	 * @see dsql.SetQuantifier
	 * @see #setSetQuantifier(SetQuantifier)
	 * @see dsql.DsqlPackage#getSetLink_SetQuantifier()
	 * @model
	 * @generated
	 */
	SetQuantifier getSetQuantifier();

	/**
	 * Sets the value of the '{@link dsql.SetLink#getSetQuantifier <em>Set Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Quantifier</em>' attribute.
	 * @see dsql.SetQuantifier
	 * @see #getSetQuantifier()
	 * @generated
	 */
	void setSetQuantifier(SetQuantifier value);

	/**
	 * Returns the value of the '<em><b>Set Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.SetOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Operator</em>' attribute.
	 * @see dsql.SetOperator
	 * @see #setSetOperator(SetOperator)
	 * @see dsql.DsqlPackage#getSetLink_SetOperator()
	 * @model
	 * @generated
	 */
	SetOperator getSetOperator();

	/**
	 * Sets the value of the '{@link dsql.SetLink#getSetOperator <em>Set Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Operator</em>' attribute.
	 * @see dsql.SetOperator
	 * @see #getSetOperator()
	 * @generated
	 */
	void setSetOperator(SetOperator value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Query)
	 * @see dsql.DsqlPackage#getSetLink_Source()
	 * @model required="true"
	 * @generated
	 */
	Query getSource();

	/**
	 * Sets the value of the '{@link dsql.SetLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Query value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Query)
	 * @see dsql.DsqlPackage#getSetLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Query getTarget();

	/**
	 * Sets the value of the '{@link dsql.SetLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Query value);

} // SetLink
