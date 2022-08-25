
public class FindChristmasTrees {

	public static void main(String[] args) {
		 int[] A = {1, 6, 4, 2, 6, 9};
		 int[] B = {2, 5, 7, 3, 2, 7};
		 
		 System.out.println(solve(A, B));
		 

	}
	public static int solve(int[] A, int[] B) {
        // p < q< r
        int ans = (int)1e9;
        int minCostLeft = (int)1e9;
        int minCostRight = (int)1e9;

        int n = A.length;
        

        for(int j=1; j<A.length-1; j++){
            minCostLeft = (int)1e9;
        	for(int i=j-1;i>=0;i--){
                if(A[i]<A[j]){
                    minCostLeft=Math.min(minCostLeft, B[i]);
                }
            }

             minCostRight = (int)1e9;

            for(int k=j+1;k<n;k++) {
                if(A[k]>A[j]){
                    minCostRight=Math.min(minCostRight, B[k]);
                }
            } 
            
            ans = Math.min(ans, minCostRight+minCostLeft+B[j]);
        }  
        
        if( ans ==1e9) {
        	return -1;
        }
        

        return ans;
    }

}
