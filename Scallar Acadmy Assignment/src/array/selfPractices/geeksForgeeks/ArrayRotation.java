package array.selfPractices.geeksForgeeks;

import javax.xml.stream.events.StartDocument;

/*
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements. 
 * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 * [1,2,3,4,5,6,7]
 * Rotation of the above array by 2 will make array
 * [3,4,5,6,7,1,2]
 */
public class ArrayRotation {
	
	/*
     * Reversal Algorithm for the array rotations
     * 
     */
	public void leftRotate(int[] arr, int d) {
		if(d==0 || d == arr.length) {
			return;
		}
		// if the d is greater than the Array length
		int l = arr.length;
		d = d%l;
		
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,l-1);
		reverseArray(arr,0,l-1);
		
	}
	
	private void reverseArray(int[] arr, int start, int end) {
		 
		int temp;
		
		while(start<end) {
			temp = arr[start];
			
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}		
	}
    public void printArray(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	 
    }
    /*
     * Cyclic Algorithm for the array rotations
     * cyclically rotate an array by one
     * 
    */
    public int[] rotateByOne(int[] arr) {
    	int start=0;
    	int end= arr.length-1;
    	int temp;
    	
    	while(start<end) {
    		temp = arr[start];
    		arr[start] = arr[end];
    		arr[end] = temp;
    		start++;
    	}
    	return arr;
    }
    /*
     * Maximum sum of i*arr[i] among all rotations of a given array
     * Example:
     * Input: arr[] = {8, 3, 1, 2}
		Output: 29
		Explanation: Lets look at all the rotations,
		{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
		{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
		{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
		{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17
     * 
     * Input: arr[] = {3, 2, 1}
		Output: 7
		Explanation: Lets look at all the rotations,
		{3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
		{2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
		{1, 3, 2} = 1*0 + 3*1 + 2*2 = 7
		
		Below Code have T(O) = O(n2)
		
		Method 1: Not much efficient Please look next method
    */
    
    public int maxSumRotationArray(int[] arr) {
    	
    	int length = arr.length;
    	int maxSum = 0; 
    	
    	for(int i=0;i<length;i++) {
    		int sum = 0;
    		if(i==0) {
    			for(int j=0;j<length;j++) {
            		sum +=arr[j]*j;		 
            	}
    		}else {
    			arr= rotateByOne(arr);    		
        		for(int j=0;j<length;j++) {
            		sum +=arr[j]*j;		 
            	}
    		}
    		
    		maxSum = Math.max(maxSum, sum);
    	}
    	return maxSum;
    }
    /*
     * Approach: The basic approach is to calculate the sum of new rotation from
     *  the previous rotations. This brings up a similarity where only the multipliers 
     *  of first and last element change drastically and the multiplier of every other 
     *  element increases or decreases by 1. So in this way, 
     * the sum of next rotation can be calculated from the sum of present rotation.
     * 
     * next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);

	 * 	next_val = Value of summation of i*arr[i] after one rotation.
	 * 	curr_val = Current value of summation of i*arr[i] 
	 * 	cum_sum = Sum of all array elements, i.e., summation of arr[i].
		
	 * 	Lets take example {1, 2, 3}. Current value is 1*0+2*1+3*2
	 * 	= 8. Shifting it by one will make it {2, 3, 1} and next value
	 * 	will be 8 - (6 - 1) + 1*2 = 5 which is same as 2*0 + 3*1 + 1*2
     */
  public int maxSumOfRotationArray(int[] arr) {
    	
	    int cum_sum = 0;
	    int arrlength = arr.length;
	    
	    // compute the sum of all number 
	    for(int i=0;i<arrlength;i++) {
	    	cum_sum+=arr[i];
	    }
	    
	    //compute the multiple of initial configuration
	    int cum_val=0;
	    
	    for(int i=0;i<arrlength;i++) {
	    	cum_val+=arr[i]*i;
	    }
	    
	    int res = cum_val;
	    
	    // compute the value of other iterations
	    for(int i=1;i<arrlength;i++) {
	    	
	    	int next_val = cum_val - (cum_sum-arr[i-1]) + arr[i-1]*(arrlength-1);
	    	
	    	cum_val = next_val;
	    	
	    	res = Math.max(res, next_val);
	    }
    	
    	return res;
    }
    
    
	/*
	 * Its Time 
	 * Time complexity : O(n) 
     * Auxiliary Space : O(n)
	 */
        public int[] getRotateArray(int[] array, int rotationBy){
        	
        	int arrayLength = array.length;
        	
        	/* if rotation factor greater than array length*/
        	
        	rotationBy = rotationBy%arrayLength;
        	
        	int tempArray[] = new int[rotationBy];
        	
        	for(int j=0;j<rotationBy;j++) {
    			tempArray[j]= array[j];
    		}
        	
        	for(int i=0;i<arrayLength-rotationBy;i++) { 
        		array[i] = array[i+rotationBy];
        	}
        	for(int i= arrayLength-rotationBy,j=0;i<arrayLength;i++,j++) {
        		array[i] = tempArray[j];
        	} 
        	 
        	return array;
        }
        public void displayRotatedArray(int[] array, int rotationBy) {
        	int[] rotateArray = getRotateArray(array,rotationBy );
        	int length = rotateArray.length;
        	
        	for(int i=0;i<length;i++) {
        		System.out.print(rotateArray[i]+" ");
        	}
        }
        
}
