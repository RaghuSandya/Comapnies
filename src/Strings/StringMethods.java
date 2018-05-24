package Strings;

public class StringMethods {
	public static void main(String[] args) {
		String S1=new String("Ashoke");
		String S2=S1.intern();//Copy the content
		System.out.println(S1==S2);
		String S3="Ashoke";
		System.out.println(S2==S3);
		System.out.println(S2.equals(S3));
		System.out.println(S2.compareTo(S3));
		
		
		String S4=new String("Giddu");
		String S5=S4.concat(".V");
		String S6=S5.intern();
		String s7="Giddu.V";
		System.out.println(s7==S6);
		
		//String s=new String(char[] ch);
		
		char[] ch={'a','b','c'};
		String s=new String(ch);
		System.out.println("char is:"+s);//abc
		
		
		//String s=new String(byte[] b);
		
		byte[] b={97,98,99};
		String c=new String(b);
		System.out.println("byte:"+c);//
		
		/*
		 String Methods
		 */
		
		String w="giddaiah";
		//SubString
		System.out.println(w.substring(1, 3));
		System.out.println(w.substring(4));
		//lenght
		System.out.println("Lenght:"+w.length());
		//String replace
		System.out.println("Replace is:"+w.replace('a', 'u'));
		//string uppercase
		System.out.println("Upper case is:"+w.toUpperCase());
		//String trim
		System.out.println("trim:"+w.trim());
		//IndexOf
		System.out.println("Index is:"+w.indexOf('d'));
		System.out.println("Index is:"+w.indexOf('x'));
		//Last index
		System.out.println("last index is:"+w.lastIndexOf('h'));
		
		
	}
}
