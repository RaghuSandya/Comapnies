package Programs;

public class StringPolimdrome {

	public static void main(String[] args) {
		String name = "Nagaraju";
		String rev = "";
		
		StringBuffer sb = new StringBuffer("giddaiah");
		System.out.println(sb.reverse());
		sb.append("Nagaraju");
		StringBuffer s = sb.reverse();
		System.out.println(s);
	System.out.println(s.length());
	
		
		
		char[] ch = name.toCharArray();
		System.out.println(ch.length);
		for (int i=ch.length-1; i>=0; i--){
			rev += ch[i];
		}
		System.out.println("Revers String  "+rev);

	}

}
