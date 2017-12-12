package Programs;

public class Pattren {
	public static void main(String[] args) {
		int i,j,n=4;
		char ch=' ';
		for(i=1;i<=n;i++){
			for(j=n;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
