package assignment;
/*
 * Problem Description
	Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
	
	We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
	
	Note: Using the library sort function is not allowed. 
	
	
	Problem Constraints
	1 <= N <= 1000000
	0 <= A[i] <= 2
	
	
	Input Format
	First and only argument of input contains an integer array A.
	
	
	Output Format
	Return an integer array in asked order
	
	
	Example Input
	Input 1 :
	    A = [0 1 2 0 1 2]
	Input 2:
	
	    A = [0]
	
	
	Example Output
	Output 1:
	    [0 0 1 1 2 2]
	Output 2:
	
	    [0]
	
	
	Example Explanation
	Explanation 1:
	    [0 0 1 1 2 2] is the required order.
 */
public class Sort_By_Color {

	public static void main(String[] args) {
		 

	}
	public int[] sortColors(int[] A) {
        int i=0; 
        int j= A.length -1;
        int k=0;

        while(i<=j){
            if(A[i]==2){
                swap(A, i,j);
                j--;
            }else if(A[i]==0){
                swap(A, i,k);
                k++;
                i++;
            }else{
                i++;
            }
        }

        return A;

    }
    public void swap(int[] A, int first, int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

}
