import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem Description
	You are given a matrix A, you have to return another matrix which is the transpose of A.
	
	NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row
	
	Problem Constraints	
	1 <= A.size() <= 1000	
	1 <= A[i].size() <= 1000	
	1 <= A[i][j] <= 1000	
	
	Input Format
	First argument is vector of vector of integers A representing matrix.
	
	Output Format
	
	You have to return a vector of vector of integers after doing required operations.
	
	Example Input
	
	Input 1:
	
	A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
	Input 2:
	
	A = [[1, 2],[1, 2],[1, 2]]
	
	
	Example Output
	
	Output 1:
	
	[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
	Output 2:
	
	[[1, 1, 1], [2, 2, 2]]
	
	
	Example Explanation
	
	Explanation 1:
	
	Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
	 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 */
public class Transpose {

	public static void main(String[] args) {
		
		//int A[][] = {{1,3,4},{2,4,3},{3,4,5}};
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		
		A.add(new ArrayList<Integer>(Arrays.asList(1,3,4 )));
		A.add(new ArrayList<Integer>(Arrays.asList(2,4,3 )));
		A.add(new ArrayList<Integer>(Arrays.asList(3,4,5 )));
		
		System.out.println("Original Matrix");
		
		System.out.println(A);
		
		System.out.println("Transposed Matrix");
		
		System.out.println(solve2(A)); 

	}
	public static int[][] solve1(int[][] A) {
        int rowA = A.length;
        int colA = A[0].length; 

        int C[][] = new int[colA][rowA];

        for(int i = 0; i < rowA; i++) {
            for(int j = 0; j < colA; j++){ 
                C[j][i] = A[i][j];
            } 
        }

        return C; 
    }
	public static ArrayList<ArrayList<Integer>> solve2(ArrayList<ArrayList<Integer>> A) {
		
		ArrayList<ArrayList<Integer>> C = new ArrayList<ArrayList<Integer>>();
		
        int rowA = A.size();
        int colA = A.get(0).size();  
        
        for(int i = 0; i < rowA; i++) {
            for(int j = 0; j < colA; j++){ 
                C.get(j).add(A.get(i).get(j) );
            } 
        }

        return C; 
    }

}
