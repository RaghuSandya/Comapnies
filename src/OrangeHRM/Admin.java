package OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Admin {
	public WebDriver driver;

	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Baburao\\workspace\\SamplePrograms\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	// TC_01_Verify User Login
	@Test(priority = 1)
	public void AdminLogin() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		boolean Login = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();

		if (Login == true) {
			System.out.println("TC_01_" + "Verify User Login --passed");
		} else {
			System.out.println("TC_01_" + "Verify User Login --failed");
		}
	}

	// TC_02_Verify Employee Leave Summary
	@Test(priority = 2)
	public void employeeLeave() {
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Raghu");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='assignleave_txtFromDate']")).click();
	}

	@Test(priority = 3)
	// TC_03_Add New Employee
	public void AddNewEmployee() throws InterruptedException {
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPimModule']")).click();
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPimModule']"));
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Raghu");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Sandya");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Valkur");
		driver.findElement(By.xpath("//input[@value='Save']")).click();

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Welcome Admin')]"))
		 * .click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click(
		 * );
		 */
	}

	// TC_04_Edit Employee details
	@Test(priority = 4)
	public void Editemployee() {
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("0026");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Linda')]")).click();
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("James");
		driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys("ANDER");
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}

	// TC_05_delete Employee details
	@Test(priority = 5)
	public void DeleteEmployee() {
		Actions action = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPimModule']"));
		action.moveToElement(e).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("0001");
		driver.findElement(By.xpath("//input[@value='Search']")).click();

	}
}
