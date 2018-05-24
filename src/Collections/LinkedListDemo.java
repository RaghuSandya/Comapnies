package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Giddaiah");
		l.add(30);
		l.add(null);
		l.add("Giddaiah");
		System.out.println("LinkedList:"+l);
		l.set(2, "Nese");
		System.out.println("Linkedlist set:"+l);
		l.remove();
		System.out.println("LinkedList remove:"+l);
		l.removeFirst();
		System.out.println("LinkedListRemoveFirst:"+l);
		l.addFirst("James");
		System.out.println("LinkedAddFirst:"+l);
		
	}

}
