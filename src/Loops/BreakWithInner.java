package Loops;

public class BreakWithInner {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(j==2&&i==2){
					break;
				}
				System.out.println(i+"  "+j);
			}
		}
	}

}
