package dp_lab2;

import org.apache.commons.lang3.StringUtils;

public class AlignCenter implements AlignStrategy{

	@Override
	public void print(String text) {
		 System.out.printf("Paragraf: %s/n",StringUtils.center(text, 22));
		
	}

}
