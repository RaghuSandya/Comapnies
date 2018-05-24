package SeleniumProgms;

import java.util.Scanner;

public class ReverseStrngPolindrm {
	public static void main(String[] args) {
	String original,reverse="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any name.........");
	original=sc.nextLine();
	
	for(int i=original.length()-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Given String is Polindrome");
		else
			System.out.println("given String is not a polindrome..");
		}
	}
	
	
