import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  Input Format
	First and only argument is a 2D integer matrix A. 
	
	Output Format
	Return an integer denoting the sum of main diagonal elements.
	
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
	
	 15 
	Output 2:
	
	 6 
	
	
	Example Explanation
	Explanation 1:
	
	 A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
	Explanation 2:
	
	 A[1][1] + A[2][2] = 3 + 3 = 6
 */
public class DiagonalSum {

	public static void main(String[] args) {
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		
		A.add(new ArrayList<Integer>(Arrays.asList(1, -2, -3)));
		A.add(new ArrayList<Integer>(Arrays.asList(-4, 5, -6)));
		A.add(new ArrayList<Integer>(Arrays.asList(-7, -8, 9)));
		
		System.out.print(solve(A));
		

	}
    public static int solve(final List<ArrayList<Integer>> A) {

        int row = A.size();
        int col = A.get(0).size();
        int diagonalSum = 0;

        for(int i=0; i<row; i++){ 
            for(int j=0; j<col; j++){
                if(i==j){
                    diagonalSum += A.get(i).get(j);
                }
            }
        }

        return diagonalSum;
    }

}
