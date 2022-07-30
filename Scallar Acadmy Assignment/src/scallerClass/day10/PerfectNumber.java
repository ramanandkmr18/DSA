package scallerClass.day10;

/*
 * For each given integer A, you have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4. 
 For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
 */
public class PerfectNumber {
    public boolean isproperNumber(int number){
    	
    	int factorSum = 0;
    	
    	for(int i=1; i<number ;i++){
    		if(number%i==0) {
    			factorSum = factorSum + i;
    		}
    	}
    	if(factorSum == number) {
    		return true;
    	}
    	
    	return false;    	
    }
}
