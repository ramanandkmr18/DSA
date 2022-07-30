package scallerClass.day10;

import java.util.*;

public class FactorCount {
	
	public int getFactorCount(int number){
		
	    int factorCount = 0;

	    for(int i=1; i<=number; i++){
	        if(number%i==0){
	            factorCount++;
	        }
	    }
	    
	    return factorCount;
	}
}
