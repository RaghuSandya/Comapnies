package MapInterFace;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
   public static void main(String[] args) {
	
	   TreeMap t = new TreeMap(new MyComparatore());
	   t.put(100, "XXXX");
	   t.put(101, "YYYY");
	   t.put(102, "ZZZZ");
	   t.put(104, null);
	   t.put(103, 106);
	   System.out.println("TreeMapResults:"+t);
}
}
class MyComparatore implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
