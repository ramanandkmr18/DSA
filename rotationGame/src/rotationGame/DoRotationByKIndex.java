package rotationGame;

import java.util.Scanner;
/*
 * Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
 * There are 2 lines in the input

	Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.
	
	Line 2: A single integer B.
	
	This is Left Rotations
	Input 1 :
	4 
	1 2 3 4
	2
	
	Output 1 :
	3 4 1 2
	
	Note: In Below I have written the right rotation Function for further Reference
 */
public class DoRotationByKIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		leftRotate(arr, k);
        
        printArray(arr);
				 
	}
	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }		
	}
	public static void leftRotate(int[] arr, int k) {
		
		int n = arr.length; 
		
		if(k==0 || k==n) {
			return;
		}
		
		k = k%n;
		
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
	}
	public static void rightRotate(int[] arr, int k) {
		
		int n = arr.length; 
		
		if(k==0 || k==n) {
			return;
		}
		
		k = k%n;
				
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
		reverseArray(arr, 0, n-1);
	}
	private static void reverseArray(int[] arr, int start, int end) {
		 int temp;
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

}
