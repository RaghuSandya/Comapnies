package StringHandling;

public class String_Test {
	public static void main(String[] args) {
		String s1 = "Java";//Sting literal 
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = "JavaC";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));  
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));
	}
}
