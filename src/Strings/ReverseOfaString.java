package Strings;

public class ReverseOfaString {
	public static void main(String[] args) {
		String str="GIDDAIAH";
		//converting string to char Array
		
		char[] try1=str.toCharArray();
		
		for(int i=try1.length-1;i>=0;i--){
			System.out.print(try1[i]);
		}
	}

}
