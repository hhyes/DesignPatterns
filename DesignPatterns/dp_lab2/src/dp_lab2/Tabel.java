package dp_lab2;

import java.io.IOException;
import java.util.ArrayList;

public class Tabel implements Element, Observable{
	private String nume;
	private String oldnume;
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	private AlignStrategy align;

	public Tabel(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void print()
	{
		if(align!=null)
		{
			align.print(nume);
		}
		else {
		System.out.println("Tabel: " + this.nume);
		}	}

	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
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
