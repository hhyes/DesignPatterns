package dp_lab2;

import java.util.ArrayList;

public class Paragraf implements Element, Observable{
	private String text;
	private String oldText;
	private ArrayList<Observer> observers=new ArrayList<Observer>();

	public Paragraf(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public void print()
	{
		System.out.println("Paragraf: " + this.text);
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
	
}
