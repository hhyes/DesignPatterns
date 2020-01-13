package dp_lab2;

import java.io.IOException;

public interface Visitor {
	public void visit(Imagine img);

	public void visit(ImageProxy imgpr);

	public void visit(Paragraf pr);
	
	public void visit(Tabel tb);
	
	public void visit(Section tb);
	
	public void visit(ArtWorkText tb);
}
