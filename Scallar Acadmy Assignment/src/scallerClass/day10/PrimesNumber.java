package scallerClass.day10;

import java.util.ArrayList;
import java.util.List;

public class PrimesNumber {
	public void printPrimeNumber(int limit) {
		
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * Prime Number stated with Number 2
		 */
		for(int i=2; i<=limit ; i++) {
			
			if(isPrime(i)) {
				list.add(i);
			} 
		}
		
		Object[] objects = list.toArray();
		
		for (Object obj : objects) {
		    System.out.println(obj);
		}
	}
	public boolean isPrime(int number){
			
		int factorCount = 0;
		
		for(int i=1; i<= number ; i++) {
			
			if(number%i == 0) {
				factorCount++;
			}
			if(factorCount>2) {				
				return false;
			}
		}
		return true;		
	}
	
}
