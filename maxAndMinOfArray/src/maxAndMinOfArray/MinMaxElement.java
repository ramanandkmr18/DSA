package maxAndMinOfArray;

import java.util.Scanner;

import javax.naming.ReferralException;

/*
	 * Problem Description
	
		Write a program to print maximum and minimum elements of the input array A of size N
		where you have to take integer N and other N elements as input from the user.
		Example Input
		
		Input 1:	
		5 1 2 3 4 5
		
		Input 2:	
		4 10 50 40 80
		
		Output 1:		
		5 1
		
		Output 2:	
		80 10
	 */
public class MinMaxElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int l = scanner.nextInt();
		int[] arr = new int[l];
		
		
		for(int i=0; i<l; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		if(l==1) {
			max = arr[0];
			min = arr[0];
		}else {
			for(int i=1; i<l; i++) {
				if(arr[i]>max) {
					max= arr[i];
				}
				if(arr[i]<min) {
					min = arr[i];
				}
			}
		} 
		
		System.out.print(max + " "+min);
	}

}
