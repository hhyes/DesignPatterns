package dp_lab2;

import org.apache.commons.lang3.StringUtils;

public class AlignRight implements AlignStrategy{

	@Override
	public void print(String text) {
		 System.out.printf("Paragraf: %s/n",StringUtils.right(text, 22));
		
	}

}
