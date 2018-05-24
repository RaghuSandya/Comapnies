package StringBuffer;

public class BufferDemo {
	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println("capacity of Empty:"+sb.capacity());
	sb.append("abcdefghijklmnop");
	System.out.println("Capacity:"+sb.capacity());
	sb.append("q");
	System.out.println("capacity:"+sb.capacity());
	
	//int initial capacity StringBuffer
	StringBuffer sa=new StringBuffer(19);
	System.out.println("int intialcapacity:"+sa.capacity());
	
	//capacity StringBuffer(String S)
	StringBuffer s=new StringBuffer("Raghu");
	System.out.println("Capacity with String:"+s.capacity());
	
	//String Buffer Methods
	
	StringBuffer g = new StringBuffer("Giddaiah");
	System.out.println("BufferCapacity:"+g.capacity());
	System.out.println("BufferLenght:"+g.length());
	System.out.println("BufferCharAt:"+g.charAt(7));
	//System.out.println("BufferCharAt:"+g.charAt(30));
	System.out.println("BufferDeleteChar:"+g.deleteCharAt(2));
	System.out.println("BufferDeleteBgn:"+g.delete(1, 3));
	System.out.println("BufferReverse:"+g.reverse());
	
	//StringBuilder
	StringBuilder sd=new StringBuilder("Giddaiah");
	System.out.println("String Builder append:"+sd.append("V"));
	
}
}
