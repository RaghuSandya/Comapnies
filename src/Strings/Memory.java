package Strings;

public class Memory {

	public static void main(String[] args) {
		String str="Siva";
		String  str1=str.intern();
		
		System.out.println(str+"  "+str1);
		str="Siva prasad";
		System.out.println(str.toString());
		str.toString();
        
		
		int d=10;
	String s=Integer.toString(d);
	System.out.println(s);
	
	String g="10";
	int f=Integer.parseInt(g);
	System.out.println(f);
	
	}
}
