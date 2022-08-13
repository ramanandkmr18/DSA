import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem Description
	You are given an integer array A of length N.
	You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
	For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
	More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
		
	Problem Constraints
	1 <= N, M <= 105
	1 <= A[i] <= 109
	1 <= L <= R <= N	
	
	Input Format
	The first argument is the integer array A.
	The second argument is the 2D integer array B.	
	
	Output Format
	Return an integer array of length M where ith element is the answer for ith query in B.
		
	Example Input
	Input 1:
	A = [1, 2, 3, 4, 5]
	B = [[1, 4], [2, 3]]
	Input 2:
	
	A = [2, 2, 2]
	B = [[1, 1], [2, 3]]
	
	
	Example Output
	Output 1:
	[10, 5]
	
	Output 2:	
	[2, 4]
		
	Example Explanation
	Explanation 1:
	The sum of all elements of A[1 ... 4] = 1 + 2 + 3 + 4 = 10.
	The sum of all elements of A[2 ... 3] = 2 + 3 = 5.
	
	Explanation 2:
	
	The sum of all elements of A[1 ... 1] = 2 = 2.
	The sum of all elements of A[2 ... 3] = 2 + 2 = 4.
 */
public class FindRangeSumQuery {

	public static void main(String[] args) {
		//Integer[] A = {1, 2, 3, 4, 5};
		//Integer[][] B = {{1, 4}, {2, 3}};
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		
		A.add(2);
		A.add(2);
		A.add(2);
		//A.add(4);
		//A.add(5);
		
		B.add(0,new ArrayList<Integer>(Arrays.asList(1,1)));
		B.add(1,new ArrayList<Integer>(Arrays.asList(2,3)));  
		
		ArrayList<Long> rangeSumArrayIntegers = rangeSum(A,B);
		
		System.out.println(rangeSumArrayIntegers);		

	}
	public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		/*
		 * Better to create the prefix Array list which help to calculate the Range sum Query
		*/
		ArrayList<Long> prefixList = new ArrayList<Long>();
		ArrayList<Long> rangeList = new ArrayList<Long>();
		
		long sum = 0l;
		
		for(int i=0; i<A.size(); i++) {
			sum = sum + A.get(i);
			prefixList.add(sum);
		}
		
		//System.out.println(A);
		//System.out.println(B);
		
		//System.out.println(prefixList);
		
		int row = B.size(); 
		int end = 0;
		int start = 0;
		 
		
		for(int i=0; i<row; i++) {
			int col = B.get(0).size();
			long r_sum =0l;
			
			for(int j=0; j<col; j++) {
				if(j==0) {
					start = B.get(i).get(j);
				}else {
					end = B.get(i).get(j);
				} 
			}
			
			if(start==0) {
				r_sum = prefixList.get(end); 
			}else if(start==1) {
				r_sum = prefixList.get(end-1); 
			}else {
				r_sum = prefixList.get(end-1) - prefixList.get(start-2); 
			}
			
			rangeList.add(r_sum);
			
		}
		
		System.out.println(rangeList);
		
		return rangeList;
	}
	public static int rangeSum(ArrayList<Integer> arr, int start, int end) {
		
		int sum =0;
		while(start<end) {
			sum = sum + arr.get(start-1);
			start++;
		}
		
		return sum;
	}

}
