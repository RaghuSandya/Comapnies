package Exceptions;

public class WithException {
	public static void main(String[] args) {
		System.out.println("Statement1");
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println(10/2);
			e.printStackTrace();
			e.getMessage();
			System.out.println(e.getMessage());
		}
		System.out.println("Statement3");
	}

}
