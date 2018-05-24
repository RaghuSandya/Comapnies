package Collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("G");
		s.push("I");
		s.push("D");
		
		System.out.println("StackOut:"+s);
		System.out.println("stackSearchD:"+s.search("D"));
		System.out.println("StackPoP:"+s.pop());
		System.out.println("StackResults:"+s);
		System.out.println("stackPeeK:"+s.peek());
		System.out.println("stackSearch:"+s.search("G"));
		System.out.println("stacksearch:"+s.search("H"));
		
	}

}
