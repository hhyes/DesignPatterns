package dp_lab2;

public class UndoCommand implements Command{

	@Override
	public void execute() {
		DocumentManager dc=DocumentManager.getInstance();
		dc.getCmd().unexecute();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
