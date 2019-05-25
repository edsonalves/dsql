/**
 */
package dsql.tests;

import dsql.DsqlFactory;
import dsql.JoinConditionLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join Condition Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinConditionLinkTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JoinConditionLinkTest.class);
	}

	/**
	 * Constructs a new Join Condition Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinConditionLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Join Condition Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JoinConditionLink getFixture() {
		return (JoinConditionLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DsqlFactory.eINSTANCE.createJoinConditionLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //JoinConditionLinkTest
