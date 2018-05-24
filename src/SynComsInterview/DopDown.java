package SynComsInterview;

import org.openqa.selenium.support.ui.Select;

public class DopDown {
	public static void main(String[] args) {
		
		Select d=new Select(null); 
		d.selectByIndex(0);
		d.selectByValue("India");
		d.selectByVisibleText("India");
	}

}
