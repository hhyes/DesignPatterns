package dp_lab2;

import java.io.IOException;

public class ArtWorkText implements Element{
	private String text;

	
	public ArtWorkText(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println("************\n" + text + "\n***********");
		
	}

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
	}

	@Override
	public void setNewValue(String newval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
