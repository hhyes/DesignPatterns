package dp_lab2;

public class FirstObs implements Observer{

	@Override
	public void update(String oldval, String newval) {
		System.out.println("First observer "+oldval+" was changed into "+newval);
		
	}

}
