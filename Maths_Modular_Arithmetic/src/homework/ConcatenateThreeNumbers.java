package homework;
/*
 * Problem Description
	Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
	
	Return the minimum result obtained. 
	
	Problem Constraints
	10 <= A, B, C <= 99 
	
	Input Format
	The first argument of input contains an integer, A.
	The second argument of input contains an integer, B.
	The third argument of input contains an integer, C.
	
	Output Format
	Return an integer representing the answer.
	
	Example Input
	Input 1:
	
	 A = 10
	 B = 20
	 C = 30
	Input 2:
	
	 A = 55
	 B = 43
	 C = 47 
	
	
	Example Output
	Output 1:
	
	 102030 
	Output 2:
	
	 434755 
	
	
	Example Explanation
	Explanation 1:
	
	 10 + 20 + 30 = 102030 
	Explanation 2:
	
	 43 + 47 + 55 = 434755 
 */
public class ConcatenateThreeNumbers {

	public static void main(String[] args) {
		int a = 29;
        int b = 65;
        int c = 65;
 
        System.out.println(solve(a, b,c));

	}
	public static int solve(int A, int B, int C) {
		int largest = A;
		int medium = B;
		int smallest = C;
				
		if (A>= B && A >= C) {
			largest = A;
			if(B>=C) {
				smallest = C;
				medium = B;
			}else {
				smallest = B;
				medium = C;
			}
		}

		if (B >= A && B >= C) {
			largest = B;
			if(A>=C) {
				smallest = C;
				medium = A;
			}else {
				smallest = A;
				medium = C;
			}
		}    

		if (C >= B && C >= A) {
			largest = C;
			if(B>=A) {
				smallest = A;
				medium = B;
			}else {
				smallest = B;
				medium = A;
			} 
		}
		
		String s1 = Integer.toString(smallest);
        String s2 = Integer.toString(medium);
        String s3 = Integer.toString(largest);
        
        String s = s1 + s2 + s3;
        
        return (int)Integer.parseInt(s);
		  
    }
	

}
