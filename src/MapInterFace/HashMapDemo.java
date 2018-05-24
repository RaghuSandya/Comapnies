package MapInterFace;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put(100, "Giddu");
		m.put(101, "Raghu");
		m.put(102, "Ravi");
		m.put(103,"Hemanth");
		
		System.out.println("HashMapResults:"+m);
		System.out.println(m.put(100,"Sandy"));
		System.out.println("NewHashMap:"+m);
		
		Set s=m.keySet();
		System.out.println("HashKeySet:"+s);
		
		Set s1=m.entrySet();
		System.out.println("MapEntrySet:"+s1);
		
		Collection c=m.values();
		System.out.println("HashMapCollection:"+c);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getValue()+"....."+m1.getKey());
			
			if(m1.getKey().equals(100)){
				m1.setValue("Raghu");
			}
		}
		System.out.println("IteratorMapResults:"+m);
		
	}
}
