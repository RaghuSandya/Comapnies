package Arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		System.out.println("Caluculate Sum and Average marks of a Student:");
		Scanner sc= new Scanner(System.in);
		System.out.println("How many subjects:");
		int s=sc.nextInt();
		boolean result=true;
		int[] marks=new int[s];
		int total=0;
		for(int i=0;i<s;i++)
		{
		System.out.println("Enter "+(i+1)+" st subject marks:");
		marks[i]=sc.nextInt();
		
		total=total+marks[i];
		if(marks[i]<35)
			result=false;
		}
		
		double per=(total/s*100)/100;
		if(result)
		{
			System.out.print("pass/fail:P with");
			if(per>=75)
				System.out.println("Distinction");
			else if(per>=60)
			System.out.println("First class");
			else if(per>=50)
				System.out.println("second class");
			else
				System.out.println("third class");
		}
		else
			System.out.println("pass/fail:F");
		//double avg=(double)(total/s);
		System.out.println("Sum of the Marks="+total);
		//System.out.println("Average marks of a Student Is:"+avg);
		System.out.println("percentage=:"+per+"%");
		

	}

}
