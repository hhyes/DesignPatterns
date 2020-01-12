package dp_lab2;

import java.io.IOException;
import java.util.ArrayList;

public class ImageProxy implements Element, Observable{
	String name;
	String oldname;
	ArrayList<Observer> observers=new ArrayList<Observer>();
	Imagine realImage;
	@Override
	
	public void print() {
		if(realImage==null)
			realImage=new Imagine(name);
		realImage.print();
	}
	public ImageProxy(String name) {
		super();
		this.name = name;
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
			obs.update(oldname, name);
		}
		
	}

	@Override
	public void setNewValue(String newval) {
		oldname=name;
		name=newval;
		this.notifyObservers();
		
	}
	
}
