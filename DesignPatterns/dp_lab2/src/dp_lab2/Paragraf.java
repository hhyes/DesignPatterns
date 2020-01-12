package dp_lab2;

import java.util.ArrayList;

public class Paragraf implements Element, Observable{
	private String text;
	private String oldText;
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	private AlignStrategy align;

	public Paragraf(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public void print()
	{
		if(align!=null)
		{
			align.print(text);
		}
		else {
			System.out.println("Paragraf: " + this.text);
		}
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
			obs.update(oldText, text);
		}
		
	}

	@Override
	public void setNewValue(String newval) {
		oldText=text;
		text=newval;
		this.notifyObservers();
		
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
	}
}
