package programsNumbers;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=9,sum=1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
