package MapInterFace;

import java.util.HashMap;

public class LinkedHashMap {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1, "Giddu");
		m.put(i2, "Dhoni");
		System.out.println("LinkedHashMapResults:"+m);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		System.out.println(m.get(10));
	}

}
