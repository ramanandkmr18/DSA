import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Problem Description
	You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
	 
	Problem Constraints
	1 <= A.size() <= 103 
	1 <= A[i].size() <= 103 
	0 <= A[i][j] <= 103 
	
	Input Format
	First argument is a vector of vector of integers.(2D matrix). 
	
	Output Format
	Return a vector of vector after doing required operations. 
	
	Example Input
	Input 1:
	
	[1,2,3,4]
	[5,6,7,0]
	[9,2,0,4]
	
	
	Example Output
	Output 1:
	
	[1,2,0,0]
	[0,0,0,0]
	[0,0,0,0]
	
	
	Example Explanation
	Explanation 1:
	
	A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */
public class CreateRowAndColumnZero {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		
		A.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		A.add(new ArrayList<Integer>(Arrays.asList(5,6,7,0)));
		A.add(new ArrayList<Integer>(Arrays.asList(9,2,0,4)));
		
		System.out.println("Original Array List");
		System.out.println(A);
		
		System.out.println("------------------");
		
		System.out.println(solve(A));
		
	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) { 
		 
		Set<Integer> rowList = new HashSet<Integer>();
		Set<Integer> colList = new HashSet<Integer>();

        int row = A.size();
        int col = A.get(0).size();

        /*
            find the list of row and col where we find the emenet 0
        */
        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                if(A.get(i).get(j)==0){
                    rowList.add(i);
                    colList.add(j);
                }
            }
        } 
        
        // insert Value if that not contains the element the rowHashSet and colHashSet value 
        
        for(int i=0; i< row; i++) {        	
        	for(int j = 0; j < col; j++) {
        		if(rowList.contains(i)){
        			A.get(i).set(j, 0);
        		}
        	} 
        }
        
        for(int i=0; i< row; i++) {        	
        	for(int j = 0; j < col; j++) {
        		if(colList.contains(j)){
        			A.get(i).set(j, 0);
        		}
        	} 
        }
        
        return A;

    }

}
