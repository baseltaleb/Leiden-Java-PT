package com.training.first.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.first.domain.Sample;
import com.training.first.persistence.SampleService;

@Path("sample")
@Component
public class SampleEndPoint {
	@Autowired
	private SampleService sampleService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroup() {
		Iterable<Sample> samples = sampleService.findAll();
		return Response.ok(samples).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postSample(Sample sample) {
		Sample result = sampleService.save(sample);
		return Response.accepted(result.getId()).build();
	}
}
