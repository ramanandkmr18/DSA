package array.selfPractices.scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PonnyMobilePhone {

	public int[] getponnymobile(int[] A, int[] B) {
		int lengthA = A.length;
		int lengthB = B.length;
		int[] res = new int[lengthB];		
		Arrays.sort(A);
		for(int b=0; b<lengthB; b++) {
			int sum = 0;
			int count = 0;
			int a= 0;
			while(a<lengthA) {
				if(A[a]<B[b]) {
					B[b]-=A[a];
					res[b]=++count;
				}else {
					break;
				}
				a++;
			}
		}		
		return res;		
	}
	public int[] solve(int[] A, int[] B) {
        List<Integer>ls=new ArrayList<>();
        int n=A.length;
        int m=B.length;
        Arrays.sort(A);
        for(int i=0;i<m;i++){
            int money=B[i];
            int sum=0;
            int cnt=0;
            for(int j=0;j<n;j++){
               sum+=A[j];
               if(sum<=B[i]){
                     cnt++;
                     money-=A[j];
               }else{
                   break;
               }
            }
            ls.add(cnt);
        }
        int res[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i]=ls.get(i);
        }
        return res;	
    }

}
