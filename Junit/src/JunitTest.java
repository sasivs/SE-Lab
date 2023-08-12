import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
//	@Test
//	public void primeNumberTest() {
//		PrimeNumber p = new PrimeNumber();
//		boolean output = p.isPrime(4);
//		assertEquals(false, output);
//	}
//	
//	@Test
//	public void fibonacciTest() {
//		Fibonacci f = new Fibonacci();
//		int[] result = new int[5];
//		result = f.fibonacci(5);
//		int[] expected_result = {0,1,1,2,3};
//		for (int i=0; i<5; i++) {			
//			assertEquals(result[i], expected_result[i]);
//		}
//	}
//	
//	@Test
//	public void substring() {
//		Substring st = new Substring();
//		String s = st.substring("abababbab",2);
//		assertEquals(s, "aba");
//	}
//	
//	@Test
//	public void hanoiTowers_postive() {
//		HanoiTowers ht = new HanoiTowers();
//		int result = ht.getSteps(3);
//		assertEquals(result, 7);
//	}
//	@Test
//	public void hanoiTowers_negative() {
//		HanoiTowers ht = new HanoiTowers();
//		int result = ht.getSteps(3);
//		assertEquals(result, 6);
//	}
//	@Test
//	public void diagEle_positive() {
//		DiagonalElements de = new DiagonalElements();
//		int[] expected_result = {1, 6, 11, 16, 4, 7, 10, 13};
//		int[] result = new int[8];
//		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		result = de.getDiagonalElements(matrix);
//		assertEquals(result.length, expected_result.length);
//		for (int i=0; i<expected_result.length; i++) {			
//			assertEquals(result[i], expected_result[i]);
//		}
//	}
//	@Test
//	public void diagEle_negative() {
//		DiagonalElements de = new DiagonalElements();
//		int[] expected_result = {1, 6, 12, 16, 4, 7, 10, 13};
//		int[] result = new int[8];
//		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		result = de.getDiagonalElements(matrix);
//		assertEquals(result.length, expected_result.length);
//		for (int i=0; i<expected_result.length; i++) {			
//			assertEquals(result[i], expected_result[i]);
//		}
//	}
//	
//	@Test
//	public void otpgen_positive() {
//		OTPGen og = new OTPGen();
//		int result = 4027;
//		assertEquals(result, og.genOTP(420230));
//	}
//	
//	@Test
//	public void otpgen_negitive() {
//		OTPGen og = new OTPGen();
//		int result = 4026;
//		assertEquals(result, og.genOTP(420230));
//	}
//	
	@Test
	public void det_positive() {
		Determinant d = new Determinant();
		int[][] matrix = {{3,2,3,4}, {3,4,3,5}, {1,2,3,9}, {7,8,9,10}};
		assertEquals(-96, d.determinant(matrix));
	}
	
	@Test
	public void det_negative() {
		Determinant d = new Determinant();
		int[][] matrix = {{3,2,3,4}, {3,4,3,5}, {1,2,3,9}, {7,8,9,10}};
		assertEquals(-100, d.determinant(matrix));
	}
}
