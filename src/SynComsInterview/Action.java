package SynComsInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
	static WebDriver driver;
	public static void main(String[] args) {
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath(""));
		a.moveToElement(e).perform();
		
	}

}
