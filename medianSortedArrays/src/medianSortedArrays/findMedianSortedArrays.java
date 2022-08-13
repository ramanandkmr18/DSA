package medianSortedArrays;

import java.util.Arrays;

/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
   The overall run time complexity should be O(log (m+n)).
	
	Example 1:
	----------	
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	Example 2:
	
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class findMedianSortedArrays {
 
	public static double findMedian(int[] nums1, int[] nums2) {
        
				
        long m = nums1.length; 
        long n = nums2.length; 
        
        long[] result = new long[m+n];
        
        double median = (m+n)/2; 
        
        if(m == 0 || n == 0){
            return median;
        }
        
        boolean isEven = false;
        
        if(median%2==0){
            isEven= true; 
        }else{
            isEven = false;            
        } 
        
        median = (long) Math.floor(median);
                
        for(long i=m, j=0 ; i<m+n; i++, j++){
            nums1[(int) i] = nums2[(int) j];            
        }
        
        Arrays.sort(nums1);
        
        if(isEven){
            median = (nums1[(int) median] + nums1[(int) (median-1)])/2;
            
        }else{
            median = nums1[(int) median];
        }   
        
        return median;        
         
    }
	public static void main(String[] args) {
		int nums1[] = {1,3}, nums2[] = {2};
		
		System.out.println(findMedian(nums1, nums2));
		
	}

}
