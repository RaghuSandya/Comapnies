package TestNGExcu;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomLogging {
	public WebDriver driver;
	@Test(priority = 1)
	public void Testmethodone(){
		String s1 = "hello";
		String s2 = "hello";
		Assert.assertEquals(s1, s2);
	}
	@Test(priority = 2)
	public void Testmethodtwo(){
		//Assert.assertFalse(false);
	}
	@Test(priority = 3)
	public void Testmethodthree(){
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
	//Assert.assertTrue(true);
}
}
