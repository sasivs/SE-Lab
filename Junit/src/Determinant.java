public class Determinant{
	public int[][] prepareSubMatrix(int[][]matrix, int r, int c){
		int rows = matrix.length;
		int cols = matrix[0].length;
		int [][] sub_matrix = new int[rows-1][cols-1];
		int rIndex=0, cIndex=0;
		for(int i=0; i<rows; i++) {
			if (i==r) continue;
			cIndex=0;
			for(int j=0; j<cols; j++) {
				if (j==c) continue;
				sub_matrix[rIndex][cIndex] = matrix[i][j];
				cIndex+=1;
			}
			rIndex+=1;
		}
		return sub_matrix;
	}
	
	public int getDeterminant(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows==1 && cols==1) {
			return matrix[0][0];
		}
		if (rows == 2 && cols == 2) {
			return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
		}
		int det = 0, sub;
		for (int i=0; i<rows; i++) {
			int [][] sub_matrix = prepareSubMatrix(matrix, 0, i);
			sub = getDeterminant(sub_matrix);
			det+=matrix[0][i]*sub*Math.pow(-1, i);
		}
		return det;
	}
	
	public int determinant(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows!=cols) {
			return -1;
		}
		int det = 0, sub;
		for (int i=0; i<cols; i++) {
			int [][] sub_matrix = prepareSubMatrix(matrix, 0, i);
			sub = getDeterminant(sub_matrix);
			det+=matrix[0][i]*sub*Math.pow(-1, i);
		}
		return det;
	}
	public static void main(String[] args) {
		Determinant d = new Determinant();
		int[][] matrix = {{3,2,3,4}, {3,4,3,5}, {1,2,3,9}, {7,8,9,10}};
		int det = d.determinant(matrix);
		System.out.println("Det: " + det);
	}
}