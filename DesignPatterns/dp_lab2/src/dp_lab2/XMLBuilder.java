package dp_lab2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLBuilder {
	private String filename;
	public Element document;
	
	public XMLBuilder(String filename) {
		super();
		this.filename = filename;
	}
	
	public Element getResult()
	{
		return document;
	}
	public void build() {
		try {
		File inputFile = new File(filename);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
		
			dBuilder = dbFactory.newDocumentBuilder();
		
        Document doc = (Document) dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("element");
        System.out.println(nList.getLength());
        for (int temp = 0; temp < nList.getLength(); temp++) {
        	Node nNode = nList.item(temp);
        	document=processList(nNode);
        }
        
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		public Element processList(Node nNode)
		{
			org.w3c.dom.Element eElement = (org.w3c.dom.Element) nNode;
			String classname=eElement.getElementsByTagName("class").item(0).getTextContent();
			Element elm = null;
			if(classname.equals("Section"))
			{
				elm=buildSection(eElement);
			}
			else if(classname.equals("ImageProxy"))
			{
				elm=buildImageProxy(nNode);
			}
			else if(classname.equals("Image"))
			{
				elm=buildImage(nNode);
			}
			else if(classname.equals("Paragraph"))
			{
				elm=buildParagraph(eElement);
			}
			else if(classname.equals("Table"))
			{
				elm=buildTable(nNode);
			}
			return elm;
		}
		
		public Element buildParagraph(org.w3c.dom.Element eElement) {
			Paragraf p=null;
	        p = new Paragraf(eElement.getElementsByTagName("text").item(0).getTextContent());
			 
			return p;
		}
		
		Element buildSection(org.w3c.dom.Element eElement)
		{
			Section s=new Section(eElement.getElementsByTagName("title").item(0).getTextContent());
			NodeList nList = eElement.getElementsByTagName("children");
			System.out.println(nList.getLength());
			for (int temp = 0; temp < nList.getLength(); temp++) {
	        	Node nNode = nList.item(temp);
	        	Element e=processList(nNode);
	        	if (e != null) {
	    			s.addElm(e);
	        	}
			}
			return s;
		}

		Element buildImage(Node nNode)
			{
			Imagine i=null;
			return i;
			}

		Element buildImageProxy(Node nNode)
		{
			ImageProxy i=null;
			return i;
		}

		Element buildTable(Node nNode)
		{
			Tabel t=null;
			return t;
		}
	
}
