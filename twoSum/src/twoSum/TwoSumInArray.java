package twoSum;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashDocAttributeSet;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	You can return the answer in any order.
	
	Example 1:
	
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	Example 2:
	
	Input: nums = [3,2,4], target = 6
	Output: [1,2]
 */
public class TwoSumInArray {
	/*
	 * The HashMap way to find the number of index of target SUM
	 * TC - O(n)
	 * with no extra space
	 * exactly Once pass Hash Map
	 */
	public static int[] twoSumWithHashMap(int[] nums, int target) { 
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){ 
            int diff =  target - nums[i];            
            if(map.containsKey(diff)){ 
                return new int[] {map.get(diff),i};
            }else{
                map.put(nums[i],i);
            }
        }
        // In case there is no solution, we'll just return null
        return null;		
	}
	/*
	 * The HashMap way to find the number of index of target SUM
	 * TC - O(n)
	 * with extra space
	 * exactly Two pass Hash Map
	 */
	
	public static int[] twoSumWithHashMap2(int[] nums, int target) { 
		Map<Integer, Integer> map = new HashMap<>();
        
		for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
		
		for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        } 
        // In case there is no solution, we'll just return null
        return null;		
	} 
	/*
	 * The HashMap way to find the number of index of target SUM
	 * TC - O(n^2)
	 */
	public static int[] twoSum(int[] nums, int target) {
	        
	        int[] targetSum = new int[2];
	        
	        int k=0;
	        for(int i=0; i<nums.length; i++){
	            int firstNum = nums[i];
	            targetSum[0] = i;
	            for(int j=0; j<nums.length; j++){
	                if(i!=j){
	                    if(nums[j] == target - firstNum ){
	                        targetSum[1] = j;
	                        return targetSum;
	                    }
	                }
	            }
	        }
	        return targetSum;
	    }
	public static void main(String[] args) {
		 int[] arr = {2,7,11,15};
		 int target = 9;
		 int[] targetIndex = twoSumWithHashMap(arr, target);
		 
		 for(int i =0; i<targetIndex.length; i++) {
			 System.out.print(targetIndex[i]+" ");
		 }
		 
		 System.out.println();
		 System.out.println("---------------------------");
		 int[] arr1 = {3,2,4};
		 int target1 = 6;
		 int[] targetIndex1 = twoSumWithHashMap(arr1, target1);
		 
		 for(int i =0; i<targetIndex1.length; i++) {
			 System.out.print(targetIndex1[i]+" ");
		 }
		 
		 System.out.println();
		 System.out.println("---------------------------");
		 int[] arr2 = {3,3};
		 int target2 = 6;
		 int[] targetIndex2 = twoSum(arr2, target2);
		 
		 for(int i =0; i<targetIndex2.length; i++) {
			 System.out.print(targetIndex2[i]+" ");
		 }
	}

}
