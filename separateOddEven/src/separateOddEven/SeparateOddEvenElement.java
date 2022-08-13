package separateOddEven;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEvenElement {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){

            int m = sc.nextInt();
            int[] arrA = new int[m];

            for(int j=0;j<m;j++){
                arrA[j] = sc.nextInt();
            }

            int n = sc.nextInt();
            int[] arrB = new int[n];

            for(int k=0;k<n;k++){
                arrB[k] = sc.nextInt();
            }

            /*
                Seperation of Array A
            */
            getOddEvenElement(arrA);

            /*
                Seperation of Array B
            */

            getOddEvenElement(arrB);

        } 
    }
    public static void getOddEvenElement(int[] arr){
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                oddList.add(arr[i]);
            }else {
            	evenList.add(arr[i]);
            }
        }
        
        for(Integer integer:oddList){
            System.out.print(integer+" ");
        }
        
        System.out.println();
        
        for(Integer integer:evenList){
            System.out.print(integer+" ");
        }
        System.out.println();
    } 

}
