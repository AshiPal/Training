package com.zensar.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/zenparam")
public class HelloParam {	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
	public Response getMessage(@PathParam("nm")String name)
	{
		return Response
				.status(200)
				.entity("<p>Hello <b><i>"+name+"<i><b> Welcome to zensar").build();
		
	}
	@Path("/welcome/{d}/{m}/{y}/{nm}")
	@GET
	@Produces("text/html")
	public Response getBirthday(@PathParam("d")int d,@PathParam("m")int m,@PathParam("y")int y,@PathParam("nm")String name)
	{
		return Response
				.status(200)
				.entity("Birth Date is "+d+"-"+m+"-"+y+" Happy Birthday "+name).build();
		
	}
}
