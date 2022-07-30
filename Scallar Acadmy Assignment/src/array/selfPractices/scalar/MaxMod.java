package array.selfPractices.scalar;
import java.util.Arrays;
/*
  Given an array A of size N, Groot wants you to pick 2 indices i and j such that

1 <= i, j <= N
A[i] % A[j] is maximum among all possible pairs of (i, j).
Help Groot in finding the maximum value of A[i] % A[j] for some i, j.

Input 1:  A = [1, 2, 44, 3]
Output 1: 3

Input 2:  A = [2, 6, 4]
Output 2: 4

Explanation 1:

 For i = 3, j = 2  A[i] % A[j] = 3 % 44 = 3.
 No pair exists which has more value than 3.
Explanation 2:

 For i = 2, j = 1  A[i] % A[j] = 4 % 6 = 4.
 */
public class MaxMod { 

	public int getMaxMod(int[] arr) {
		 int maxmodi=0; 
		 int maxmodj = 0;
		 int maxmod=0;
		 //Arrays.sort(arr);
		 int temp;
		/*
		 * Sort the Array then do mod
		 */
	    for(int i=0;i<arr.length;i++)
		{		
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp  =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0,j=i+1;i<arr.length-1;i++,j++) {
			    if(arr[j]!=0) {
		            maxmodi = arr[i]%arr[j];
		        }
		        if(arr[i]!=0){
		            maxmodj = arr[j]%arr[i];               
		        }
		        maxmod = maxmodi>maxmod?maxmodi:maxmod;	  
		        maxmod = maxmodj>maxmod?maxmodj:maxmod;	
		 }
		 
		return maxmod; 
	}
}
