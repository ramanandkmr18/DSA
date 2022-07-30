package array.selfPractices.scalar;

import java.util.Arrays;

public class PairCount {

	public int sumPairCount(int[] inputArray, int sumTotal) {
		
		int l = inputArray.length;
		int[] res= new int[l];
		int cnt =0; 
		
		int left = 0;
		int right = l-1;
		
		//Arrays.sort(inputArray);
		while(left<right) {				
			if(inputArray[left]+inputArray[right]==sumTotal) {
				++cnt; 					 
			}else if(inputArray[left]+inputArray[right]<sumTotal) {
				left++;
			}else {
				right--;
			}			
		} 
		return cnt;
	}

}
