package br.edu.ufcg.splab.tlr.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import splab.ufcg.edu.br.trace.entities.TraceLinkList;
import br.edu.ufcg.splab.coest.service.CoestService;
import br.edu.ufcg.splab.tlr.service.TlrService;

@Path("/tlr")
public class TlrRest {

	@Inject
	private TlrService tlrService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response readTraceLinks() {
		Response.ResponseBuilder builder = null;
		try {
			TraceLinkList traceLinks = tlrService.read();
			builder = Response.ok().entity(traceLinks);
			builder.build();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", ex.getMessage());
            builder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(responseObj);
	  	}catch (Exception ex) {
	  		ex.printStackTrace();
			Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", ex.getMessage());
            builder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(responseObj);
		}
		return builder.build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response writeTraceLinks(TraceLinkList traceLinks) {
		Response.ResponseBuilder builder = null;
		try {
			tlrService.write(traceLinks);
			builder = Response.ok();
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
