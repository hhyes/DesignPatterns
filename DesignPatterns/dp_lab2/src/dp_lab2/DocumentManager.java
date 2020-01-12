package dp_lab2;

import java.util.ArrayList;

public class DocumentManager {
	private Carte book;
	private Section s;
	private ArrayList<Command> cmds= new ArrayList<Command>();
	private static DocumentManager instance=null;
	
	
	private DocumentManager() {
	}
	public void addCmd(Command cmd)
	{
		cmds.add(cmd);
	}

	public Command getCmd()
	{
		Command c = cmds.get(cmds.size()-1);
		cmds.remove(cmds.size()-1);
		return c;
	}

	public static DocumentManager getInstance()
	{
		if(instance==null)
			instance=new DocumentManager();
		return instance;
	}
	
	public Carte getBook()
	{
		return book;
	}
	public void setBook(Carte book1)
	{
		book=book1;
	}
	public void setSection(Section s)
	{
		this.s=s;
	}
	public void addContent(Section book1)
	{
		if(book == null)
			book=new Carte("Cartea mea");
		book.addContent(book1);
		s=book1;
	}
	public Section getContent()
	{
		return s;
	}
}
