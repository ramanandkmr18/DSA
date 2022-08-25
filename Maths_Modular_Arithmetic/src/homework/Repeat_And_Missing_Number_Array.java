package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntToDoubleFunction;

import javax.naming.ldap.SortControl;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

/*
 * There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
	This is one of those problems.
	Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105
	
	Food for thought :
	
	Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
	For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
	Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
	Obviously approach 1 is more susceptible to overflows.
	You are given a read only array of n integers from 1 to n.
	
	Each integer appears exactly once except A which appears twice and B which is missing.
	
	Return A and B.
	
	Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	
	Note that in your output A should precede B.
	
	Example:
	
	Input:[3 1 2 5 3] 
	
	Output:[3, 4] 
	
	A = 3, B = 4
 */
public class Repeat_And_Missing_Number_Array {
	 

	public static void main(String[] args) {
		 
		int[] A = {3,1,2,5,3};
		
		int[] output = repeatedNumber(A);
		
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i]+" ");
		}
		
	}
	
	public static int[] repeatedNumber(final int[] arr) {
		
		 /* Will hold xor of all elements
	       and numbers from 1 to n  */
	        int xor1;
	        
	        int n = arr.length;
	 
	        /* Will have only single set bit of xor1 */
	        int set_bit_no;
	 
	        int i;
	        int x = 0;
	        int y = 0;
	 
	        xor1 = arr[0];
	 
	        /* Get the xor of all array elements  */
	        for (i = 1; i < n; i++)
	            xor1 = xor1 ^ arr[i];
	 
	        /* XOR the previous result with numbers from
	       1 to n*/
	        for (i = 1; i <= n; i++)
	            xor1 = xor1 ^ i;
	 
	        /* Get the rightmost set bit in set_bit_no */
	        set_bit_no = xor1 & ~(xor1 - 1);
	 
	        /* Now divide elements into two sets by comparing
	    rightmost set bit of xor1 with the bit at the same
	    position in each element. Also, get XORs of two
	    sets. The two XORs are the output elements. The
	    following two for loops serve the purpose */
	        for (i = 0; i < n; i++) {
	            if ((arr[i] & set_bit_no) != 0)
	                /* arr[i] belongs to first set */
	                x = x ^ arr[i];
	 
	            else
	                /* arr[i] belongs to second set*/
	                y = y ^ arr[i];
	        }
	        for (i = 1; i <= n; i++) {
	            if ((i & set_bit_no) != 0)
	                /* i belongs to first set */
	                x = x ^ i;
	 
	            else
	                /* i belongs to second set*/
	                y = y ^ i;
	        }

        // now we can separate the missing and repeating number
        int[] output = new int[2];
        
        for(int val : arr){
            if(val == x){
                output[0] = x; // repeating
                output[1] = y; // missing
                break;
            }else if(val == y){
                output[0] = y;
                output[1] = x;
                break;
            }
        }

        return output;
	}
	public static int[] repeatedNumber1(final int[] A) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] output = new int[2];
		
		// find min and Max number
		
		// finding repeating Number
		for(int i=0; i<A.length; i++) {
			if(map.containsKey(A[i])) {
				output[0] = A[i];
				break;
			}else {
				map.put(A[i], A[i]);
			}
		}   
		// min value is =1
		// max Value
		int max = findMax(A);
		
		// Actual sum of 1 to max value
		long actualSum = (max *(max+1))/2;
		
		// find the sum of current Given Array
		long sum = 0;
		for(int i=0; i< A.length; i++) {
			sum +=A[i];
		}
		
		sum = sum - output[0]; // Subtract repeated Number
		
		int missingNum = (int) (actualSum - sum);
		
		if(missingNum==0) {
			output[1] = output[0]+1;
		}else {
			output[1] = missingNum;
		} 
		
		return output; 
    }
	public static int findMax(int[] A) { 
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<A.length; i++) {
			if(A[i]>max) {
				max = A[i];
			}
		}
		
		return max;
	}
	public static void sort(int[] A, int l, int r) {
		
		if(l<r) {
			int mid = l + (r-l)/2;
			
			sort(A, l, mid);
			sort(A, mid+1, r);
			merge(A, l, mid, r);
		}
	}

	private static void merge(int[] a, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		// Find sizes of two subarrays to be merged
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		/* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
        	L[i] = a[l + i];
        }
        for (int i = 0; i < n2; ++i) {
        	R[i] = a[(mid+1) + i];
        }
        
        /* Merge the temp arrays */
        
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }    
		
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
	}

}
