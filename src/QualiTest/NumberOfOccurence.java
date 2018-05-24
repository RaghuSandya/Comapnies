package QualiTest;

public class NumberOfOccurence {
	public static int Occur(String str,char ch){
		
		int cunt=0;
		int indx=0;
		
		while(indx<str.length()){
			if(str.charAt(indx)==ch){
				cunt++;
			}
			indx++;
		}
		return cunt;
	}
	public static void main(String[] args) {
		String stri="GIDDAIAH DGDFD";
		char ch1='D';
		int cunt=0;
		for(int i=0;i<=stri.length()-1;i++){
			char ch11=stri.charAt(i);
			if(ch1==ch11){
				cunt++;
			}
		}
		System.out.println("Number of occurence:"+Occur(stri, ch1));
	}
}
