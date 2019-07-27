package com.zensar.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class FileDownloadService {
	
	private static final String FILE_PATH = "d:/Files/Files.txt";
	
	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getFile(){
		File file = new File(FILE_PATH);
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment; filename=Files.txt");
		return responseBuilder.build();
	}
	private static final String FILE_PATH1 = "d:/Files/";

	@GET
	@Path("/images")
	@Produces("image/png")
	public Response getImg(){
		File file = new File(FILE_PATH1);
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment; filename=Files.txt");
		return responseBuilder.build();
	
	}
}
