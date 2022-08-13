import java.util.ArrayList;

/*
 * Problem Description
	Given an integer array A of size N. In one second, you can increase the value of one element by 1.
	Find the minimum time in seconds to make all elements of the array equal.
	
	Problem Constraints
	1 <= N <= 1000000
	1 <= A[i] <= 1000
	
	Input Format
	First argument is an integer array A.
	
	Output Format
	Return an integer denoting the minimum time to make all elements equal.
	
	Example Input
	A = [2, 4, 1, 3, 2]
	
	Example Output
	8
	
	Example Explanation
	We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeEquality {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(2);
		A.add(4);
		A.add(1);
		A.add(3);
		A.add(2); 
		
		System.out.println("Original Input array is : "+ A); 
		System.out.print("Minum second required to make all Equal: "+solve(A));

	}
	public static int solve(ArrayList<Integer> A) {
        int max_value = getMax(A);

        int count_second = 0;

        for(int i=0; i<A.size(); i++){
            count_second = count_second + max_value - A.get(i);
        }

        return count_second;
    }
    public static int getMax(ArrayList<Integer> A){
        int max = A.get(0);

        for(int i=1; i<A.size(); i++){
            if(A.get(i)>max){
                max = A.get(i);
            }
        }
        return max;
    }
}
