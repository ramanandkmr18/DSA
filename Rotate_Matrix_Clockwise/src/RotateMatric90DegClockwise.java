/*
 * Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

	Examples: 
	
	Input:
	1 2 3 
	4 5 6
	7 8 9  
	Output:
	7 4 1 
	8 5 2
	9 6 3
	
	Input:
	1 2
	3 4
	Output:
	3 1
	4 2 
 */
public class RotateMatric90DegClockwise {
	static int N = 4;
	static int n = 4;
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
		System.out.println("Original Array");
		 print(arr);
		 
		 System.out.println("----------------------------");
		/*
		 * Best way
		 */
		rotate90Clockwise(arr);
		
		System.out.println();
		/*
		 * Second Best way
		 */
		rotate90Degreeclockwise(arr);
        print(arr);
	} 
    /*
     * Best way
     */
    static void rotate90Clockwise(int arr[][])
    {
        // printing the matrix on the basis of
        // observations made on indices.
        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    // Function to rotate the matrix 90 degree clockwise
	/*
	 * Approach: We first transpose the given matrix, and then reverse the content of individual rows to get the resultant 90 degree clockwise rotated matrix.
		
		1  2  3                                                       1  4  7                              7  4  1
		
		4  5  6 ——Transpose——>2  5  8 —-Reverse individual rows—->    2  5  8     (Resultant matrix)	   8  5  2   
		                                                    
		3  6  9                                                       9  6  3	                           9  6  3
		
	*/
	
    static void rotate90Degreeclockwise(int mat[][])
    {
       
        // Transpose of matrix
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
 
        // Reverse individual rows
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int t = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = t;
                low++;
                high--;
            }
        }
    }
    static void print(int mat[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }


}
