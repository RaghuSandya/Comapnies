package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("A");
		a.add(10);
		a.add(null);
		System.out.println("Arryalist of:"+a);
		
		a.remove(1);
		System.out.println("Arrayremove:"+a);
		
		a.add(1,"M");
		System.out.println("ArrayofAdd:"+a);
		
		a.add("n");
		System.out.println("ArrayAdd:"+a);
		List l1=Collections.synchronizedList(a);
		System.out.println("List of arrayList:"+l1);
		 
		 
	}
}
	


