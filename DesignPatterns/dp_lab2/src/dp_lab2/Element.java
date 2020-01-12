package dp_lab2;

import java.io.IOException;

public interface Element {
	public void print();
	public void accept(Visitor vis) throws IOException;
	public void setNewValue(String newval);
	public Element copy();
}
