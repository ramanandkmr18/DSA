package multipleleftRotationsOfArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.xml.sax.EntityResolver;

public class MultipleLeftRotations {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		
		listB.add(2);
		listB.add(3);
		System.out.println(listA);
		System.out.println(listB);
		
		ArrayList<ArrayList<Integer>> list2D = solve(listA, listB);
		
		System.out.print(list2D);

	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		ArrayList<ArrayList<Integer>> rotationList = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> tempListA =  new ArrayList<Integer>();
				
		for (int i=0; i<B.size(); i++) {
			tempListA = (ArrayList<Integer>) A.clone();
			rotationList.add(new ArrayList<Integer>());
			leftRotation(tempListA, B.get(i));
			rotationList.get(i).addAll(tempListA);			 
		}
		//System.out.print(rotationList);
		
		return rotationList;
        
    }
    public static void leftRotation(ArrayList<Integer> A, int k){

        int n = A.size();

        if(k==0 || k==A.size()){
            return;
        }

        k = k%n;

        reverseArray(A, 0, k-1);
        reverseArray(A, k, n-1);
        reverseArray(A, 0, n-1);
    }
    public static void reverseArray(ArrayList<Integer> A, int start, int end ){
        int temp;
        while(start<end){
            temp = A.get(start);
            A.set(start, A.get(end)); 
            A.set(end, temp);
            start++;
            end--;
        }
    }

}
