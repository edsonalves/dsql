/**
 */
package dsql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsql.DsqlPackage#getBinaryOp()
 * @model
 * @generated not
 */
public enum BinaryOp implements Enumerator {
	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(0, "=", "="),

	/**
	 * The '<em><b>Not Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUALS(1, "<>", "<>"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(2, ">", ">"),

	/**
	 * The '<em><b>Greater Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_OR_EQUALS(3, ">=", ">="),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(4, "<", "<"),

	/**
	 * The '<em><b>Less Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_OR_EQUALS(5, "<=", "<="),

	/**
	 * The '<em><b>Addition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITION(6, "+", "+"),

	/**
	 * The '<em><b>Subtraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACTION(7, "-", "-"),

	/**
	 * The '<em><b>Multiplication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICATION(8, "*", "*"),

	/**
	 * The '<em><b>Divison</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVISON_VALUE
	 * @generated
	 * @ordered
	 */
	DIVISON(9, "/", "/"),

	/**
	 * The '<em><b>Concatenation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCATENATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONCATENATION(10, "||", "||"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(11, "In", "In"),

	/**
	 * The '<em><b>Like</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE(12, "Like", "Like"),

	/**
	 * The '<em><b>Similar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMILAR_VALUE
	 * @generated
	 * @ordered
	 */
	SIMILAR(13, "Similar", "Similar"),

	/**
	 * The '<em><b>Overlaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPS(14, "Overlaps", "Overlaps"),

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(15, "Any", "Any"),

	/**
	 * The '<em><b>Any Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_EQUALS(16, "= Any", "= Any"),

	/**
	 * The '<em><b>Any Not Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_NOT_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_NOT_EQUALS(17, "<> Any", "<> Any"),

	/**
	 * The '<em><b>Any Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_GREATER_THAN(18, "> Any", "> Any"),

	/**
	 * The '<em><b>Any Greater Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_GREATER_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_GREATER_THAN_OR_EQUALS(19, ">= Any", ">= Any"),

	/**
	 * The '<em><b>Any Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_LESS_THAN(20, "< Any", "< Any"),

	/**
	 * The '<em><b>Any Less Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LESS_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_LESS_THAN_OR_EQUALS(21, "<= Any", "<= Any"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(22, "All", "All"),

	/**
	 * The '<em><b>All Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_EQUALS(23, "= All", "= All"),

	/**
	 * The '<em><b>All Not Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_NOT_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_NOT_EQUALS(24, "<> All", "<> All"),

	/**
	 * The '<em><b>All Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_GREATER_THAN(25, "> All", "> All"),

	/**
	 * The '<em><b>All Greater Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_GREATER_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_GREATER_THAN_OR_EQUALS(26, ">= All", ">= All"),

	/**
	 * The '<em><b>All Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_LESS_THAN(27, "< All", "< All"),

	/**
	 * The '<em><b>All Less Than Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LESS_THAN_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_LESS_THAN_OR_EQUALS(28, "<= All", "<= All"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(99, "", "");

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="Equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 0;

	/**
	 * The '<em><b>Not Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUALS
	 * @model name="NotEquals"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUALS_VALUE = 1;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model name="GreaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 2;

	/**
	 * The '<em><b>Greater Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUALS
	 * @model name="GreaterThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_OR_EQUALS_VALUE = 3;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 4;

	/**
	 * The '<em><b>Less Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUALS
	 * @model name="LessThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_OR_EQUALS_VALUE = 5;

	/**
	 * The '<em><b>Addition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Addition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITION
	 * @model name="Addition"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITION_VALUE = 6;

	/**
	 * The '<em><b>Subtraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subtraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTION
	 * @model name="Subtraction"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACTION_VALUE = 7;

	/**
	 * The '<em><b>Multiplication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION
	 * @model name="Multiplication"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICATION_VALUE = 8;

	/**
	 * The '<em><b>Divison</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divison</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVISON
	 * @model name="Divison"
	 * @generated
	 * @ordered
	 */
	public static final int DIVISON_VALUE = 9;

	/**
	 * The '<em><b>Concatenation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concatenation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCATENATION
	 * @model name="Concatenation"
	 * @generated
	 * @ordered
	 */
	public static final int CONCATENATION_VALUE = 10;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model name="In"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 11;

	/**
	 * The '<em><b>Like</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Like</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @model name="Like"
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_VALUE = 12;

	/**
	 * The '<em><b>Similar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Similar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMILAR
	 * @model name="Similar"
	 * @generated
	 * @ordered
	 */
	public static final int SIMILAR_VALUE = 13;

