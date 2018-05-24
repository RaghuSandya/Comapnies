package Strings;

public class Demo {
	public static void main(String[] args) {
		/**StringBuffer Sbuffer=new StringBuffer("helloo");
		Sbuffer.reverse();
		Sbuffer.delete(1, 3);
		System.out.println(Sbuffer.toString());**/
		
	//Case 1:
		String s=new String("Bhaskar");
		String s1=new String("Software");
		String g=s.concat(s1);
		System.out.println(g);
		
		
		StringBuffer sb=new StringBuffer("Bhasker");
		sb.append("software");//Append method adds two strings in S.Buffer
		System.out.println(sb);
		
	//case3:
		String s2=new String("Bhaskar");
		System.out.println(s1==s2);
		System.out.println(s.equals(s2));//compare the content of the object
		
		StringBuffer sb1=new StringBuffer("Ashoke");
		StringBuffer sb2=new StringBuffer("Ashoke");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
	//case3:
		String m=new String("GIDDAIAH");//Two obj created one is heap and SCP.
		String a="GIDDAIAH";//only one obj created in SCP
		
		
		
		
		
	}
}
