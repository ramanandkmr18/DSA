package homework;

public class Reverse_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(3));
	}
	public static long reverse(long A) {

        //int[] binaryNum = new int[32];
		String reverseStrings = "";

        for (int i = 0; i <32; i++) {
            long k = A >> i;
            if ((k & 1) > 0) {
            	reverseStrings += '1';
            }else {
            	reverseStrings += '0';
            }
        }              
        System.out.println(reverseStrings);
        
        /*
         * Convert Binary into decimal
         */
        int base = 1;
        long dec_value = 0;
        
        long temp =  Long.parseLong(reverseStrings);
        
        while(temp>0) {
        	long rem = temp%10;
        	
        	temp = temp / 10;
        	
        	dec_value += dec_value*base;
        	
        	base = base*2;
        }
        
        System.out.println(dec_value);
        
		return dec_value;
        
	}

}
