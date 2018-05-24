package ScientficGames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {
	 static WebDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("https://mail.google.com");
		
		
		
	}

}
