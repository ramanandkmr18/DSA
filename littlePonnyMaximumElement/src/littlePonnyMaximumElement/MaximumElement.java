package littlePonnyMaximumElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 /*
 *  Little Ponny is given an array, A, of N integers. In a particular operation, 
 *  he can set any element of the array equal to -1.

	He wants your help in finding out the minimum number of operations required 
	such that the maximum element of the resulting array is B. If it is not possible, 
	then return -1.
	
	Input 1:
		A = [2, 4, 3, 1, 5]
		B = 3 
	
	Input 2:
	 	A = [1, 4, 2]
	 	B = 3
	
	Output 1:	
	 	2 
	Output 2:	
	 	-1 
 */

public class MaximumElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(5); 
		
		System.out.print(solve(arrayList, 3));

	}
	public static int solve(ArrayList<Integer> A, int B) {
        int count=0;        
        if(A.contains(B)){            
            for(Integer integer: A){
                if(integer>B){
                    count++;
                }
            }
        }
        
        return count>0?count:-1;        
    }
	public static boolean isPresent(ArrayList<Integer> A, int B){
        for(Integer item : A){
            if(B==item){
                return true;
            }
        }
        return false;
    }

}
