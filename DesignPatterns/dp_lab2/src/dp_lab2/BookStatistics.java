package dp_lab2;

public class BookStatistics implements Visitor{

	private int images;
	private int paragrafs;
	private int tabels;
	private int sections;
	
	
	public BookStatistics() {
		super();
		this.images = 0;
		this.paragrafs = 0;
		this.tabels = 0;
		this.sections=0;
	}

	@Override
	public void visit(Imagine img) {
		this.images+=1;
	}
	
	@Override
	public void visit(Section img) {
		this.sections+=1;
	}
	
	@Override
	public void visit(ImageProxy imgpr) {
		// TODO Auto-generated method stub
		images+=1;
	}

	@Override
	public void visit(Paragraf pr) {
		// TODO Auto-generated method stub
		paragrafs+=1;
	}

	@Override
	public void visit(Tabel tb) {
		// TODO Auto-generated method stub
		tabels+=1;
	}
	public void printStatistics()
	{
		System.out.println("No. of images: "+this.images);
		System.out.println("No. of paragrafs: "+this.paragrafs);
		System.out.println("No. of tabels: "+this.tabels);
		System.out.println("No. of sections: "+this.sections);
	}

}
