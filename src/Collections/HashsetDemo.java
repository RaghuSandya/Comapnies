package Collections;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("D");
		hs.add(null);
		hs.add(210);
		System.out.println(hs.add("D"));//False
		System.out.println("Toatal capacity:"+hs);
	}

}
