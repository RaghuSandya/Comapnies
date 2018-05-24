package Infrrd;

/*5 4 3 2 1
  5 4 3 2 *
  5 4 3 * *
  5 4 * * *
  5 * * * * */

public class Pattern {
	public static void main(String[] args) {
		int i,j;
		
		//Start outer loop
		for(i=1;i<=5;i++){
			//InnerLoop
			for(j=5;j>=i;j--){
				System.out.print(j+" ");
			}
		
			for(int l=2;l<=i;l++)
			{
			System.out.print("*"+" ");
		    }
			
	      
			System.out.println();		
	}

	}
}
