package ControlLogics;

public class SwitchStatement {
	//Execute one condition multiple times.its like a if else if
	
	public static void main(String[] args) {
		
		int num=50;
		switch(num){
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("Not in 10,20 or 30");
		}	
	}
}
