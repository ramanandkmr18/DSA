package secondLargest;

import java.util.ArrayList;
import java.util.Scanner;

/*
	 * Problem Description
		You are given an integer array A. You have to find the second largest 
		element/value in the array or report that no such element exists.
		
		Input Format
		The first argument is an integer array A.
		
		Output Format
		Return the second largest element. If no such element exist then return -1
	*/

public class FindSecondLargest {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(589074291);
		arrayList.add(589074291);
		arrayList.add(589074291);
		arrayList.add(589074291);
		arrayList.add(589074291); 
		
		System.out.print(getSecondLargest(arrayList));

	}
	public static int getSecondLargest(ArrayList<Integer> A) {
		int size = A.size();

        if(size<2){
            return -1;
        }

        int F_largest= Integer.MIN_VALUE;
        int S_largest= Integer.MIN_VALUE;
        
        int largestElementIndex = 0;
        // find first largest Element means Max element 
        
        for(int i=0; i<size; i++) {
        	if(F_largest< A.get(i)) {
        		F_largest = A.get(i);
        		largestElementIndex = i;
        	}
        }
        
        // find the second Largest 
        
        for(int i=0; i<size; i++) {
        	if(i!=largestElementIndex) {            	
            	if(S_largest<=A.get(i)) {
            		S_largest = A.get(i);
            	}
            }
        }
        
        return S_largest == Integer.MIN_VALUE?-1:S_largest;
    }

}
