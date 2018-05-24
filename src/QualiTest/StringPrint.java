package QualiTest;

public class StringPrint {
public static void main(String[] args) {
	String str="Giddaiah is a common man";
	String[] n=str.split(" ");
	for(String Str1:n){
		if(Str1.equalsIgnoreCase("a")){
			System.out.println(Str1);
		}
	}
}
}
