package splab.ufcg.edu.br.trace.tracql;

import java.util.Set;

import splab.ufcg.edu.br.trace.entities.TraceLinkList;
import splab.ufcg.edu.br.trace.tlr.TLRGenerator;

public class TracQLCoreEntitiesGenerator implements TLRGenerator {

//	private static final String QUERY_NAME_TEMPLATE = "%s_query";

	
	
	private final String TLR_REQUIREMENT_TEMPLATE = "object %s extends Requirement { ... } ;";
	
	private TraceLinkList extractedTraceLinkList;

	public TracQLCoreEntitiesGenerator(TraceLinkList extractedTraceLinkList) {
		this.extractedTraceLinkList = extractedTraceLinkList;
	}

	@Override
	public String generateTLR() {

		StringBuilder str = new StringBuilder();

		str.append("object Requirement extends Type[QVertex] { ... } ;" );
		str.append(TLR_LINE_BREAK);
		str.append("object TestCase extends Type[QVertex] { ... } ;" );
		str.append(TLR_LINE_BREAK);
		str.append("object SourceCode extends Type[QVertex] { ... } ;" );
		str.append(TLR_LINE_BREAK);
		str.append(TLR_LINE_BREAK);
		
		str.append(this.getRequirements(extractedTraceLinkList
				.extractRequirements()));
		str.append(TLR_LINE_BREAK);

		str.append(TLR_LINE_BREAK);

//		str.append(this.getSemantics(extractedTraceLinkList.getSemantics()));
//		str.append(TLR_LINE_BREAK);

//		str.append(this.getDefaultQueries());
//		str.append(TLR_LINE_BREAK);

		return str.toString();
	}


	private String getRequirements(Set<String> requirements) {

		StringBuilder str = new StringBuilder();

		for (String requirement : requirements) {
			str.append(getRequirementDeclaration(requirement));
			str.append(TLR_LINE_BREAK);
		}

		return str.toString();
	}



	private String getRequirementDeclaration(String requirement) {
		return String.format(TLR_REQUIREMENT_TEMPLATE, requirement);
	}


}
