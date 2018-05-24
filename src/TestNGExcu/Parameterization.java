package TestNGExcu;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	
	@Parameters("myName")
	@Test
	public void parametertest(String myName){
		System.out.println("paramerterization value:"+ myName);
	}
}
