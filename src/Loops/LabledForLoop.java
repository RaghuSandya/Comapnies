package Loops;

public class LabledForLoop {
 
	public static void main(String[] args) {
		aa:
			for(int i=1;i<=4;i++){
				bb:
					for(int j=1;j<=4;j++){
						if(i==1&&j==3){
						break aa;
						}
						System.out.println(i+" "+j);
					}
			}
	}
}
