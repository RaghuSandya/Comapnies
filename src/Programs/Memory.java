package Programs;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Memory {
	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.setJavascriptEnabled(false);
		driver.get("http://www.java2s.com");
		
	}

}
