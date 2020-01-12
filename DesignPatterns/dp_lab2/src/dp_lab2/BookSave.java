package dp_lab2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BookSave implements Visitor{
	private Path filename;

	public BookSave(String filename) {
		super();
		this.filename = Paths.get(filename);
	}

	@Override
	public void visit(Imagine img){
		String textToAppend="Imagine: "+img.getNume();
//	Files.write(filename, textToAppend.getBytes(), StandardOpenOption.APPEND);
		
	}

	@Override
	public void visit(ImageProxy imgpr) {
		String textToAppend="Imagine: "+imgpr.getName();
	//	Files.write(filename, textToAppend.getBytes(), StandardOpenOption.APPEND);
		
	}

	@Override
	public void visit(Paragraf pr) {
		String textToAppend="Paragraf: "+pr.getText();
	//	Files.write(filename, textToAppend.getBytes(), StandardOpenOption.APPEND);
		
	}

	@Override
	public void visit(Tabel tb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Section tb) {
		// TODO Auto-generated method stub
		
	}

}
