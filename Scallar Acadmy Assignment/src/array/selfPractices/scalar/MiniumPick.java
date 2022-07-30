package array.selfPractices.scalar;

import java.util.Arrays;

public class MiniumPick {

	public int getDiffMaxEvenMinOdd(int[] inputArray) {
		
		int length = inputArray.length;
		int maxEven = 0;
		int minOdd = 0;
		int diff = 0;
		
		Arrays.sort(inputArray);
		
		/* find the max Even in the sort Array */
		
		for(int i=length-1;i>0;i--) {
			if(inputArray[i]%2==0) {
				maxEven = inputArray[i];
				break;
			}
		}
		/* find the max Even in the sort Array */
		
		for(int i=0;i<length;i++) {
			if(inputArray[i]!=0 && inputArray[i]%2!=0) {
				minOdd = inputArray[i];
				break;
			}
		} 
		
		diff = maxEven - minOdd;
		
		return diff; 
	}

}
