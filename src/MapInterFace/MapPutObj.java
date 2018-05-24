package MapInterFace;

import java.util.HashMap;

public class MapPutObj {
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("100", "Giddu");
		System.out.println("HashMapPutObj:"+hm);
		hm.put("100", "Raghu");
		System.out.println("HashMapPutObj:"+hm);
		
		hm.get(100);
		System.out.println("GetMethod:"+hm);
	}

}
