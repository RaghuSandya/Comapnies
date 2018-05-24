package OOPs;

public class Daddy {//parents class of main class is Object
	
	void property(){
		System.out.println("My dady propety...");
	}
	void marry(){
		System.out.println("U should marry Illiana or Anushka...");//overridden method
	}
 
}
class Son extends Daddy{
	void marry(){
		System.out.println("No daddy.. I wanna marry rakul... ");//Overridding method
	}
}
	class Child extends Son{
		void smile(){
			System.out.println("Keep smile....");// Multi level inheritance
		}
		
public static void main(String[] args) {
		Child c = new Child();
		c.marry();
		c.smile();
	}
}
