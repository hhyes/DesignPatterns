package dp_lab2;

public class SecondObs implements Observer{

	@Override
	public void update(String oldval, String newval) {
		System.out.println("Second observer " +oldval+" was changed into "+newval);
		
	}

}
