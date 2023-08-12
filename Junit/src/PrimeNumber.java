import java.lang.Math;

public class PrimeNumber {
	public boolean isPrime(int n) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if ((n%i)==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber() ;
		p.isPrime(4);
	}
}
