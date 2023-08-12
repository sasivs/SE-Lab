
public class DiagonalElements {
	public int[] getDiagonalElements(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int diag = Math.min(rows, cols);
		int[] result = new int[2*diag];
		for (int i=0; i<diag; i++) {
			result[i] = matrix[i][i];
			result[i+diag] = matrix[i][diag-1-i];
		}
		return result;
	}
}
