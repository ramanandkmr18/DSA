package scallerClass.day10;

public class HCF {
     public int findHCF(int number1, int number2) {
    	
    	int hcf=1;    	
    	
    	for(int i=1; i<=number1 || i<=number2; i++) {
    		 
    		if(number1%i ==0 && number2%i==0) {
    			hcf = i;
    		}
    	}    	 
    	return hcf;
    }
     
}
