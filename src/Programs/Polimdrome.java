package Programs;

public class Polimdrome {

	public static void main(String[] args) {
		int n=323,r,s=0;
		int t=n;
		
		/*int i = 123;
		System.out.println(3%10);*/
		while(n>0){
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
if(t==s){
	System.out.println("polindrom");
	
}else{
	System.out.println("not a polymdrome");
}
	}

}
