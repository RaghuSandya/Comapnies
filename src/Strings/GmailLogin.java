package Strings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin {
  @Test
  public void Gmail() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
  }
}
