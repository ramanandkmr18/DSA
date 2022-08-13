import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Description
	You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
	Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
	
	Problem Constraints
	1 <= N <= 103
	-1000 <= A[i][j] <= 1000
	
	Input Format
	First and only argument is a 2D integer matrix A.
	
	Output Format
	Return an integer denoting the sum of minor diagonal elements.
	
	Example Input
	Input 1:
	
	 A = [[1, -2, -3],
	      [-4, 5, -6],
	      [-7, -8, 9]]
	Input 2:
	
	 A = [[3, 2],
	      [2, 3]]
	
	
	Example Output
	Output 1:
	
	 -5 
	Output 2:
	
	 4 
	
	
	Example Explanation
	Explanation 1:
	
	 A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
	Explanation 2:
	
	 A[1][2] + A[2][1] = 2 + 2 = 4
 */
public class DiagonalSumMinor {

	public static void main(String[] args) {
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(new ArrayList<Integer>(Arrays.asList(47, -59, 20, 33, 20, -47, -87, -59, 85)));
		A.add(new ArrayList<Integer>(Arrays.asList(8, -67, 48, -10, -23, -68, -28, 62, -94)));
		A.add(new ArrayList<Integer>(Arrays.asList(-50, 77, -39, -57, 15, 71, 44, 13, -53)));
		A.add(new ArrayList<Integer>(Arrays.asList(-30, 43, -92, -94, 42, 37, 95, 7, 19)));
		A.add(new ArrayList<Integer>(Arrays.asList(-1, 92, -85, 20, -53, -16, 31, -95, 4)));
		A.add(new ArrayList<Integer>(Arrays.asList(-62, 49, 0, 53, -93, -61, -49, 86, 97)));
		A.add(new ArrayList<Integer>(Arrays.asList(62, -26, -1, -38, 59, -93, -93, 12, -90)));
		A.add(new ArrayList<Integer>(Arrays.asList(78, 85, 90, 89, -65, 5, 48, 40, -86)));
		A.add(new ArrayList<Integer>(Arrays.asList(-79, -68, -89, 90, -40, 47, 68, -25, 92)));
		
		System.out.print(solve(A));
		
	}
	public static int solve(final List<ArrayList<Integer>> A) {
        int minorSum = 0;

        int row = A.size();
        int col = A.get(0).size();

        int start = 0; 
        int end = col-1;

        while(start<col && end>=0){ 
            minorSum += A.get(start).get(end); 
            start++;
            end--;
        }

        return minorSum;
    }

}
