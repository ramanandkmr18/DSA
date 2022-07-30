package scallerClass.day10;

/*
 * LCM (Least Common Multiple) of two numbers is the smallest number which can 
 * be divided by both numbers. 
 * A simple solution is to find all prime factors of both numbers, then find union 
 * of all factors present in both numbers. Finally, return the product of elements in union.
 */

/*
 * An efficient solution is based on the below formula for LCM of two numbers ‘a’ and ‘b’.
 * a x b = LCM(a, b) * GCD (a, b)

   LCM(a, b) = (a x b) / GCD(a, b)
   
   to find 
   GCD(a,b){
     if(a==0)
     `	return b;
     return GCD(b%a,a);
   }
   
 */
public class LCM {
	public int getLCM(int number1, int number2) {		 
		return  (number1*number2)/GCD(number1,number2);
	}
	
	public int GCD(int a, int b) {
		
		if(a==0) {
			return b;
		}
		return GCD(b%a,a);
	}
}
