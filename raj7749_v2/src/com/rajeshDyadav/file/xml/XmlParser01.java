package com.rajeshDyadav.file.xml;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class XmlParser01 {
    
    public static void main(String args[]) {
	XmlParser01 xmlParser01 = new XmlParser01();
	String xmlFileName = "/home/ryadav/NetBeansProjects/RDYExcel03/final/RDYExcelConverter/ColumnNames.xml";
	
	System.out.println(xmlParser01.getColumnsStringFromXml(xmlFileName));
    }
    
    public String getColumnsStringFromXml(String xmlFileName) {
	String columns = "";
	ArrayList<String> listColumns = getColumnsListFromXml(xmlFileName);
	boolean flag = false;
	Iterator<String> it = listColumns.iterator();
	while (it.hasNext()) {
	    if (flag)
		columns = columns + ", " + it.next();
	    else {
		columns = it.next();
		flag = true;
	    }
	}
	return (columns);
    }

    public ArrayList<String> getColumnsListFromXml(String xmlFileName) {
	ArrayList<String> listColumns = new ArrayList<String>();
	Document dom = myParser(xmlFileName);
	if (dom != null) {
	    NodeList nodeListColumns = dom.getElementsByTagName("columnname");
	    for (int i = 0; i < nodeListColumns.getLength(); i++) {
		Node nodeColumn = nodeListColumns.item(i);
		listColumns.add(nodeColumn.getFirstChild().getNodeValue());
	    }
	}
	return listColumns;
    }

    private Document myParser(String xmlFileName) {
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	DocumentBuilder db = null;
	Document dom = null;
	try {
	    db = dbf.newDocumentBuilder();
	    dom = db.parse(xmlFileName);
	} catch (ParserConfigurationException e) {
	    e.printStackTrace();
	} catch (SAXException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return (dom);
    }

    /*
    private String getStringFromDocument(Document dom) {
	try {
	    DOMSource domSource = new DOMSource(dom);
	    StringWriter writer = new StringWriter();
	    StreamResult result = new StreamResult(writer);
	    TransformerFactory tf = TransformerFactory.newInstance();
	    Transformer transformer = tf.newTransformer();
	    transformer.transform(domSource, result);
	    return writer.toString();
	} catch (TransformerException ex) {
	    ex.printStackTrace();
	    return null;
	}
    }
    */
}
