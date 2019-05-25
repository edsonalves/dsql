/**
 */
package dsql.impl;

import dsql.ConditionalExpression;
import dsql.DsqlPackage;
import dsql.Link;
import dsql.LogicalOperation;
import dsql.Query;
import dsql.QueryDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.QueryDiagramImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link dsql.impl.QueryDiagramImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link dsql.impl.QueryDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsql.impl.QueryDiagramImpl#getLogicalOperations <em>Logical Operations</em>}</li>
 *   <li>{@link dsql.impl.QueryDiagramImpl#getConditionalExpressions <em>Conditional Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDiagramImpl extends EObjectImpl implements QueryDiagram {
	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected String dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getLogicalOperations() <em>Logical Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalOperation> logicalOperations;

	/**
	 * The cached value of the '{@link #getConditionalExpressions() <em>Conditional Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression> conditionalExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.QUERY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(String newDataSource) {
		String oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY_DIAGRAM__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<Query>(Query.class, this, DsqlPackage.QUERY_DIAGRAM__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, DsqlPackage.QUERY_DIAGRAM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalOperation> getLogicalOperations() {
		if (logicalOperations == null) {
			logicalOperations = new EObjectContainmentEList<LogicalOperation>(LogicalOperation.class, this, DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS);
		}
		return logicalOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalExpression> getConditionalExpressions() {
		if (conditionalExpressions == null) {
			conditionalExpressions = new EObjectContainmentEList<ConditionalExpression>(ConditionalExpression.class, this, DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS);
		}
		return conditionalExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.QUERY_DIAGRAM__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
			case DsqlPackage.QUERY_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS:
				return ((InternalEList<?>)getLogicalOperations()).basicRemove(otherEnd, msgs);
			case DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS:
				return ((InternalEList<?>)getConditionalExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsqlPackage.QUERY_DIAGRAM__DATA_SOURCE:
				return getDataSource();
			case DsqlPackage.QUERY_DIAGRAM__QUERIES:
				return getQueries();
			case DsqlPackage.QUERY_DIAGRAM__LINKS:
				return getLinks();
			case DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS:
				return getLogicalOperations();
			case DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS:
				return getConditionalExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsqlPackage.QUERY_DIAGRAM__DATA_SOURCE:
				setDataSource((String)newValue);
				return;
			case DsqlPackage.QUERY_DIAGRAM__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends Query>)newValue);
				return;
			case DsqlPackage.QUERY_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS:
				getLogicalOperations().clear();
				getLogicalOperations().addAll((Collection<? extends LogicalOperation>)newValue);
				return;
			case DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS:
				getConditionalExpressions().clear();
				getConditionalExpressions().addAll((Collection<? extends ConditionalExpression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsqlPackage.QUERY_DIAGRAM__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case DsqlPackage.QUERY_DIAGRAM__QUERIES:
				getQueries().clear();
				return;
			case DsqlPackage.QUERY_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS:
				getLogicalOperations().clear();
				return;
			case DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS:
				getConditionalExpressions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsqlPackage.QUERY_DIAGRAM__DATA_SOURCE:
				return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
			case DsqlPackage.QUERY_DIAGRAM__QUERIES:
				return queries != null && !queries.isEmpty();
			case DsqlPackage.QUERY_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case DsqlPackage.QUERY_DIAGRAM__LOGICAL_OPERATIONS:
				return logicalOperations != null && !logicalOperations.isEmpty();
			case DsqlPackage.QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS:
				return conditionalExpressions != null && !conditionalExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //QueryDiagramImpl
