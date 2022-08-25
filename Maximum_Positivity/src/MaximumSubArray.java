import java.util.ArrayList;

/*
 * Problem Description
	Given an array of integers A, of size N.
	
	Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.
	NOTE: It is guaranteed that an answer always exists. 
	
	Problem Constraints
	1 <= N <= 105
	-109 <= A[i] <= 109
	
	Input Format
	The first and only argument given is the integer array A.
	
	Output Format
	Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.
	
	
	Example Input
	Input 1:
	
	 A = [5, 6, -1, 7, 8]
	Input 2:
	
	 A = [1, 2, 3, 4, 5, 6]
	
	
	Example Output
	Output 1:
	
	 [5, 6]
	Output 2:
	
	 [1, 2, 3, 4, 5, 6]
	
	
	Example Explanation
	Explanation 1:
	
	 There are two subarrays of size 2 having only non-negative elements.
	 1. [5, 6]  starting point  = 0
	 2. [7, 8]  starting point  = 3
	 As starting point of 1 is smaller, return [5, 6]
	Explanation 2:
	
	 There is only one subarray of size 6 having only non-negative elements:
	 [1, 2, 3, 4, 5, 6]
 */
public class MaximumSubArray {

	public static void main(String[] args) {
		int[] A = {-3674875, 5305422, 7665178, 205505, -7168198, -1398091, 5392310, -1700856, 1259052, -3056006};
		 
		int[] result = solve(A);
		
		System.out.println("original Array");
		
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		System.out.println();
		System.out.println("Resultant Array");
		System.out.println();
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		System.out.println();
		
		 
 
	}
	public static int[] solve(int[] A) {  
        
        ArrayList<ArrayList<Integer>> overAllList = new ArrayList<ArrayList<Integer>>();
        
        int res = 0;
        int n = A.length;

        if(isNagativePresent(A)){          
 
            for(int i=0; i<A.length; i++){
               
               // Count of current non-negative integers
               int curr_count = 0; 
               ArrayList<Integer> currList = new ArrayList<Integer>();
                while(i < n && A[i] >= 0){
                    curr_count++; 
                    currList.add(A[i]);
                    i++;
                }
                res = Math.max(res, curr_count);
                overAllList.add(currList);
            } 
        }else{
            return A;
        }

        int size = overAllList.size();
        int[] arr = new int[res];
        
        for(int i=0; i<size; i++){
            if(res == overAllList.get(i).size()){
            	
                for(int j=0; j<res; j++){
                    arr[j] = overAllList.get(i).get(j);
                }

                break;
            }
        } 
        return arr;
    }
    public static boolean isNagativePresent(int[] A){

        for(int i=0; i<A.length; i++){
            if(A[i]<0){
                return true;
            }
        }

        return false;
    }

}
