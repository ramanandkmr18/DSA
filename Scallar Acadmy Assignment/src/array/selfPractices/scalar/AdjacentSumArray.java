package array.selfPractices.scalar;

public class AdjacentSumArray {

	public int adjacentSum(int[] arr) {
		
		int length= arr.length;
		int countodd =0;
		int counteven =0;
		int count = 0;
		for(int i=0;i<length;i++) {
			if((arr[i])%2==0) {
				counteven++;
			}else {
				countodd++;
			}
		}		
		count = countodd>counteven?counteven:countodd;
		
		return count; 		
	} 

}
