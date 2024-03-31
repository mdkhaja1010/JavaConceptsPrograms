package ArraysProgram;

public class DuplicateStringArray {
	public static void main(String[] args) {
		String a[]= {"java","c++","python","java","ruby","perl","c++"};
		
		boolean found =false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("the duplicate elements are "+a[i]);
					found=true;
					break;
				}
				
			}
				
		}
		if(found==false) {
			System.out.println("there is no duplicates");
		}
		
	}

}
