package TestNGExcu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnotations {
@Test
//testcase1
public void testcase1(){
	System.out.println("In test case1.");
	}
//testcase2
@Test(enabled=false)
public void testcase2(){
	System.out.println("In test case2..");
}
//testcase3
@Test
public void testcase3(){
	System.out.println("In test case3...");
}
@BeforeMethod
public void beforeMethode(){
	System.out.println("In before methode..........");
}
@AfterMethod
public void AfterMethod(){
	System.out.println("In After methode...........");
}
@BeforeClass
public void beforeclass(){
	System.out.println("In before class...........");
}
@AfterClass
public void afterclass(){
	System.out.println("In after class.............");
}
@BeforeTest
public void beforetest(){
	System.out.println("In before Test..............");
}
@AfterTest
public void aftertest(){
	System.out.println("In After Test................");
}
@BeforeSuite
public void BeforeSuit(){
	System.out.println("In Before suite................");
}
@AfterSuite
public void Atersuite(){
	System.out.println("In Atfer suite..........");
}
}
