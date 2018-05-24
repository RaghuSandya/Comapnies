package CTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Enroll Your Self')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(e).click();
		//act.contextClick().perform();
	}

}
