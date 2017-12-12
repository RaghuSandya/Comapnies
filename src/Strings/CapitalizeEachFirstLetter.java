package Strings;

import java.util.Scanner;

public class CapitalizeEachFirstLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
	String[] s=str.split(" ");
	for(int i=0;i<s.length;i++)
	  {
		String a=s[i];
		for(int j=0;j<a.length();j++){
			if(j==0){
				System.out.print(Character.toUpperCase(a.charAt(j)));
				
	        }
			else{

				System.out.print(a.charAt(j));
		}
	}
	System.out.print(" ");	
	   }
	}
		
	}


