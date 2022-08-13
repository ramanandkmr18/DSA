package searchElementInArray;

import java.util.Scanner;

public class SearchElementClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){

            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int j=0; j<n; j++){
                arr[j] = sc.nextLong();
            }
            long searchItem = sc.nextLong();
            
            System.out.println(search(arr,searchItem));
            
        }
	}
	public static int search(long[] arr, long item){
        for(int i=0; i<arr.length; i++){
            if(item == arr[i]){
                return 1;
            }
        }

        return 0;
    }
}
