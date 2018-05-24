package Strings;

public class Test {

	   public static void main(String args[]) {
	      StringBuffer sBuffer = new StringBuffer("test");
	      System.out.println(sBuffer.reverse());
	      sBuffer.replace(1,3, "tt");
	      sBuffer.append(" String Buffer");
	      
	      System.out.println(sBuffer.length()); 
	      
	      String str1="Saw i was";
	      System.out.println("Dont "+str1+" Tod");
	   }
	}