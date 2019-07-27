package com.zensar.xml.saxs.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MovieXmlHandler extends DefaultHandler {

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		for(int i=start;i<start+length;i++)
			System.out.print(ch[i]);
		System.out.println();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end of Xml Document");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub super.endElement(arg0, arg1, arg2);
		System.out.print("end element: "+qName);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("starting.....");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("start element: "+qName);
	}

}
