package dp_lab2;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Observable{
	private String title;
	private String oldtitle;
	private List<Element> content;
	private ArrayList<Observer> observers=new ArrayList<Observer>();

	public Section(String title) {
		super();
		this.title = title;
		this.content=new ArrayList<Element>();
	}

	public int addElm(Element elm)
	{
		content.add(elm);
		return content.indexOf(elm);
	}
	
	public void delete(Element elm)
	{
		content.remove(elm);
	}
	
	public Element popContent()
	{
		Element elm=content.get(content.size()-1);
		content.remove(content.size()-1);
		return elm;
	}
	
	public Element getElement(int ind)
	{
		return content.get(ind);
	}
	@Override
	public void print()
	{
		System.out.println(this.title);
		for(Element x : content)
		{
			x.print();
		}
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
		for(Element elm : content)
		{
			try {
				elm.accept(vis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observers)
		{
			obs.update(oldtitle, title);
		}
		
	}

	@Override
	public void setNewValue(String newval) {
		oldtitle=title;
		title=newval;
		this.notifyObservers();
		
	}

	@Override
	public Element copy() {
		Section elmm=new Section(this.title);
		for(Element e: content)
		{
			elmm.addElm(e);
		}
		return elmm;
	}
}
