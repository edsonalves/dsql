/*
 * 
 */
package dsql.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import dsql.DsqlPackage;
import dsql.diagram.edit.parts.BinaryOperation10EditPart;
import dsql.diagram.edit.parts.BinaryOperation11EditPart;
import dsql.diagram.edit.parts.BinaryOperation12EditPart;
import dsql.diagram.edit.parts.BinaryOperation13EditPart;
import dsql.diagram.edit.parts.BinaryOperation2EditPart;
import dsql.diagram.edit.parts.BinaryOperation3EditPart;
import dsql.diagram.edit.parts.BinaryOperation4EditPart;
import dsql.diagram.edit.parts.BinaryOperation5EditPart;
import dsql.diagram.edit.parts.BinaryOperation6EditPart;
import dsql.diagram.edit.parts.BinaryOperation7EditPart;
import dsql.diagram.edit.parts.BinaryOperation8EditPart;
import dsql.diagram.edit.parts.BinaryOperation9EditPart;
import dsql.diagram.edit.parts.BinaryOperationEditPart;
import dsql.diagram.edit.parts.ColumnName10EditPart;
import dsql.diagram.edit.parts.ColumnName11EditPart;
import dsql.diagram.edit.parts.ColumnName12EditPart;
import dsql.diagram.edit.parts.ColumnName13EditPart;
import dsql.diagram.edit.parts.ColumnName2EditPart;
import dsql.diagram.edit.parts.ColumnName3EditPart;
import dsql.diagram.edit.parts.ColumnName4EditPart;
import dsql.diagram.edit.parts.ColumnName5EditPart;
import dsql.diagram.edit.parts.ColumnName6EditPart;
import dsql.diagram.edit.parts.ColumnName7EditPart;
import dsql.diagram.edit.parts.ColumnName8EditPart;
import dsql.diagram.edit.parts.ColumnName9EditPart;
import dsql.diagram.edit.parts.ColumnNameEditPart;
import dsql.diagram.edit.parts.ElseLabelEditPart;
import dsql.diagram.edit.parts.JoinLinkJoinTypeEditPart;
import dsql.diagram.edit.parts.LogicalOperationTypeEditPart;
import dsql.diagram.edit.parts.QueryNameEditPart;
import dsql.diagram.edit.parts.SetLinkSetOperatorEditPart;
import dsql.diagram.edit.parts.SourceNameEditPart;
import dsql.diagram.edit.parts.SubqueryLinkOperationEditPart;
import dsql.diagram.edit.parts.TernaryOperation10EditPart;
import dsql.diagram.edit.parts.TernaryOperation11EditPart;
import dsql.diagram.edit.parts.TernaryOperation12EditPart;
import dsql.diagram.edit.parts.TernaryOperation13EditPart;
import dsql.diagram.edit.parts.TernaryOperation2EditPart;
import dsql.diagram.edit.parts.TernaryOperation3EditPart;
import dsql.diagram.edit.parts.TernaryOperation4EditPart;
import dsql.diagram.edit.parts.TernaryOperation5EditPart;
import dsql.diagram.edit.parts.TernaryOperation6EditPart;
import dsql.diagram.edit.parts.TernaryOperation7EditPart;
import dsql.diagram.edit.parts.TernaryOperation8EditPart;
import dsql.diagram.edit.parts.TernaryOperation9EditPart;
import dsql.diagram.edit.parts.TernaryOperationEditPart;
import dsql.diagram.edit.parts.UnaryOperation10EditPart;
import dsql.diagram.edit.parts.UnaryOperation11EditPart;
import dsql.diagram.edit.parts.UnaryOperation12EditPart;
import dsql.diagram.edit.parts.UnaryOperation13EditPart;
import dsql.diagram.edit.parts.UnaryOperation2EditPart;
import dsql.diagram.edit.parts.UnaryOperation3EditPart;
import dsql.diagram.edit.parts.UnaryOperation4EditPart;
import dsql.diagram.edit.parts.UnaryOperation5EditPart;
import dsql.diagram.edit.parts.UnaryOperation6EditPart;
import dsql.diagram.edit.parts.UnaryOperation7EditPart;
import dsql.diagram.edit.parts.UnaryOperation8EditPart;
import dsql.diagram.edit.parts.UnaryOperation9EditPart;
import dsql.diagram.edit.parts.UnaryOperationEditPart;
import dsql.diagram.edit.parts.WhenLabelEditPart;
import dsql.diagram.parsers.MessageFormatParser;
import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class DsqlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser whenLabel_5033Parser;

	/**
	* @generated
	*/
	private IParser getWhenLabel_5033Parser() {
		if (whenLabel_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getWhen_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whenLabel_5033Parser = parser;
		}
		return whenLabel_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser elseLabel_5038Parser;

	/**
	* @generated
	*/
	private IParser getElseLabel_5038Parser() {
		if (elseLabel_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getElse_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elseLabel_5038Parser = parser;
		}
		return elseLabel_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser queryName_5052Parser;

	/**
	* @generated
	*/
	private IParser getQueryName_5052Parser() {
		if (queryName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getQuery_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryName_5052Parser = parser;
		}
		return queryName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser logicalOperationType_5057Parser;

	/**
	* @generated
	*/
	private IParser getLogicalOperationType_5057Parser() {
		if (logicalOperationType_5057Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getLogicalOperation_Type();
			EnumParser parser = new EnumParser(editableFeature);
			logicalOperationType_5057Parser = parser;
		}
		return logicalOperationType_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5001Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5001Parser() {
		if (columnName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5001Parser = parser;
		}
		return columnName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5002Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5002Parser() {
		if (columnName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5002Parser = parser;
		}
		return columnName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5027Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5027Parser() {
		if (unaryOperation_5027Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5027Parser = parser;
		}
		return unaryOperation_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5003Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5003Parser() {
		if (columnName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5003Parser = parser;
		}
		return columnName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5026Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5026Parser() {
		if (unaryOperation_5026Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5026Parser = parser;
		}
		return unaryOperation_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5025Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5025Parser() {
		if (binaryOperation_5025Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5025Parser = parser;
		}
		return binaryOperation_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5004Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5004Parser() {
		if (columnName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5004Parser = parser;
		}
		return columnName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5005Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5005Parser() {
		if (columnName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5005Parser = parser;
		}
		return columnName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5024Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5024Parser() {
		if (unaryOperation_5024Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5024Parser = parser;
		}
		return unaryOperation_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5023Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5023Parser() {
		if (ternaryOperation_5023Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5023Parser = parser;
		}
		return ternaryOperation_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5006Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5006Parser() {
		if (columnName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5006Parser = parser;
		}
		return columnName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5007Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5007Parser() {
		if (columnName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5007Parser = parser;
		}
		return columnName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5008Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5008Parser() {
		if (columnName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5008Parser = parser;
		}
		return columnName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5009Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5009Parser() {
		if (unaryOperation_5009Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5009Parser = parser;
		}
		return unaryOperation_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5022Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5022Parser() {
		if (binaryOperation_5022Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5022Parser = parser;
		}
		return binaryOperation_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5021Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5021Parser() {
		if (binaryOperation_5021Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5021Parser = parser;
		}
		return binaryOperation_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5020Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5020Parser() {
		if (ternaryOperation_5020Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5020Parser = parser;
		}
		return ternaryOperation_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5019Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5019Parser() {
		if (ternaryOperation_5019Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5019Parser = parser;
		}
		return ternaryOperation_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5010Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5010Parser() {
		if (unaryOperation_5010Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5010Parser = parser;
		}
		return unaryOperation_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5018Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5018Parser() {
		if (binaryOperation_5018Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5018Parser = parser;
		}
		return binaryOperation_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5011Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5011Parser() {
		if (unaryOperation_5011Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5011Parser = parser;
		}
		return unaryOperation_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5017Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5017Parser() {
		if (binaryOperation_5017Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5017Parser = parser;
		}
		return binaryOperation_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5016Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5016Parser() {
		if (ternaryOperation_5016Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5016Parser = parser;
		}
		return ternaryOperation_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5015Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5015Parser() {
		if (ternaryOperation_5015Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5015Parser = parser;
		}
		return ternaryOperation_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5012Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5012Parser() {
		if (unaryOperation_5012Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5012Parser = parser;
		}
		return unaryOperation_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5013Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5013Parser() {
		if (binaryOperation_5013Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5013Parser = parser;
		}
		return binaryOperation_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5014Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5014Parser() {
		if (ternaryOperation_5014Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5014Parser = parser;
		}
		return ternaryOperation_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5028Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5028Parser() {
		if (binaryOperation_5028Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5028Parser = parser;
		}
		return binaryOperation_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5029Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5029Parser() {
		if (ternaryOperation_5029Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5029Parser = parser;
		}
		return ternaryOperation_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5030Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5030Parser() {
		if (unaryOperation_5030Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5030Parser = parser;
		}
		return unaryOperation_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5031Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5031Parser() {
		if (binaryOperation_5031Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5031Parser = parser;
		}
		return binaryOperation_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5032Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5032Parser() {
		if (ternaryOperation_5032Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5032Parser = parser;
		}
		return ternaryOperation_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5034Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5034Parser() {
		if (columnName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5034Parser = parser;
		}
		return columnName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5035Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5035Parser() {
		if (unaryOperation_5035Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5035Parser = parser;
		}
		return unaryOperation_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5036Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5036Parser() {
		if (binaryOperation_5036Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5036Parser = parser;
		}
		return binaryOperation_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5037Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5037Parser() {
		if (ternaryOperation_5037Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5037Parser = parser;
		}
		return ternaryOperation_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5039Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5039Parser() {
		if (columnName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5039Parser = parser;
		}
		return columnName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5040Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5040Parser() {
		if (columnName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5040Parser = parser;
		}
		return columnName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5041Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5041Parser() {
		if (columnName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5041Parser = parser;
		}
		return columnName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5042Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5042Parser() {
		if (unaryOperation_5042Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5042Parser = parser;
		}
		return unaryOperation_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5043Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5043Parser() {
		if (binaryOperation_5043Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5043Parser = parser;
		}
		return binaryOperation_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5044Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5044Parser() {
		if (ternaryOperation_5044Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5044Parser = parser;
		}
		return ternaryOperation_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5045Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5045Parser() {
		if (unaryOperation_5045Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5045Parser = parser;
		}
		return unaryOperation_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5046Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5046Parser() {
		if (binaryOperation_5046Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5046Parser = parser;
		}
		return binaryOperation_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5047Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5047Parser() {
		if (ternaryOperation_5047Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5047Parser = parser;
		}
		return ternaryOperation_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5048Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5048Parser() {
		if (unaryOperation_5048Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5048Parser = parser;
		}
		return unaryOperation_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5049Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5049Parser() {
		if (binaryOperation_5049Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5049Parser = parser;
		}
		return binaryOperation_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5050Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5050Parser() {
		if (ternaryOperation_5050Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5050Parser = parser;
		}
		return ternaryOperation_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser sourceName_5051Parser;

	/**
	* @generated
	*/
	private IParser getSourceName_5051Parser() {
		if (sourceName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getSource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sourceName_5051Parser = parser;
		}
		return sourceName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5053Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5053Parser() {
		if (columnName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { DsqlPackage.eINSTANCE.getColumnReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5053Parser = parser;
		}
		return columnName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser unaryOperation_5054Parser;

	/**
	* @generated
	*/
	private IParser getUnaryOperation_5054Parser() {
		if (unaryOperation_5054Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getUnary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			unaryOperation_5054Parser = parser;
		}
		return unaryOperation_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser binaryOperation_5055Parser;

	/**
	* @generated
	*/
	private IParser getBinaryOperation_5055Parser() {
		if (binaryOperation_5055Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getBinary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			binaryOperation_5055Parser = parser;
		}
		return binaryOperation_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser ternaryOperation_5056Parser;

	/**
	* @generated
	*/
	private IParser getTernaryOperation_5056Parser() {
		if (ternaryOperation_5056Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getTernary_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			ternaryOperation_5056Parser = parser;
		}
		return ternaryOperation_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser setLinkSetOperator_6001Parser;

	/**
	* @generated
	*/
	private IParser getSetLinkSetOperator_6001Parser() {
		if (setLinkSetOperator_6001Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getSetLink_SetOperator();
			EnumParser parser = new EnumParser(editableFeature);
			setLinkSetOperator_6001Parser = parser;
		}
		return setLinkSetOperator_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser joinLinkJoinType_6002Parser;

	/**
	* @generated
	*/
	private IParser getJoinLinkJoinType_6002Parser() {
		if (joinLinkJoinType_6002Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getJoinLink_JoinType();
			EnumParser parser = new EnumParser(editableFeature);
			joinLinkJoinType_6002Parser = parser;
		}
		return joinLinkJoinType_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser subqueryLinkOperation_6003Parser;

	/**
	* @generated
	*/
	private IParser getSubqueryLinkOperation_6003Parser() {
		if (subqueryLinkOperation_6003Parser == null) {
			EAttribute editableFeature = DsqlPackage.eINSTANCE.getSubqueryLink_Operation();
			EnumParser parser = new EnumParser(editableFeature);
			subqueryLinkOperation_6003Parser = parser;
		}
		return subqueryLinkOperation_6003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WhenLabelEditPart.VISUAL_ID:
			return getWhenLabel_5033Parser();
		case ElseLabelEditPart.VISUAL_ID:
			return getElseLabel_5038Parser();
		case QueryNameEditPart.VISUAL_ID:
			return getQueryName_5052Parser();

		case LogicalOperationTypeEditPart.VISUAL_ID:
			return getLogicalOperationType_5057Parser();
		case ColumnNameEditPart.VISUAL_ID:
			return getColumnName_5001Parser();
		case ColumnName2EditPart.VISUAL_ID:
			return getColumnName_5002Parser();

		case UnaryOperationEditPart.VISUAL_ID:
			return getUnaryOperation_5027Parser();
		case ColumnName3EditPart.VISUAL_ID:
			return getColumnName_5003Parser();

		case UnaryOperation2EditPart.VISUAL_ID:
			return getUnaryOperation_5026Parser();

		case BinaryOperationEditPart.VISUAL_ID:
			return getBinaryOperation_5025Parser();
		case ColumnName4EditPart.VISUAL_ID:
			return getColumnName_5004Parser();
		case ColumnName5EditPart.VISUAL_ID:
			return getColumnName_5005Parser();

		case UnaryOperation3EditPart.VISUAL_ID:
			return getUnaryOperation_5024Parser();

		case TernaryOperationEditPart.VISUAL_ID:
			return getTernaryOperation_5023Parser();
		case ColumnName6EditPart.VISUAL_ID:
			return getColumnName_5006Parser();
		case ColumnName7EditPart.VISUAL_ID:
			return getColumnName_5007Parser();
		case ColumnName8EditPart.VISUAL_ID:
			return getColumnName_5008Parser();

		case UnaryOperation4EditPart.VISUAL_ID:
			return getUnaryOperation_5009Parser();

		case BinaryOperation2EditPart.VISUAL_ID:
			return getBinaryOperation_5022Parser();

		case BinaryOperation3EditPart.VISUAL_ID:
			return getBinaryOperation_5021Parser();

		case TernaryOperation2EditPart.VISUAL_ID:
			return getTernaryOperation_5020Parser();

		case TernaryOperation3EditPart.VISUAL_ID:
			return getTernaryOperation_5019Parser();

		case UnaryOperation5EditPart.VISUAL_ID:
			return getUnaryOperation_5010Parser();

		case BinaryOperation4EditPart.VISUAL_ID:
			return getBinaryOperation_5018Parser();

		case UnaryOperation6EditPart.VISUAL_ID:
			return getUnaryOperation_5011Parser();

		case BinaryOperation5EditPart.VISUAL_ID:
			return getBinaryOperation_5017Parser();

		case TernaryOperation4EditPart.VISUAL_ID:
			return getTernaryOperation_5016Parser();

		case TernaryOperation5EditPart.VISUAL_ID:
			return getTernaryOperation_5015Parser();

		case UnaryOperation7EditPart.VISUAL_ID:
			return getUnaryOperation_5012Parser();

		case BinaryOperation6EditPart.VISUAL_ID:
			return getBinaryOperation_5013Parser();

		case TernaryOperation6EditPart.VISUAL_ID:
			return getTernaryOperation_5014Parser();

		case BinaryOperation7EditPart.VISUAL_ID:
			return getBinaryOperation_5028Parser();

		case TernaryOperation7EditPart.VISUAL_ID:
			return getTernaryOperation_5029Parser();

		case UnaryOperation8EditPart.VISUAL_ID:
			return getUnaryOperation_5030Parser();

		case BinaryOperation8EditPart.VISUAL_ID:
			return getBinaryOperation_5031Parser();

		case TernaryOperation8EditPart.VISUAL_ID:
			return getTernaryOperation_5032Parser();
		case ColumnName9EditPart.VISUAL_ID:
			return getColumnName_5034Parser();

		case UnaryOperation9EditPart.VISUAL_ID:
			return getUnaryOperation_5035Parser();

		case BinaryOperation9EditPart.VISUAL_ID:
			return getBinaryOperation_5036Parser();

		case TernaryOperation9EditPart.VISUAL_ID:
			return getTernaryOperation_5037Parser();
		case ColumnName10EditPart.VISUAL_ID:
			return getColumnName_5039Parser();
		case ColumnName11EditPart.VISUAL_ID:
			return getColumnName_5040Parser();
		case ColumnName12EditPart.VISUAL_ID:
			return getColumnName_5041Parser();

		case UnaryOperation10EditPart.VISUAL_ID:
			return getUnaryOperation_5042Parser();

		case BinaryOperation10EditPart.VISUAL_ID:
			return getBinaryOperation_5043Parser();

		case TernaryOperation10EditPart.VISUAL_ID:
			return getTernaryOperation_5044Parser();

		case UnaryOperation11EditPart.VISUAL_ID:
			return getUnaryOperation_5045Parser();

		case BinaryOperation11EditPart.VISUAL_ID:
			return getBinaryOperation_5046Parser();

		case TernaryOperation11EditPart.VISUAL_ID:
			return getTernaryOperation_5047Parser();

		case UnaryOperation12EditPart.VISUAL_ID:
			return getUnaryOperation_5048Parser();

		case BinaryOperation12EditPart.VISUAL_ID:
			return getBinaryOperation_5049Parser();

		case TernaryOperation12EditPart.VISUAL_ID:
			return getTernaryOperation_5050Parser();
		case SourceNameEditPart.VISUAL_ID:
			return getSourceName_5051Parser();
		case ColumnName13EditPart.VISUAL_ID:
			return getColumnName_5053Parser();

		case UnaryOperation13EditPart.VISUAL_ID:
			return getUnaryOperation_5054Parser();

		case BinaryOperation13EditPart.VISUAL_ID:
			return getBinaryOperation_5055Parser();

		case TernaryOperation13EditPart.VISUAL_ID:
			return getTernaryOperation_5056Parser();

		case SetLinkSetOperatorEditPart.VISUAL_ID:
			return getSetLinkSetOperator_6001Parser();

		case JoinLinkJoinTypeEditPart.VISUAL_ID:
			return getJoinLinkJoinType_6002Parser();

		case SubqueryLinkOperationEditPart.VISUAL_ID:
			return getSubqueryLinkOperation_6003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DsqlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DsqlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DsqlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
