package dp_lab2;

public class OpenCommand implements Command{
	private String filename;
	
	public OpenCommand(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public void execute() {
		Builder jsonBuilder = new JSONBuilder(filename);
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		Carte book=new Carte("Titlu");
		book.addContent(myBook);
		DocumentManager dc=DocumentManager.getInstance();
		dc.setBook(book);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	

}
