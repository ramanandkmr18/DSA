/*
 * Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.

	Examples : 
	
	Input:
	Matrix:
	 1  2  3
	 4  5  6
	 7  8  9
	Output:
	 3  6  9 
	 2  5  8 
	 1  4  7 
	The given matrix is rotated by 90 degree 
	in anti-clockwise direction.
	
	Input:
	 1  2  3  4 
	 5  6  7  8 
	 9 10 11 12 
	13 14 15 16 
	Output:
	 4  8 12 16 
	 3  7 11 15 
	 2  6 10 14 
	 1  5  9 13
	The given matrix is rotated by 90 degree 
	in anti-clockwise direction.
 */
public class Rotate90DegInAntiClockWise {

	public static void main(String[] args) {
		
		int N = 4;
		 
	    // Test Case 1
	    int mat[][] = { { 1, 2, 3, 4 },
	                   { 5, 6, 7, 8 },
	                   { 9, 10, 11, 12 },
	                   { 13, 14, 15, 16 } };
	 
	    rotateMatrix(N, mat);
	 
	    // Print rotated matrix
	    displayMatrix(N, mat);
		 

	}
	static void rotateMatrix(int N, int mat[][])
	  { // REVERSE every row
	    for (int i = 0; i < N; i++)
	      Reverse(i,mat,N);
	 
	    // Performing Transpose
	    for (int i = 0; i < N; i++) {
	      for (int j = i; j < N; j++)
	      {
	        int temp=mat[i][j];
	        mat[i][j]=mat[j][i];
	        mat[j][i]=temp;
	      }
	    }
	  }
	 
	  // Function to print the matrix
	  static void displayMatrix(int N, int mat[][])
	  {
	    for (int i = 0; i < N; i++) {
	      for (int j = 0; j < N; j++)
	        System.out.print(" " + mat[i][j]);
	 
	      System.out.print("\n");
	    }
	    System.out.print("\n");
	  }
	static void Reverse(int i,int mat[][], int N)
	  {
	    // Initialise start and end index
	    int start = 0;
	    int end = N - 1;
	 
	    // Till start < end, swap the element
	    // at start and end index
	    while (start < end) {
	 
	      // Swap the element
	      int temp = mat[i][start];
	      mat[i][start] = mat[i][end];
	      mat[i][end] = temp;
	 
	      // Increment start and decrement
	      // end for next pair of swapping
	      start++;
	      end--;
	    }
	  }

}
