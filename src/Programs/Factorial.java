package Programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num for which you want Factorial");
		int num=sc.nextInt();
		
		for(int i=num-1;i>num;i--){
			num=num*i;
		}
		System.out.println(num);
	}

}
