package homework;

import java.math.BigInteger;

/*
 * Problem Description
	Reverse the bits of an 32 bit unsigned integer A.
	 
	Problem Constraints
	0 <= A <= 232
	
	
	
	Input Format
	First and only argument of input contains an integer A.
	
	
	
	Output Format
	Return a single unsigned integer denoting the decimal value of reversed bits.
	
	
	
	Example Input
	Input 1:
	
	 0
	Input 2:
	
	 3
	
	
	Example Output
	Output 1:
	
	 0
	Output 2:
	
	 3221225472
	
	
	Example Explanation
	Explanation 1:
	
	        00000000000000000000000000000000    
	=>      00000000000000000000000000000000
	Explanation 2:
	
	        00000000000000000000000000000011    
	=>      11000000000000000000000000000000
 */
public class Reverse_Bits {
	public long reverse(long A) {
		
		 
		
        String reverseStrings = "";

        for (int i = 31; i >= 0; i--) {
            long k = (A >> i);
            if ((k & 1) > 0)
                reverseStrings += '1';
            else
                reverseStrings += '0';
        }
        
        long ans =0;

        for (int i = 31; i >= 0; i--) { 
            char ch = reverseStrings.charAt(i);
            if (ch =='1'){
                ans += (1L<<i);
            }
                 
        }

        return ans;

	}
}
