import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSubArray {

	public static void main(String[] args) {
		 ArrayList<Integer> C = new ArrayList<Integer>();
		 
		 C.add(8);
		 C.add(7);
			/*
			 * C.add(4); C.add(4); C.add(5); C.add(5); C.add(5); C.add(7); C.add(5);
			 */
		 
		 System.out.print(getMaxSubarray(C.size(), 4, C));
		 

	}
    public static int getMaxSubarray(int A, int B, ArrayList<Integer> C) {
        
    	ArrayList<Integer>  list = new ArrayList<Integer>();
    	
        int[] getMinMaxArray = findMinMax(C, A);

        int n = getMinMaxArray.length;
        
        int maxValueSubArray = Integer.MIN_VALUE; 
        
        int min = getMinMaxArray[0];
        
        System.out.println(min);
        
        if(B<min){
            return 0;
        } 
        
        if(n==1){
            if(B==getMinMaxArray[0]){
                return B;
            }else{
                return 0;
            }
        }else{

            for(int i =0; i<A; i++){
            	int sum = 0;
                for(int j=i; j<A; j++){ 
                    sum = sum + C.get(j);
                    maxValueSubArray = Math.max(maxValueSubArray, sum);
                     
                    if(sum==B) {
                    	return B;
                    }
                    
                    list.add(sum);
                }
            }
            
            Collections.sort(list);  
            
            if(maxValueSubArray <= B){
                return maxValueSubArray;
            }else {
            	int size = list.size();
            	System.out.println(list); 
            	
            	for(int i=0; i<size; i++) {
            		if(B<list.get(i)) {
            			return list.get(i-1);
            		}
            	}
            }
            
            return 0;
            
        } 
    }
    public static int[] findMinMax(ArrayList<Integer> A, int N){

        int min = A.get(0);
        int max = A.get(0);

        int[] result = new int[2];

        if(N==1){
            result[0] = A.get(0);
            result[1] = A.get(0); 
        }else{

            for(int i=1; i<N; i++){
                if(A.get(i)>max){
                    max = A.get(i);
                }
                if(A.get(i)<min){
                    min = A.get(i);
                }
            }

            result[0] = min;
            result[1] = max;
        }

        return result;

    }

}
