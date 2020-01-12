package dp_lab2;

import java.io.IOException;

public class StatisticsCommand implements Command{

	@Override
	public void execute() {
		BookStatistics stats = new BookStatistics();
		DocumentManager dc=DocumentManager.getInstance();
		for(Element e : dc.getBook().getCuprins())
		{
			try {
				e.accept(stats);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		stats.printStatistics();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
