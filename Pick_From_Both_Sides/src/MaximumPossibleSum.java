import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are given an integer array A of size N.
	You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
	Find and return this maximum possible sum.	
	NOTE: Suppose B = 4, and array A contains 10 elements, then	
	You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.
		
	Problem Constraints
	1 <= N <= 105	
	1 <= B <= N
	
	-103 <= A[i] <= 103
	
	Input Format
	First argument is an integer array A.	
	Second argument is an integer B.
	
	Output Format
	Return an integer denoting the maximum possible sum of elements you picked.
	
	Example Input
	Input 1:
	 A = [5, -2, 3 , 1, 2]
	 B = 3
	 
	Input 2:
	 A = [1, 2]
	 B = 1
	
	
	Example Output
	Output 1:
	 8
	 
	Output 2:
	 2
	
	Example Explanation
	Explanation 1:
	
	Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
	Explanation 2:
	
	Pick element 2 from end as this is the maximum we can get
 */
public class MaximumPossibleSum {

	public static void main(String[] args) {
	    Integer[] arr = { 5, -2,100, 3, 1, 2 };
	    System.out.println(solve(Arrays.asList(arr), 3));
	
	}
	public static int solve1(ArrayList<Integer> A, int B) {
        int n = A.size();
        /*
          Collect/ Calculate the sum of first B length continuous number 
        */
        int currentSum = 0;

        for(int i=0; i<B; i++){
            currentSum += A.get(i);
        }
        /*
            Get the first B length of element in current Sum 
        */
        int max = currentSum;
        /*
            Now we have to include the element from right most element and subtract frolm left element from Lenght B
            to include and exclude the element from currentSum  
        */
        int include_index=n-1;
        int exclude_index=B-1;
        
        while(include_index>=0 && exclude_index>=0){
            currentSum += A.get(include_index);
            currentSum -= A.get(exclude_index);
            max = Math.max(max, currentSum);
            /*
             * Reduce index from right end side that is include from left side element 
             * Reduce index from left end side that now subtract element from currentSum
            */
            include_index--;
            exclude_index--;
        }

        return max;
    }
	public static int solve(List<Integer> A, int B) {
	
	    int n = A.size();
	
	    int result = 0;
	
	    for (int i = 0; i < B; i++) {
	        result += A.get(i);
	    }
	
	    int sum = result;
	
	    for (int i = 0; i < B; i++) {
	        sum -= A.get(B - 1 - i);
	        sum += A.get(n - 1 - i);
	
	        result = Math.max(result, sum);
	    }
	
	    return result;
	
	}

}
