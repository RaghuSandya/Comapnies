package OOPs;

public class MethodOverLoading {//class is a blue print or a plan use to create an object;contains data members and there action
	static int a,b;//static variables
	 int c=1,d=2;//instance variables 
	void disply(int a,int b){
		System.out.println(a+b);
	}
	void disply(float a,int b){
		System.out.println((a+b));
	}
		void disply(){
			int e=10,f=20;//local variables
	System.out.println((e+f));
	}
	public static void main(String[] args) {
		
		MethodOverLoading d=new MethodOverLoading();//object is a instance of class 
		d.disply(1,2);
		d.disply(1.0f, 2);
		System.out.println(d.d);//using object
		System.out.println(MethodOverLoading.a);//using class name
		d.disply();
		
	}

}
/*note;JVM allocates defaults values to the instance and static variable 
but not local variables*/
