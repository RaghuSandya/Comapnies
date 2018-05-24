package Infrrd;

import java.util.Scanner;

public class OddEvenNum {
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number..");
		x=sc.nextInt();
		
		if(x % 2 ==0)
			System.out.println("Given number is Even..");
		else
			System.out.println("Given number is Odd ");
		
	}

}
