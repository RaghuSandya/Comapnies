package Collections;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet(); 
		
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add(null);
		System.out.println(lhs.add("null"));
	}
}
