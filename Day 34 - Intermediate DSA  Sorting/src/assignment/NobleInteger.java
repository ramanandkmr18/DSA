package assignment;

import java.util.Arrays;
/*
 * Problem Description
	Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
	 
	Problem Constraints
	1 <= |A| <= 2*105
	1 <= A[i] <= 107 
	
	Input Format
	First and only argument is an integer array A.  
	
	Output Format
	Return 1 if any such integer p is present else, return -1. 
	
	Example Input
	Input 1:
	
	A = [3, 2, 1, 3]
	Input 2:
	
	A = [1, 1, 3, 3]
	
	Example Output
	Output 1:
	
	 1
	Output 2:
	
	 -1
 */
public class NobleInteger {

	public static void main(String[] args) {
		
		int[] A = {5, 6, 2};
		 
		
		System.out.println(solve(A));

	}
	public static int solve(int[] A) { 
		Arrays.sort(A); 
        int nobel=0;
        /*
            this is base condition when all element is less than 0 including 0
            A:[-6,-5,-4,-2,-1,0]
            here A[n-1] == 0 because after zero no elemnt present
        */

        if(A[A.length-1]==0){
            return 1;
        }

        for(int i=0; i<A.length-1; i++){

            if(A[i]!=A[i+1]){
                int count = A.length -i-1; 
                if(A[i] == count){
                    return 1;
                }
            } 
        }

        return -1;
    }

}
