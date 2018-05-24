package SeleniumProgms;

import java.util.Scanner;

public class Factorial {

	/*public static int Factorial1(int a){
		return(a==0||a==1)?1:(a*Factorial1(a-1));
	}
	public static void main(String[] args) {
		int n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number....");
		n=sc.nextInt();
		System.out.println("Factorial of n  "+n+" is: "+Factorial1(n));
		sc.close();

	}*/
	public static void main(String[] args) {
		int i,fact=1;
		int num=5;
		for( i=1;i<=num;i++){
			
			fact=fact*i;
		}
		System.out.println("Factorial of given number is .."+fact);
	}
	
}
