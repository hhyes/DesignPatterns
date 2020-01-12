package dp_lab2;

public class FinancialBook extends BookStatistics{
	private int images;
	private int paragrafs;
	private int tabels;
	
	public FinancialBook() {
		super();
		this.images = 0;
		this.paragrafs = 0;
		this.tabels = 0;
	}

	public void visit(Imagine img) {
		this.images+=6;
	}

	@Override
	public void visit(ImageProxy imgpr) {
		// TODO Auto-generated method stub
		images+=6;
	}

	@Override
	public void visit(Paragraf pr) {
		// TODO Auto-generated method stub
		paragrafs+=2;
	}

	@Override
	public void visit(Tabel tb) {
		// TODO Auto-generated method stub
		tabels+=15;
	}
	@Override
	public void printStatistics()
	{
		System.out.println("Price of images: "+this.images);
		System.out.println("Price of paragrafs: "+this.paragrafs);
		System.out.println("Price of tabels: "+this.tabels);
		System.out.println("Total: " + (this.images+this.paragrafs+this.tabels));
	}
}
