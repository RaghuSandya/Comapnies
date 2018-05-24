package Arrays;
public class ArraysDemo {
	public static void main(String[] args) {
	//valid
	int[] a;//recommended to use because name is clearly separated from the type 
	int[] b;//at the time of declaration  we cannot specify the size other wise we will get compile time error 
	
	/*invalid
	int[5] c;*/
	
	//Two dimensional array
	int[][] c;
	int d [][];
	int []e[];
	
	//Three dimensional array
	int[][][]f;
	int[][]g[];
	
	//Array construction
	//Rule 1
	int[] a1=new int[3];
	//int[] a2=new int[]; Array dimension missing
	
	//Rule 2
	int[] a2=new int[0];
	System.out.println("lenght of the Array:"+a2.length);
	
	//Rule 3:NASE
	int[] a3=new int[-1];
	System.out.println("nagitive array size exception:"+a3.length);
	
  }
}
