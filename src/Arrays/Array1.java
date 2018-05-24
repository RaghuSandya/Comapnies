
package Arrays;

public class Array1 {

	//public static void main(String[] args) {
		
		public static void main(String[] args) 
		{
		 System.out.print(sum(new int[]{1,2,3,7}));//100
		}
		public static int sum(int[] x)
		{
			int total=0;
	/**	// total=x[0]+x[1]+x[2]+x[3];
	     // System.out.println(total);
			//return total;
			for(int i=0;i<x.length;i++)
			{
				total=total+x[i];
				
				}
			//return total;
			
			for(int b:x)
			{
			  total =total+b;
			
			}
			return total; 
			
			int i=0;
			while(i<x.length)
			{
			  	total=total+x[i];
			  	i++;
			}
			return total; */
			int i=0;
			do
			{
				total=total+x[i];
				i++;
				
			}while(i<x.length);
			return total;		
			
	}
}