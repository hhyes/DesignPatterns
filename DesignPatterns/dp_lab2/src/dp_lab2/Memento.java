package dp_lab2;

public class Memento {
	Element state;
	public Element getstate() {
		return state;
	}
	public void setstate(Element elm)
	{
		state=elm.copy();
	}
}
