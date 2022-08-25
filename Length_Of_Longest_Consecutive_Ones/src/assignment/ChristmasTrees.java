package assignment;

import java.util.Scanner;

/*
 * Q2. Christmas Trees
	Unsolved
	character backgroundcharacter
	Stuck somewhere?
	Ask for help from a TA and get it resolved.
	Get help from TA.
	Problem Description
	You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
	The cost of these trees is Bp + Bq + Br.
	
	You are to choose 3 trees such that their total cost is minimum. Return that cost.
	
	If it is not possible to choose 3 such trees return -1.
	
	
	
	Problem Constraints
	1 <= A[i], B[i] <= 109
	3 <= size(A) = size(B) <= 3000
	
	
	
	Input Format
	First argument is an integer array A.
	Second argument is an integer array B.
	
	
	
	Output Format
	Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.
	
	
	
	Example Input
	Input 1:
	
	 A = [1, 3, 5]
	 B = [1, 2, 3]
	Input 2:
	
	 A = [1, 6, 4, 2, 6, 9]
	 B = [2, 5, 7, 3, 2, 7]
	
	
	Example Output
	Output 1:
	
	 6 
	Output 2:
	
	 7 
	
	
	Example Explanation
	Explanation 1:
	
	 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6. 
	Explanation 2:
	
	 We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7. 
	 This is the minimum cost that we can get.
 */
public class ChristmasTrees {
	public static void main(String[] args) {
		   int[] A = {802030518, 598196518, 640274071, 983359971, 71550121, 96204862, 799843967, 446173607, 796619138, 402690754};
		   int[] B = {23219513, 68171337, 12183499, 5549873, 73542337, 66661387, 79397647, 34495917, 31413076, 50918417 };
		   
		   //System.out.print(solve(A, B));
		   
		   Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();

	        for(int i=0; i<n; i++){
	            for(int j=n-i; j>0; j--){
	                 System.out.print("*");
	            } 
	            for(int j=0; j<2*i; j++){
	                System.out.print(" ");
	            } 
	            for(int j=n-i; j>0; j--){
	                 System.out.print("*");
	            } 
	            System.out.println();
	        } 
	        
	        for(int i=1; i<=n; i++){
	            for(int j=0; j<i; j++){
	                 System.out.print("*");
	            }
	            for(int j=0; j<2*(n-i); j++){
	                 System.out.print(" ");
	            } 
	            for(int j=0; j<i; j++){
	                 System.out.print("*");
	            }
	            System.out.println();
	        }
	        System.out.println();
 

	}
	public static int solve(int[] A, int[] B) {

        // p < q< r
        int ApIndex = 0;
        int AqIndex = 0;
        int ArIndex = 0;

        int minCost = Integer.MAX_VALUE;

        for(int j=1; j<A.length-1; j++){
        	int totalCost = 0;
        	AqIndex = j;
        	
            for(int i= j-1; i>=0; i--){
                if(A[i]<A[j]){
                	
                    ApIndex = i; 
                    
                    for(int k= j+1; k<A.length; k++){
                        if(A[k]>A[j]){
                            ArIndex = k;
                            if(ApIndex< AqIndex && AqIndex< ArIndex) {
                            	totalCost =  B[ApIndex] + B[AqIndex] + B[ArIndex];
                                minCost = Math.min(totalCost, minCost);  
                            }
                        }
                    } 
                                      
                }
            }
            for(int i= j+1; i<A.length; i++){
                if(A[i]>A[j]){
                    ArIndex = i;
                    if(ApIndex< AqIndex && AqIndex< ArIndex) {
                    	totalCost =  B[ApIndex] + B[AqIndex] + B[ArIndex];
                        minCost = Math.min(totalCost, minCost);  
                    }
                }
                break;
            } 
        }
        if(ApIndex< AqIndex && AqIndex< ArIndex) {   
        	return minCost;
        }else { 
        	if(minCost!=Integer.MAX_VALUE) {
        		return minCost;
        	}else {
        		return -1;
        	} 
        } 
    }
}
