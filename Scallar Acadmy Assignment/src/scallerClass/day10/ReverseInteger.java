package scallerClass.day10;

public class ReverseInteger {
	/*
	 * You are given an integer N and the task is to reverse the digits of the given
	 * integer. Return 0 if the result overflows and does not fit in a 32 bit signed
	 * integer
	 * 
	 * Look at the example for clarification.
	 */

	public int getReverseNumber(int number) {
		long num = number;
		
		num = Math.abs(num);
		
		long reverse = 0; 

		while(num>0) {
			reverse = reverse*10 + num%10;
			num /=10;
		}
		
		if(number<0) {
			reverse = reverse*(-1);
		}
		
		/*
		 * If reverse is negative then compare with Integer Min and 
		 * if reverse is positive then compare with Integer.Max  value
		*/
		if(reverse<Integer.MIN_VALUE || reverse>Integer.MAX_VALUE) {
			return 0;
		}
		
		return (int) reverse;
	}
	
	public int reverse(int A) {
        int reverse = A;
	    int sign = 1;
	    
	    if (A < 0) {
	        A *= -1;
	        sign = -1;
	    }
	    
	    reverse = reverseOf(A);
	    
	    if (reverse == Integer.MIN_VALUE)
	        return 0;
	    
        reverse *= sign;
        
	    return reverse;
    }
	
    public int reverseOf(int num) {
	    
	    int newNum = 0;
	    
	    while (num > 0) {
	        int digit = num % 10;
	        
	        if (newNum > Integer.MAX_VALUE / 10 || ((newNum == Integer.MAX_VALUE / 10) && digit > Integer.MAX_VALUE % 10)) {
	            return Integer.MIN_VALUE;
	        }
	        
	        newNum = newNum * 10 + digit;
	        num /= 10;
	    }
	    
	    return (int) newNum;
	    
	}
}
