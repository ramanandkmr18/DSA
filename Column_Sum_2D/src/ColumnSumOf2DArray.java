
public class ColumnSumOf2DArray {
	public static void main(String[] args) {
		int[][] A = { 	{ 1, 2, 3, 4 },
                		{ 5, 6, 7, 8 },
                		{ 9, 10, 11, 12 }  
                	};
		int[] res = solve(A);
		
	}
	public static int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        int[] result = new int[col];

        for(int i=0; i<col; i++){
            int sum = 0;
            for(int j=0; j<row; j++){
                sum += A[j][i];
            }
            result[i] = sum;
        }

        return result;
    }
}
