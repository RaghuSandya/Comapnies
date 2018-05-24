package TestNGExcu;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups={"functest","checkintest"})
	public void testmessage(){
		System.out.println("inside the test message");
	}
	@Test(groups={"checkintest"})
	public void checkin(){
		System.out.println("in side checkin... ");
	}
	@Test(groups={"functest"})
	public void func(){
		System.out.println("in side func.... ");
	}

}
