package ExceptionTypes;

public class IAE {
	public static void main(String[] args) {
		Thread t=new Thread();
		t.setPriority(100);//Invalid
		t.setPriority(10);//Valid
		System.out.println(t);
	}

}
