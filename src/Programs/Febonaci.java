package Programs;

public class Febonaci {

	public static void main(String[] args) {
		
int k,a=0,b=1;
k=0;
System.out.print(a+","+b+" ");
while(k<=12){
	k=a+b;
	System.out.print(","+k);
	a=b;
	b=k;
}
	}

}
