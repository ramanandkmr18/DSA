package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Problem Description
	Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
	Find the two integers that appear only once.
	
	Note: Return the two numbers in ascending order.
	
	
	Problem Constraints
	2 <= |A| <= 100000
	1 <= A[i] <= 109
	
	
	
	Input Format
	The first argument is an array of integers of size N.
	
	
	
	Output Format
	Return an array of two integers that appear only once.
	
	
	
	Example Input
	Input 1:
	A = [1, 2, 3, 1, 2, 4]
	Input 2:
	
	A = [1, 2]
	
	
	Example Output
	Output 1:
	[3, 4]
	Output 2:
	
	[1, 2]
	
	
	Example Explanation
	Explanation 1:
	3 and 4 appear only once.
	Explanation 2:
	
	1 and 2 appear only once.
 */
public class Single_Number {
	public int[] solve(int[] A) {
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	
	        int[] B = new int[2];        
	        int xor = 0; 
	
	        for(int i=A.length-1; i>=0; i--){
	            if(map.containsKey(A[i])){
	                map.remove(A[i]);
	            }else{
	                map.put(A[i], A[i]);
	            } 
	        } 
	        int i=0;
	        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
	            B[i] = entry.getKey();
	            i++;
	        }
	        Arrays.sort(B);
	        return B;
	    }
}
