package Assignment;

public class AddBinaryStrings {

	public static void main(String[] args) {
		String A = "1010110111001101101000";
		String B = "1000011011000000111100110";
		
		System.out.println(addBinary(A,B)); 
		
	}
	public static String addBinary(String A, String B) {
		String res = "";

        int i = A.length() - 1;
        int j = B.length() - 1;
        int sum, carry = 0;

        while(i>=0 || j>=0){
            sum = carry;

            if(i>=0) sum += A.charAt(i) - '0';
            if(j>=0) sum += B.charAt(j) - '0';

            res +=   sum %2;            
            carry = sum/2;
            
            i--;
            j--;
        }
        if(carry!=0) res +="1"; 
        
        char[] try1 = res.toCharArray();
        
        String reverseStrings = "";
        
        for (i = try1.length - 1; i >= 0; i--)
        	reverseStrings += try1[i];
        
        return reverseStrings;
    }
	
	

}
