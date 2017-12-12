package Programs;

import java.util.Scanner;

public class PolindroeScanner {
	public static void main(String[] args) {
		int r,s = 0;
		int b = 0;
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		b=sc.nextInt();
		
		
		while(n>0){
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(b==s){
			System.out.println("Number is a polindrome");
		}else{
			System.out.println("number not a polindrome");
		}
	}

}
