package Programs;

import java.util.Scanner;

public class Febonacci {
	//static int n;

	public static void main(String[] args) {
		int k,a=0,b=1;
		System.out.print("Enter any number");
		Scanner sc=new Scanner(System.in);
		
		k=0;
		int n = sc.nextInt();
		
		System.out.print(a+" ,"+b+ " ");
		while(k<=n){
			k=a+b;
			System.out.print(","+k);
			a=b;
			b=k;
	}
	
	
	}
}



