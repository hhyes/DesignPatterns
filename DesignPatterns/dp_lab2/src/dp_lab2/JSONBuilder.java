package dp_lab2;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder{

	private String filename;
	public Element document;
	
	
	public JSONBuilder(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public Element getResult() {
		
		return document;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		try {
		ObjectMapper mapper=new ObjectMapper();
		HashMap<String, Object> map = mapper.readValue(new File(filename), HashMap.class);
				document = processMap(map);
				} catch (JsonParseException e) {
				e.printStackTrace();
				} catch (JsonMappingException e) {
				e.printStackTrace();
				} catch (IOException e) {
				e.printStackTrace();
				}
	}
	public Element processMap(HashMap<String, Object> map)
	{
		String classname=(String) map.get("class");
		Element elm = null;
		if(classname.equals("Section"))
		{
			elm=buildSection(map);
		}
		else if(classname.equals("ImageProxy"))
		{
			elm=buildImageProxy(map);
		}
		else if(classname.equals("Image"))
		{
			elm=buildImage(map);
		}
		else if(classname.equals("Paragraph"))
		{
			elm=buildParagraph(map);
		}
		else if(classname.equals("Table"))
		{
			elm=buildTable(map);
		}
		return elm;
	}
	
	
	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
			if (e != null) {
			try {
			section.addElm(e);
			} catch (Exception var5) {
			var5.printStackTrace();
			}
			}
			});
			return section;
		}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Paragraf p = new Paragraf((String)map.get("text"));
		return p;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Imagine i= new Imagine((String)map.get("url"));
		return i;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		ImageProxy i= new ImageProxy((String)map.get("url"));
		return i;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Tabel i= new Tabel((String)map.get("url"));
		return i;
	}


}
