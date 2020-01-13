package dp_lab2;

public class FinancialStatistics implements Visitor{

	private int images;
	private int paragrafs;
	private int tabels;
	private int arttext;
	
	
	public FinancialStatistics() {
		super();
		this.images = 0;
		this.paragrafs = 0;
		this.tabels = 0;
		this.arttext=0;
	}

	@Override
	public void visit(Imagine img) {
		this.images+=20;
	}
	
	@Override
	public void visit(Section img) {

	}
	
	@Override
	public void visit(ImageProxy imgpr) {
		// TODO Auto-generated method stub
		images+=20;
	}

	@Override
	public void visit(Paragraf pr) {
		// TODO Auto-generated method stub
		paragrafs+=10;
	}

	public void visit(ArtWorkText pr) {
		// TODO Auto-generated method stub
		arttext+=5;
	}

	@Override
	public void visit(Tabel tb) {
		// TODO Auto-generated method stub
		tabels+=15;
	}
	public void printStatistics()
	{
		System.out.println("Cost of images: "+this.images);
		System.out.println("Cost of paragrafs: "+this.paragrafs);
		System.out.println("Cost of tabels: "+this.tabels);
		System.out.println("Cost of arttext: "+this.arttext);
		int total=this.arttext+this.tabels+this.paragrafs+this.images;
		System.out.println("Total: "+total);
	}

}
