package Collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("EmptyCapacity:"+v.capacity());
		for(int i=1;i<=10;i++){
			v.addElement(i);
		}
		System.out.println("Capacityfor:"+v.capacity());
		//Add Methods
		v.addElement("G");
		System.out.println("Vector size:"+v);
		System.out.println("VectorCapacityADD:"+v.capacity());
		v.add(null);
		System.out.println("Vector Add null:"+v);
		v.add(1, "Valkur");
		System.out.println("Vector add Index:"+v);
		v.addElement("Nese");
		System.out.println("total vector:"+v);
		
		
		//Remove Methods
		
		v.remove(1);
		System.out.println("RemoveIndex:"+v);
		v.remove(null);
		System.out.println("RemoveObjec:"+v);
		v.removeElement("Nese");
		System.out.println("removeElement:"+v);
		
		//Get Object
		v.get(0);
	    int c=v.capacity();
		System.out.println("GetObject:"+v);
		System.out.println("VectorCapacity:"+c);
		
	}

}
