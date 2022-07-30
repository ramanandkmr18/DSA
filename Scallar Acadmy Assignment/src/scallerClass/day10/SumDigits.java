package scallerClass.day10;

/*
 * Write a program to input T numbers(N) from user and print the sum of the digits of the given numbers.
 */
public class SumDigits {
    public int summation(int number) {
    	  int sum =0;
    	  
    	  for(int i=0; number!=0;i++) {
    		  	sum =sum+number%10;
    		  	number /=10;
    	  }
    	  
    	return sum;
	}
}
