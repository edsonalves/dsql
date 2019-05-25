/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.JoinLink#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link dsql.JoinLink#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link dsql.JoinLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.JoinLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getJoinLink()
 * @model annotation="gmf.link style='dash' target.decoration='filledclosedarrow' label='joinType'"
 * @generated
 */
public interface JoinLink extends Link {
	/**
	 * Returns the value of the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #setForeignKeyName(String)
	 * @see dsql.DsqlPackage#getJoinLink_ForeignKeyName()
	 * @model
	 * @generated
	 */
	String getForeignKeyName();

	/**
	 * Sets the value of the '{@link dsql.JoinLink#getForeignKeyName <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #getForeignKeyName()
	 * @generated
	 */
	void setForeignKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Join Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.JoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Type</em>' attribute.
	 * @see dsql.JoinType
	 * @see #setJoinType(JoinType)
	 * @see dsql.DsqlPackage#getJoinLink_JoinType()
	 * @model
	 * @generated
	 */
	JoinType getJoinType();

	/**
	 * Sets the value of the '{@link dsql.JoinLink#getJoinType <em>Join Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Type</em>' attribute.
	 * @see dsql.JoinType
	 * @see #getJoinType()
	 * @generated
	 */
	void setJoinType(JoinType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see dsql.DsqlPackage#getJoinLink_Source()
	 * @model required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link dsql.JoinLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Source)
	 * @see dsql.DsqlPackage#getJoinLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Source getTarget();

	/**
	 * Sets the value of the '{@link dsql.JoinLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Source value);

} // JoinLink
