package br.edu.ufcg.splab.testlink.rest;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import splab.ufcg.edu.br.trace.entities.TraceLinkList;
import br.edu.ufcg.splab.testlink.service.TestLinkService;

@Path("/testlink")
@RequestScoped
public class TestLinkREST {

	@Inject
	private TestLinkService testLinkService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTraceLinks() {
		Response.ResponseBuilder builder = null;
		try {
			TraceLinkList traceLinks = testLinkService.getTraceLinks();
			builder = Response.ok().entity(traceLinks);
			builder.build();
		} catch (RuntimeException ex) {
			Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", ex.getMessage());
            builder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(responseObj);
	  	}catch (Exception ex) {
			Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", ex.getMessage());
            builder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(responseObj);
		}
		return builder.build();
	}
}
