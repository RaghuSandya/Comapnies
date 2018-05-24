package QualiTest;

public class SecondLargestNumArray {
	public  static int getSecond(int[]a,int total){
		int temp;
		for(int i=0;i<total;i++){
			
			for(int j=i+1;j<total;j++){
				
				if(a[i]>a[j]){
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		int a[]={12,45,21,54,75};
		System.out.println("Second Largest:"+getSecond(a,5));
	}
}

