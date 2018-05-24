package Exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		try{
			System.out.println("Try block Executed");
			System.out.println(10/0);
		}
		catch(NullPointerException e){
			
			System.out.println("Catch block Executed");
		}
		finally{
			String s=null;
			System.out.println("String Lenght:"+s.length());
			
			System.out.println("Finally Block Executed");
		}
	}

}
