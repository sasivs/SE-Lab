
public class Fibonacci {
	public int[] fibonacci(int n){
		int[] numbers = new int[n];
		if (n==1) {
			numbers[0]=0;
		}
		else if(n==2) {
			numbers[0]=0;
			numbers[1]=1;
		}
		else {
			numbers[0]=0;
			numbers[1]=1;
			for (int i=2; i<n; i++) {
				numbers[i]=numbers[i-1]+numbers[i-2];
			}
		}
		return numbers;
	}
}
