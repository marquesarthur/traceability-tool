package splab.ufcg.edu.br.trace.tql;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import splab.ufcg.edu.br.trace.entities.TraceLink;
import splab.ufcg.edu.br.trace.entities.TraceLinkList;
import splab.ufcg.edu.br.trace.tlr.TLRGenerator;

public class TQLSourceCodeGenerator implements TLRGenerator {

	
	

	private final String TLR_ARTIFACT_TEMPLATE = "art:Code ( %s ) ;";


	
	private TraceLinkList extractedTraceLinkList;
	
	public TQLSourceCodeGenerator(TraceLinkList extractedTraceLinkList) {
		this.extractedTraceLinkList = extractedTraceLinkList;
	}
	
	@Override
	public String generateTLR() {
		
		StringBuilder str = new StringBuilder();

		List<TraceLink> testLink = extractedTraceLinkList
				.filterByType("Class_code");

		List<String> artifacts = new ArrayList<String>();

		Set<String> artifactSet = new HashSet<String>();

		for (TraceLink traceLink : testLink) {

			if (!artifactSet.contains(traceLink.getArtifact())) {

				artifacts.add(traceLink.getArtifact());

				str.append(getArtifactDeclaration(traceLink.getArtifactType(),
						traceLink.getArtifact()));
				str.append(TLR_LINE_BREAK);

				artifactSet.add(traceLink.getArtifact());
			}

		}
		str.append(TLR_LINE_BREAK);

		return str.toString();
		
		
	}
	
	private String getArtifactDeclaration(String type, String artifact) {

		return String.format(TLR_ARTIFACT_TEMPLATE, artifact, type);
	}


}
