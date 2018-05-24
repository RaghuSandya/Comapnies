package Programs;

import java.util.Scanner;

public class Accending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array:");
	   int arr[]={sc.nextInt()};
	
		
		System.out.println("Enter values:");
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<arr.length;i++)
		{  
			if(arr[i]<arr[i-1])
			{
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]=arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
				i=0;
			}
		}
		for (int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}

	}

}
