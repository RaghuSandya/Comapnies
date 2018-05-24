package Infrrd;

import java.util.Scanner;

public class NumberPolindrome {
	
	public static void main(String[] args) {
		int r,sum=0,temp;
		
		int n=252;
		temp=n;
		
		while(n>0){
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(sum==temp)
			System.out.println("polimdrome number");
		else
			System.out.println("Not a polimdrome");
	}

}
