package dp_lab2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Imagine implements Element, Observable{
	private String nume;
	private String oldnume;
	private ArrayList<Observer> observers=new ArrayList<Observer>();

	public Imagine(String nume) {
		super();
		this.nume = nume;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void print()
	{
		System.out.println("Imagine: " + this.nume);
	}

	@Override
	public void accept(Visitor vis) {
		vis.visit(this);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
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
			obs.update(oldnume, nume);
		}
		
	}

	@Override
	public void setNewValue(String newval) {
		oldnume=nume;
		nume=newval;
		this.notifyObservers();
		
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
