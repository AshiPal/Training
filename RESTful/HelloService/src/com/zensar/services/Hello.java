package com.zensar.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/zenhello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello()
	{
		return "hello from zensar";
	}

	@Path("/welcome")
	@GET
	@Produces("text/html")
	public String sayHtmlHello()
	{
		return "<body bgcolor='pink'"+"<p>welcome to zensar html</p>"+"</body>";
	}
	
	@Path("/welcomexml")
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public String sayXmlHello()
	{
		return "<?xml version='1.0'?>"+
				"<message>"+
				"<message>Hello World from zensar xml</message>"+
				"</message>";
				
	}
}

