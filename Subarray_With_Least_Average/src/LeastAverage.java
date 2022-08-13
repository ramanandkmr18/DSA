import java.util.ArrayList;
/*
 * Given an array of size N, find the subarray of size K with the least average.
	 
	Problem Constraints
	1<=k<=N<=1e5
	-1e5<=A[i]<=1e5
	
	
	Input Format
	First argument contains an array A of integers of size N.
	Second argument contains integer k.
	
	
	Output Format
	Return the index of the first element of the subarray of size k that has least average.
	Array indexing starts from 0.
	
	
	Example Input
	Input 1:
	A=[3, 7, 90, 20, 10, 50, 40]
	B=3
	Input 2:
	
	A=[3, 7, 5, 20, -10, 0, 12]
	B=2
	
	
	Example Output
	Output 1:
	3
	Output 2:
	
	4
	
	
	Example Explanation
	Explanation 1:
	Subarray between indexes 3 and 5
	The subarray {20, 10, 50} has the least average 
	among all subarrays of size 3.
	Explanation 2:
	
	 Subarray between [4, 5] has minimum average
 */
public class LeastAverage {

	public static void main(String[] args) {
		 //int[] A = {3, 7, 5, 20, -10, 0, 12};
		 int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		 int B = 9;
		 
		 System.out.println("LeastAverage "+ getLeastAverageSubArrayIndex(A,B) );
	}
	public static int getLeastAverageSubArrayIndex(int[] A, int B) {
		int n = A.length;
        int leastAverage = Integer.MAX_VALUE; 
        int startMinIndex = 0;

        for(int i=0; i< n-B; i++){

            int sum = 0; 
            for(int j=i; j < i+B; j++){
                sum += A[j];  
            }
            if(sum < leastAverage){
                leastAverage = sum;
                startMinIndex = i;
            }  
        }
        return startMinIndex ;
    }

}
