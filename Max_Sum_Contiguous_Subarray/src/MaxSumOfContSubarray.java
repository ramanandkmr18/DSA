
public class MaxSumOfContSubarray {

	public static void main(String[] args) {
		 
		int[] A = {97, 0, -461, -125, -404, -59, -322, -495, -288, -341, -449, -313, -192, -214, -389, -202, -183, -72, -416, -455, -187, -242, -416, 39, -198, -338, -465, -248, -25, -398, -97, -461, -214, -423, -407, -77, -190, -67, -178, -410, -160, 72, -350, -31, -85, -247, -319, -462, -303, -48, -354, -110, 17, 60, 19, 80, -218, -28, -426, -366, -140, 50 };
		
		System.out.println("------------------");
		System.out.println(maxSubArray(A));

	}
	public static long maxSubArray(int[] A) {
		int size = A.length;
        long maxSum = A[0];
        long curSum = A[0];
       
        for(int i=1; i<size; i++){ 
            if(curSum>=0){
                curSum += A[i];
            }else{
                curSum = A[i];
            }

            if(curSum>maxSum){
                maxSum = curSum;
            }
        }
        return (int)maxSum;
    }

}
