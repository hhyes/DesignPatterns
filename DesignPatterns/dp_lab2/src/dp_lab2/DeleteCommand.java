package dp_lab2;

public class DeleteCommand implements Command{
	Section last;
	Memento m=new Memento();
	@Override
	public void execute() {
		DocumentManager dc=DocumentManager.getInstance();
		Carte c=dc.getBook();
		last=dc.getContent();
		m.setstate(last);
		dc.addCmd(this);
		last.popContent();
		
	}
	@Override
	public void unexecute() {
		DocumentManager dc=DocumentManager.getInstance();
		Carte c=dc.getBook();
		dc.setSection((Section)m.getstate());

	}

}
