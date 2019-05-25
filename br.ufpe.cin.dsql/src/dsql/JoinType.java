/**
 */
package dsql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Join Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsql.DsqlPackage#getJoinType()
 * @model
 * @generated
 */
public enum JoinType implements Enumerator {
	/**
	 * The '<em><b>Inner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INNER_VALUE
	 * @generated
	 * @ordered
	 */
	INNER(0, "Inner", "Inner"),

	/**
	 * The '<em><b>Full Outer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_OUTER(1, "FullOuter", "FullOuter"),

	/**
	 * The '<em><b>Left Outer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_OUTER(2, "LeftOuter", "LeftOuter"),

	/**
	 * The '<em><b>Right Outer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_OUTER(3, "RightOuter", "RightOuter"),

	/**
	 * The '<em><b>Full Outer Excluding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_EXCLUDING_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_OUTER_EXCLUDING(4, "FullOuterExcluding", "FullOuterExcluding"),

	/**
	 * The '<em><b>Left Outer Excluding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_EXCLUDING_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_OUTER_EXCLUDING(5, "LeftOuterExcluding", "LeftOuterExcluding"),

	/**
	 * The '<em><b>Right Outer Excluding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER_EXCLUDING_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_OUTER_EXCLUDING(6, "RightOuterExcluding", "RightOuterExcluding"),

	/**
	 * The '<em><b>Semi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI(7, "Semi", "Semi"),

	/**
	 * The '<em><b>Anti</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTI_VALUE
	 * @generated
	 * @ordered
	 */
	ANTI(8, "Anti", "Anti"),

	/**
	 * The '<em><b>Division</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVISION_VALUE
	 * @generated
	 * @ordered
	 */
	DIVISION(9, "Division", "Division");

	/**
	 * The '<em><b>Inner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INNER
	 * @model name="Inner"
	 * @generated
	 * @ordered
	 */
	public static final int INNER_VALUE = 0;

	/**
	 * The '<em><b>Full Outer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Outer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER
	 * @model name="FullOuter"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_OUTER_VALUE = 1;

	/**
	 * The '<em><b>Left Outer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Outer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER
	 * @model name="LeftOuter"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_OUTER_VALUE = 2;

	/**
	 * The '<em><b>Right Outer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Outer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER
	 * @model name="RightOuter"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_OUTER_VALUE = 3;

	/**
	 * The '<em><b>Full Outer Excluding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Outer Excluding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_EXCLUDING
	 * @model name="FullOuterExcluding"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_OUTER_EXCLUDING_VALUE = 4;

	/**
	 * The '<em><b>Left Outer Excluding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Outer Excluding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_EXCLUDING
	 * @model name="LeftOuterExcluding"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_OUTER_EXCLUDING_VALUE = 5;

	/**
	 * The '<em><b>Right Outer Excluding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Outer Excluding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER_EXCLUDING
	 * @model name="RightOuterExcluding"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_OUTER_EXCLUDING_VALUE = 6;

	/**
	 * The '<em><b>Semi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMI
	 * @model name="Semi"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_VALUE = 7;

	/**
	 * The '<em><b>Anti</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anti</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTI
	 * @model name="Anti"
	 * @generated
	 * @ordered
	 */
	public static final int ANTI_VALUE = 8;

	/**
	 * The '<em><b>Division</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Division</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVISION
	 * @model name="Division"
	 * @generated
	 * @ordered
	 */
	public static final int DIVISION_VALUE = 9;

	/**
	 * An array of all the '<em><b>Join Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JoinType[] VALUES_ARRAY =
		new JoinType[] {
			INNER,
			FULL_OUTER,
			LEFT_OUTER,
			RIGHT_OUTER,
			FULL_OUTER_EXCLUDING,
			LEFT_OUTER_EXCLUDING,
			RIGHT_OUTER_EXCLUDING,
			SEMI,
			ANTI,
			DIVISION,
		};

	/**
	 * A public read-only list of all the '<em><b>Join Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JoinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Join Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JoinType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Join Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JoinType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Join Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinType get(int value) {
		switch (value) {
			case INNER_VALUE: return INNER;
			case FULL_OUTER_VALUE: return FULL_OUTER;
			case LEFT_OUTER_VALUE: return LEFT_OUTER;
			case RIGHT_OUTER_VALUE: return RIGHT_OUTER;
			case FULL_OUTER_EXCLUDING_VALUE: return FULL_OUTER_EXCLUDING;
			case LEFT_OUTER_EXCLUDING_VALUE: return LEFT_OUTER_EXCLUDING;
			case RIGHT_OUTER_EXCLUDING_VALUE: return RIGHT_OUTER_EXCLUDING;
			case SEMI_VALUE: return SEMI;
			case ANTI_VALUE: return ANTI;
			case DIVISION_VALUE: return DIVISION;
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
	private JoinType(int value, String name, String literal) {
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
	
} //JoinType
