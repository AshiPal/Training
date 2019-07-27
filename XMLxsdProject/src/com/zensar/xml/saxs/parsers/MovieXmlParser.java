package com.zensar.xml.saxs.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MovieXmlParser {

	public static void main(String[] args) {
		try {
			SAXParserFactory factory=SAXParserFactory.newInstance();
			
			SAXParser parser=factory.newSAXParser();
			
			parser.parse(new File("./src/moviesDetails.xml"),new MovieXmlHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
