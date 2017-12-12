package Programs;

import java.util.Scanner;

public class ReverseOfUsingSC {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String orig=sc.nextLine();
		
		
		String[] a= orig.split(" ");
		
		System.out.println("number words in a given string:" +a.length);
		
		for(int i=0;i<a.length;i++){
			String s=a[i];
			
		for(int j=s.length()-1;j>=0;j--){
			System.out.print(s.charAt(j));
		}
		System.out.print(" ");
	}
}
}
