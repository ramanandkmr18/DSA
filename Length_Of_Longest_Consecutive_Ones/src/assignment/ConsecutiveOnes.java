package assignment;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		 
		String A = "1101100";
		System.out.println(solve(A));

	}
	public static int solve(String A) {

        int length = A.length(); 
        int maxLength = 0;
        int countZero = 0;
        int countOnes = 0;
        
        /* to check the Base condition */
        for(int i=0; i<length; i++){
            if(A.charAt(i)=='1'){
                countOnes++;
            }
            if(A.charAt(i) == '0'){
                countZero++;
            }
        }
        
        if(countOnes == length){
            return length;
        }else if(countOnes == 0){
            return 0;
        }else if(countZero == 0){
            return length;
        }
        
        for(int i=0; i<length; i++){
            if(A.charAt(i)=='0'){
                int left = 0;
                for(int j=i-1; j>=0; j--){
                    if(A.charAt(j)=='1'){
                        left++;
                    }else{
                        break;
                    }
                }

                int right = 0;

                for(int j=i+1; j<length; j++){

                    if(A.charAt(j)=='1'){
                        right++;
                    }else{
                        break;
                    }
                }

              //int total = left + right + 1;
                if(countOnes > left+right){
                   maxLength = Math.max(maxLength, left + right +1);
                }else{
                   maxLength = Math.max(maxLength, left + right);
               }
            }
        }

        return maxLength;
    }

}
