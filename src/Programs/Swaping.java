package Programs;

import java.util.Scanner;

public class Swaping {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter value");
		b=sc.nextInt();
		
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
