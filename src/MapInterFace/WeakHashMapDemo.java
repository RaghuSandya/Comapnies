package MapInterFace;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	
		public static void main(String[] args)throws Exception 
		{
			WeakHashMap m=new WeakHashMap();
			Test t=new Test();
			m.put(t,"ashok");
			System.out.println(m);//{Temp=ashok}
			t=null;
			System.gc();
			Thread.sleep(5000);
			System.out.println(m);//{}
		}
	}
	class Test
	{
		public String toString()
		{
			return "Test";
		}
		public void finalize()
		{
			System.out.println("finalize() method called");
		}
	}