	/**
	 * The '<em><b>Overlaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlaps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS
	 * @model name="Overlaps"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPS_VALUE = 14;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 15;

	/**
	 * The '<em><b>Any Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_EQUALS
	 * @model name="AnyEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_EQUALS_VALUE = 16;

	/**
	 * The '<em><b>Any Not Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Not Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_NOT_EQUALS
	 * @model name="AnyNotEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_NOT_EQUALS_VALUE = 17;

	/**
	 * The '<em><b>Any Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Greater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_GREATER_THAN
	 * @model name="AnyGreaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_GREATER_THAN_VALUE = 18;

	/**
	 * The '<em><b>Any Greater Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Greater Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_GREATER_THAN_OR_EQUALS
	 * @model name="AnyGreaterThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_GREATER_THAN_OR_EQUALS_VALUE = 19;

	/**
	 * The '<em><b>Any Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LESS_THAN
	 * @model name="AnyLessThan"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_LESS_THAN_VALUE = 20;

	/**
	 * The '<em><b>Any Less Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Less Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LESS_THAN_OR_EQUALS
	 * @model name="AnyLessThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_LESS_THAN_OR_EQUALS_VALUE = 21;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="All"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 22;

	/**
	 * The '<em><b>All Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_EQUALS
	 * @model name="AllEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_EQUALS_VALUE = 23;

	/**
	 * The '<em><b>All Not Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Not Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_NOT_EQUALS
	 * @model name="AllNotEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_NOT_EQUALS_VALUE = 24;

	/**
	 * The '<em><b>All Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Greater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_GREATER_THAN
	 * @model name="AllGreaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_GREATER_THAN_VALUE = 25;

	/**
	 * The '<em><b>All Greater Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Greater Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_GREATER_THAN_OR_EQUALS
	 * @model name="AllGreaterThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_GREATER_THAN_OR_EQUALS_VALUE = 26;

	/**
	 * The '<em><b>All Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_LESS_THAN
	 * @model name="AllLessThan"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_LESS_THAN_VALUE = 27;

	/**
	 * The '<em><b>All Less Than Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Less Than Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_LESS_THAN_OR_EQUALS
	 * @model name="AllLessThanOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_LESS_THAN_OR_EQUALS_VALUE = 28;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 99;

	/**
	 * An array of all the '<em><b>Binary Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryOp[] VALUES_ARRAY =
		new BinaryOp[] {
			EQUALS,
			NOT_EQUALS,
			GREATER_THAN,
			GREATER_THAN_OR_EQUALS,
			LESS_THAN,
			LESS_THAN_OR_EQUALS,
			ADDITION,
			SUBTRACTION,
			MULTIPLICATION,
			DIVISON,
			CONCATENATION,
			IN,
			LIKE,
			SIMILAR,
			OVERLAPS,
			ANY,
			ANY_EQUALS,
			ANY_NOT_EQUALS,
			ANY_GREATER_THAN,
			ANY_GREATER_THAN_OR_EQUALS,
			ANY_LESS_THAN,
			ANY_LESS_THAN_OR_EQUALS,
			ALL,
			ALL_EQUALS,
			ALL_NOT_EQUALS,
			ALL_GREATER_THAN,
			ALL_GREATER_THAN_OR_EQUALS,
			ALL_LESS_THAN,
			ALL_LESS_THAN_OR_EQUALS,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Binary Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Op</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Op</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Op</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOp get(int value) {
		switch (value) {
			case EQUALS_VALUE: return EQUALS;
			case NOT_EQUALS_VALUE: return NOT_EQUALS;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case GREATER_THAN_OR_EQUALS_VALUE: return GREATER_THAN_OR_EQUALS;
			case LESS_THAN_VALUE: return LESS_THAN;
			case LESS_THAN_OR_EQUALS_VALUE: return LESS_THAN_OR_EQUALS;
			case ADDITION_VALUE: return ADDITION;
			case SUBTRACTION_VALUE: return SUBTRACTION;
			case MULTIPLICATION_VALUE: return MULTIPLICATION;
			case DIVISON_VALUE: return DIVISON;
			case CONCATENATION_VALUE: return CONCATENATION;
			case IN_VALUE: return IN;
			case LIKE_VALUE: return LIKE;
			case SIMILAR_VALUE: return SIMILAR;
			case OVERLAPS_VALUE: return OVERLAPS;
			case ANY_VALUE: return ANY;
			case ANY_EQUALS_VALUE: return ANY_EQUALS;
			case ANY_NOT_EQUALS_VALUE: return ANY_NOT_EQUALS;
			case ANY_GREATER_THAN_VALUE: return ANY_GREATER_THAN;
			case ANY_GREATER_THAN_OR_EQUALS_VALUE: return ANY_GREATER_THAN_OR_EQUALS;
			case ANY_LESS_THAN_VALUE: return ANY_LESS_THAN;
			case ANY_LESS_THAN_OR_EQUALS_VALUE: return ANY_LESS_THAN_OR_EQUALS;
			case ALL_VALUE: return ALL;
			case ALL_EQUALS_VALUE: return ALL_EQUALS;
			case ALL_NOT_EQUALS_VALUE: return ALL_NOT_EQUALS;
			case ALL_GREATER_THAN_VALUE: return ALL_GREATER_THAN;
			case ALL_GREATER_THAN_OR_EQUALS_VALUE: return ALL_GREATER_THAN_OR_EQUALS;
			case ALL_LESS_THAN_VALUE: return ALL_LESS_THAN;
			case ALL_LESS_THAN_OR_EQUALS_VALUE: return ALL_LESS_THAN_OR_EQUALS;
			case NONE_VALUE: return NONE;
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
	private BinaryOp(int value, String name, String literal) {
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
	
} //BinaryOp
