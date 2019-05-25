/**
 */
package dsql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Column Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsql.DsqlPackage#getColumnType()
 * @model
 * @generated
 */
public enum ColumnType implements Enumerator {
	/**
	 * The '<em><b>Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD(0, "Field", "Field"),

	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(1, "Literal", "Literal"),

	/**
	 * The '<em><b>Free Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_EXPRESSION(2, "FreeExpression", "FreeExpression"),

	/**
	 * The '<em><b>Logical Connective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_CONNECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_CONNECTIVE(3, "LogicalConnective", "LogicalConnective"),

	/**
	 * The '<em><b>Conditional Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITIONAL_EXPRESSION(4, "ConditionalExpression", "ConditionalExpression"),

	/**
	 * The '<em><b>Subquery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBQUERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBQUERY(5, "Subquery", "Subquery");

	/**
	 * The '<em><b>Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Field</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD
	 * @model name="Field"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_VALUE = 0;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model name="Literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 1;

	/**
	 * The '<em><b>Free Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Free Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE_EXPRESSION
	 * @model name="FreeExpression"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_EXPRESSION_VALUE = 2;

	/**
	 * The '<em><b>Logical Connective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logical Connective</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_CONNECTIVE
	 * @model name="LogicalConnective"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_CONNECTIVE_VALUE = 3;

	/**
	 * The '<em><b>Conditional Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conditional Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_EXPRESSION
	 * @model name="ConditionalExpression"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL_EXPRESSION_VALUE = 4;

	/**
	 * The '<em><b>Subquery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subquery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBQUERY
	 * @model name="Subquery"
	 * @generated
	 * @ordered
	 */
	public static final int SUBQUERY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Column Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColumnType[] VALUES_ARRAY =
		new ColumnType[] {
			FIELD,
			LITERAL,
			FREE_EXPRESSION,
			LOGICAL_CONNECTIVE,
			CONDITIONAL_EXPRESSION,
			SUBQUERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Column Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColumnType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Column Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColumnType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Column Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColumnType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Column Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColumnType get(int value) {
		switch (value) {
			case FIELD_VALUE: return FIELD;
			case LITERAL_VALUE: return LITERAL;
			case FREE_EXPRESSION_VALUE: return FREE_EXPRESSION;
			case LOGICAL_CONNECTIVE_VALUE: return LOGICAL_CONNECTIVE;
			case CONDITIONAL_EXPRESSION_VALUE: return CONDITIONAL_EXPRESSION;
			case SUBQUERY_VALUE: return SUBQUERY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ColumnType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ColumnType
