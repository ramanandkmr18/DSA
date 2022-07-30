package scallerClass.day10;

public class PrimeNumber {
	public boolean isPrime(long number){
		
		int factorCount = 0;
		
		for(int i=1; i< number ; i++) {
			
			if(number%i==0) {
				factorCount++;
			}
			if(factorCount>2) {				
				return false;
			}
		}		
		return true;		
	}
}
