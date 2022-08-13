package reverseTheArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(10);  
		 
		printArray(solve(arrayList));

	}
	public static ArrayList<Integer> solve(final List<Integer> A) {
		ArrayList<Integer> reverseArrayList = new ArrayList<Integer>();
		
		for(int i = A.size()-1; i>=0; i--) {
			reverseArrayList.add(A.get(i));
		}				
		return reverseArrayList;
    }
	public static void printArray(final List<Integer> A) {
		
		for (Integer integer : A) {
			System.out.print(integer+" ");
		}
	}

}
