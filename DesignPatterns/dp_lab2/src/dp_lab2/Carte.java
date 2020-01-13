package dp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String name;
	private List<Autor> autori;
	private List<Element> cuprins;
	
	public Carte(String name) {
		this.name=name;
		this.autori=new ArrayList<Autor>();
		this.cuprins= new ArrayList<Element>();
	}
	
	
	public void print()
	{
		System.out.println(this.name);
		for(Autor x : this.autori)
		{
			System.out.println(x.print());
		}
		for(Element x : this.cuprins)
		{
			x.print();
		}
		
	}


	public void AddAutor(Autor a)
	{
		autori.add(a);
	}
	
	public int addContent(Element elm)
	{
		cuprins.add(elm);
		return cuprins.indexOf(elm);
	}
	public Element popContent()
	{
		Element elm=cuprins.get(cuprins.size()-1);
		cuprins.remove(cuprins.size()-1);
		return elm;
	}
	
	public List<Element> getCuprins()
	{
		return this.cuprins;
	}

	
	/*public Capitol GetCapitol(int index)
	{
		return cuprins.get(index);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Autor> getAutori() {
		return autori;
	}

	public List<Capitol> getCuprins() {
		return cuprins;
	}

	public void setCuprins(List<Capitol> cuprins) {
		this.cuprins = cuprins;
	}*/
	
	public static void main(String[] args)
	{
	/*	Carte noapteBuna = new Carte("Noapte buna, copii!");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		noapteBuna.AddAutor(rpGheo);
		/*Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);
		cap1.addElm(new Paragraf("Moto capitol"));
		cap1.addElm(cap11);
		cap11.addElm(new Paragraf("Text from subchapter 1.1"));
		cap11.addElm(cap111);
		cap111.addElm(new Paragraf("Text from subchapter 1.1.1"));
		cap111.addElm(cap1111);
		cap1111.addElm(new Imagine("Imagine subchapter 1.1.1.1"));*/
		
		
		/*long startTime = System.currentTimeMillis();
		Imagine img1 = new Imagine("Pamela Anderson");
		Imagine img2 = new Imagine("Kim Kardashian");
		Imagine img3 = new Imagine("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.addElm(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.addElm(img2);
		playboyS2.addElm(img3);
		Carte playboy = new Carte("Playboy WTF");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.addElm(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.addElm(img2);
		playboyS2.addElm(img3);
		Carte playboy = new Carte("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds"); 
		Section cap1 = new Section("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraf 1");
		cap1.addElm(p1);
		Paragraf p2 = new Paragraf("Paragraf 2");
		cap1.addElm(p2);
		Paragraf p3 = new Paragraf("Paragraf 3");
		cap1.addElm(p3);
		Paragraf p4 = new Paragraf("Paragraf 4");
		cap1.addElm(p4);
		cap1.addElm(new ImageProxy("ImageOne"));
		cap1.addElm(new Imagine("ImageTwo"));
		cap1.addElm(new Paragraf("Some text"));
		cap1.addElm(new Tabel("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		FinancialBook fin= new FinancialBook();
		cap1.accept(fin);
		fin.printStatistics();*/
		/*Builder jsonBuilder = new JSONBuilder("input.json");
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		myBook.print();
		XMLBuilder xml= new XMLBuilder("input.xml");
		xml.build();
		Element myBook = xml.getResult();
		myBook.print();
		Command cmd1 = new OpenCommand("input.json");
		cmd1.execute();
		Command cmd2 = new StatisticsCommand();
		cmd2.execute();
		DocumentManager dc=DocumentManager.getInstance();
		dc.getBook().print();*/
		
		
		
		
		
		/*Section cap1 = new Section("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.addElm(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.addElm(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.addElm(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.addElm(p4);
		cap1.addElm(new ImageProxy("ImageOne"));
		cap1.addElm(new Imagine("ImageTwo"));
		cap1.addElm(new Paragraf("Some text"));
		cap1.addElm(new Tabel("Table 1"));
		FirstObs firstObserver = new FirstObs();
		SecondObs secondObserver = new SecondObs();
		cap1.addObserver(firstObserver);
		cap1.addObserver(secondObserver);
		p1.addObserver(firstObserver);
		p1.addObserver(secondObserver);
		p2.addObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.removeObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1.1");*/
		
		
		/*Section cap1 = new Section("Capitolul 1");
		cap1.addElm(new Paragraf("Moto capitol"));
		cap1.addElm(new Paragraf("Another One"));
		cap1.addElm(new Paragraf("Another Two"));
		cap1.addElm(new Paragraf("Another Three"));
		DocumentManager.getInstance().addContent(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getContent().print();

		new DeleteCommand().execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getContent().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getContent().print();
		UndoCommand undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getContent().print();
		new UndoCommand().execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getContent().print();*/
		
		
		Section cap1 = new Section("Capitolul 1");
		Tabel t1=new Tabel("Tabel 1");
		Tabel t2=new Tabel("Tabel 2");
		Tabel t3=new Tabel("Tabel 3");
		t1.setAlignStrategy(new AlignCenter());
		t2.setAlignStrategy(new AlignLeft());
		t3.setAlignStrategy(new AlignRight());
		cap1.addElm(t1);
		cap1.addElm(t2);
		cap1.addElm(t3);
		
		cap1.addElm(new ArtWorkText("HELLO IT WORKS"));
		cap1.print();
		
		cap1.addElm(new Imagine("IMAGINE"));
		cap1.addElm(new Paragraf("Paragraf"));
		FinancialStatistics stats = new FinancialStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		
		
		
	}
	
}
