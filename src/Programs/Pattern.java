package Programs;

/*1		  1
    2   2
      3 
    4    4
  5        5*/

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j || i+j==5)
					System.out.println(i);
				else
					System.out.print(" ");
			}
		}
		System.out.println( );
	}

}
