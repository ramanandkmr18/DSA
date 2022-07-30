package scallerClass.day10;

import javax.xml.crypto.dsig.SignatureMethod;

public class PrimeFactor {
	public void getPrimeFactor(int num) {
		
		/*
		 * No need to loop through all of the digit, We can loop only Square root of that number to get prime Factor
		 * So condition like i*i which is divisor of number
		 */
		for(int i= 2; i*i<num; i++) {
			
			while(num%i==0) {
				num = num/i;
				System.out.print(i+" ");				
			}
		}
		
	/*
	 * Some time like 46 wher in second time when 23 will remain you need to run loop 23 times then 1 will be remail 
	 * Better to consider non provided 1 number nd print this one
	 */
		if(num!=1) {
			System.out.print(num);
		}
	}
}
