package SeleniumProgms;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		int r,sum=0,temp;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number,,,,,,,");
		n=sc.nextInt();
		
		temp=n;
		while(n>0){
			r=n%10;//getting remainder
			n=n/10;
			sum=(sum*10)+r;
			
		}
		if(sum==temp){
			System.out.println("given num is polindrome...");
		}else{
			System.out.println("Given num is not a polindrome....");
		}
	}

}
