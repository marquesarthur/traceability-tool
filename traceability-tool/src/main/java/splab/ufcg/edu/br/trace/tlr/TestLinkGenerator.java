package splab.ufcg.edu.br.trace.tlr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import splab.ufcg.edu.br.trace.entities.TraceLink;
import splab.ufcg.edu.br.trace.entities.TraceLinkList;

public class TestLinkGenerator implements TLRGenerator {

	private static final String TLR_ARTIFACT_TEMPLATE = "artifact (%s, \'%s\');";

	private static final String TLR_TRACE_LINK_TEMPLATE = "tracelink (%s;)";

	private TraceLinkList extractedTraceLinkList;

	public TestLinkGenerator(TraceLinkList extractedTraceLinkList) {
		this.extractedTraceLinkList = extractedTraceLinkList;
	}

	@Override
	public String generateTLR() {

		StringBuilder str = new StringBuilder();

		List<TraceLink> testLink = extractedTraceLinkList
				.filterByType("Test_Case");

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

		return String.format(TLR_ARTIFACT_TEMPLATE, type, artifact);
	}

}
