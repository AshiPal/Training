package com.zensar.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/fileupload")
public class FileUploadService {

	@POST
	@Path("/upload")
	@Produces("text/html")
	public Response uploadFile(@FormDataParam("myfile")InputStream uploadedStream,@FormDataParam("myfile")FormDataContentDisposition fileDetails){
		String filelocation = "D`:/uploads/" + fileDetails.getFileName();
		try{
			FileOutputStream fos = new FileOutputStream(new File(filelocation));
			byte []b=new byte[1024];
			int data =0;
			while ((data=uploadedStream.read(b))!=1)
			{
				fos.write(b,0,data);
			}
			fos.flush();
			fos.close();
		}
		catch (Exception e){}
		return Response.status(200).entity("File uploaded to location"+filelocation).build();
		}
	}

