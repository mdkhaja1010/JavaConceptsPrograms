package ArraysProgram;

public class SecondLargestNum {
	public static int secondLargestNum(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
			
		}
		return a[a.length-2];
		
	}
	public static void main(String[] args) {
		int a[]= {10,40,20,80,70,90,30,100};
		System.out.println("the second largest element in the given array is "+secondLargestNum(a));
	}

}
