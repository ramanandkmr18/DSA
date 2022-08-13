package closestMinMaxCarryForwardArray;

import java.util.ArrayList;

/*
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
	and at least one occurrence of the minimum value of the array.
		
	Problem Constraints
	1 <= |A| <= 2000
	
	Input Format
	First and only argument is vector A
	
	Output Format
	Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
		
	Example Input
	Input 1:
	
	A = [1, 3]
	Input 2:	
	A = [2]	
	
	Example Output
	Output 1:	
	 2
	Output 2:	
	 1

 * 
 */
public class ClosedMinMaxSubArray {

	public static void main(String[] args) {
		
		//int[] A = {343, 291, 963, 165, 152};
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(4);
		A.add(4);
		A.add(4);
		A.add(4); 
		
		/*
		    Find the min Max in the Array
		*/
		
		    int[] getMinMaxArray = findMinMax(A);
		   
		    int length = getMinMaxArray.length;
		    int min=0, max=0;
		    /*
		    Base case for array length 1
		*/
		    
		/* in the worst case the min subArray is eqal to the original array */
		int ans = A.size(); 
		    
		if(length==1){
		    min = getMinMaxArray[0];
		    max = getMinMaxArray[1];
		}else{
		    min =  getMinMaxArray[0];
		    max =  getMinMaxArray[1];
		}
		
		if(min==max) {
			 ans =1;
		}else {
			int min_index = -1;
			int max_index = -1;
			
			/*
			    will start from back and try to fine either min or max and will start journery
			*/
			
			    for(int i=A.size()-1; i>=0; i--){
			
			        if(A.get(i) == min){
			            if(max_index != -1){
			                ans = Math.min(ans, max_index-i+1);
			            }
			            min_index = i;
			        }else if(A.get(i) == max){
			            if(min_index != -1){
			                ans = Math.min(ans, min_index-i+1 );
			            }
			            max_index =i;
			        }
			    }
		} 
	    System.out.println("Minimum Length of Sub array which contains Min and Max value");
	    System.out.println(ans);
		
		}
		public static int[] findMinMax(int[] arr){
		    int length = arr.length;
		    int[] result = new int[2];
		    if(length>1){ 
		        int min = arr[0];
		        int max = arr[0];
		
		        for(int i=1; i<length; i++){
		            if(arr[i]>max){
		                max = arr[i];
		            }
		            if(arr[i]<min){
		                min = arr[i];
		            }
		        }
		        result[0] = min;
		        result[1] = max;
		
		        return result;
		    }		
		    return arr;		    
		}
	    public static int[] findMinMax(ArrayList<Integer> A){
	        int length = A.size();
	        int[] result = new int[2];
	        
	        if(length>1){ 
	            int min = A.get(0);
	            int max = A.get(0);

	            for(int i=1; i<length; i++){
	            	if(A.get(i)>max){
	                    max =  A.get(i);
	                }
	                if(A.get(i)<min){
	                    min = A.get(i);
	                }
	            }
	            result[0] = min;
	            result[1] = max;

	            return result;
	        }else{
	            /*
	                if arraylist of length is one then 
	            */
	            result[0] = A.get(0);
	        }
	        return result;
	    }

}
