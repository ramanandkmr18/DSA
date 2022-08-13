package mainClass;

import java.util.*;

import javax.xml.validation.Validator;

import array.selfPractices.geeksForgeeks.ArrayRotation;
import array.selfPractices.geeksForgeeks.FindElementInRotations;
import collectionPractices.ListDemo;
import scallerClass.day10.ArmstrongNumbers;
import scallerClass.day10.CountDigits;
import scallerClass.day10.FactorCount;
import scallerClass.day10.HCF;
import scallerClass.day10.LCM;
import scallerClass.day10.PalindromicInteger;
import scallerClass.day10.PerfectNumber;
import scallerClass.day10.PrimeFactor;
import scallerClass.day10.PrimeNumber;
import scallerClass.day10.PrimesNumber;
import scallerClass.day10.ReverseInteger;
import scallerClass.day10.SumDigits;

public class Main {
   
	public static boolean isPrime(int n){
		int i=1;
        int factor=0;
        if(n==2) {
        	return true;
        }
        while(i<=n){
            if(n%i==0){
                factor++;
            } 
            if(factor>2){
                return false;
            }
            i++;
        }
        return true;
        
    }
	public static boolean isFoundInArrayList(ArrayList<Integer> arrayList, int key) {
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) { 
			if(key == (Integer) iterator.next()) {
				return true;
			} 
		} 
		return false;
	}
	public static boolean findDublicate(int[] arr, int key, int index){
		 
        for(int i=0; i<arr.length; i++){
            if(i!=index && key == arr[i]){
                return true;
            }
        }

        return false;        
    }

    public static void printArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high]; //consider the last element is pivot element

        int i = low-1; // index the Smaller element right before the pivote Element;

        for(int j=low; j<= high-1; j++){

            if(arr[j]<pivot){

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    public static void quickSort(int[] arr, int low, int high){

        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static boolean foundSum(ArrayList<Integer> arrList, int pair,int key, int index){

        for(int i=0; i<arrList.size(); i++){
            if(i!=index && (arrList.get(i)+pair == key)){
                return true;
            }
        }
        return false;

    }
    public static boolean isArmstrongNumber(int n){
        int i = 0;
        int sum = 0;
        int temp = n;
        
        while(n>0){
            int rem = n%10;
            sum = sum + rem * rem * rem;
            n /=10;            
        }

        if(sum == temp){
            return true;
        }

        return false;
    }
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> armList  = new ArrayList<Integer>();

        int n = sc. nextInt();        
        for(int i=1;i<=n; i++){
            if(isArmstrongNumber(i)){
                armList.add(i);
            }
        }
        
        for (Iterator iterator = armList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
        
        for (int i = 0; i < armList.size(); i++) {
        	System.out.println(armList.get(i));
		}
		
        String string = "AGAGAAGG";
        string.length();
        
		/*
		 * ArrayList<ArrayList<Integer> > A = new ArrayList<ArrayList<Integer> >();
		 * ArrayList<ArrayList<Integer> > B = new ArrayList<ArrayList<Integer> >();
		 * ArrayList<ArrayList<Integer> > C = new ArrayList<ArrayList<Integer> >();
		 * 
		 * ArrayList<Integer> colSumArrayList = new ArrayList<Integer>();
		 * 
		 * A.add(0, new ArrayList<Integer>(Arrays.asList(1,2,3))); A.add(1, new
		 * ArrayList<Integer>(Arrays.asList(4,5,6))); A.add(2, new
		 * ArrayList<Integer>(Arrays.asList(7,8,9))); //A.add(1, new
		 * ArrayList<Integer>(Arrays.asList(3,4))); //A.add(2, new
		 * ArrayList<Integer>(Arrays.asList(6, 2)));
		 * 
		 * // B.add(0, new ArrayList<Integer>(Arrays.asList(13,9,7,15))); //B.add(1, new
		 * ArrayList<Integer>(Arrays.asList(8,7,4,6))); //B.add(2, new
		 * ArrayList<Integer>(Arrays.asList(6,4,0,3))); // B.add(2, new
		 * ArrayList<Integer>(Arrays.asList(3, 2, 1)));
		 * 
		 * int num = 2; int colSize = A.get(0).size(); int rowCount = A.size();
		 * 
		 * for(int i=0;i<rowCount; i++) { //int rowWiseSum = 0; B.add(new
		 * ArrayList<Integer>()); for(int j=0; j<colSize; j++) {
		 * B.get(i).add(2*A.get(i).get(j)); //System.out.print(2*A.get(i).get(j)+" "); }
		 * System.out.println(); //System.out.print(rowWiseSum+" "); }
		 * System.out.println(B);
		 */
        
		/*
		 * for(int i=0;i<colSize;i++) { int colWiseSum = 0; for(int j=0;j<rowCount;j++)
		 * { colWiseSum = colWiseSum + A.get(j).get(i); }
		 * System.out.print(colWiseSum+" "); }
		 */
                
        /*
         * When the Row of A will run Then All the Row Of B will Excuted
         */
		/*
		 * for(int i=0; i < B.get(i).size(); i++){ for(int j=0; j< A.get(i).size(); j++)
		 * { System.out.println("A:["+i+"]["+j+"] "+ A.get(i).get(j)
		 * +"  B: ["+j+"]["+i+"] "+B.get(j).get(i)); } }
		 */
        /*
		 * Always Remember Count of column of A Equal to count of Row of B
		 */
        
		
        //System.out.println(C);
          
		
		 
		/*
		 * 	********** // 0 spaces

			****__**** // 2 spaces
			
			***____*** // 4 spaces
			
			**______** // 6 spaces
			
			*________* // 8 spaces
		 * 
		 * Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); 
		
		for(int row=1; row<=n; row++){
			
			for(int star=1; star<=n+1-row; star++){
				System.out.print("*");
			} 
            for(int space=1; space<=2*row-2; space++){
				System.out.print(" ");
			}  
			for(int star=1; star<=n+1-row; star++){
				System.out.print("*");
			} 
			System.out.println();   
        }    
		 */
		
		/*2
		 * 
		 *  *________*
			**______**
			***____***
			****__****
			**********
		 * 
		 * Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); 
		
		for(int row=1; row<=n; row++){
			
			for(int star=1; star<=row; star++){
				System.out.print("*");
			} 
            for(int space=1; space<=2*n-2*row; space++){
				System.out.print("_");
			}  
			for(int star=1; star<=row; star++){
				System.out.print("*");
			} 
			System.out.println();
		} 
		 */
        
		/*
		 *  1
		   232
		  34543
		 4567654
		567898765
		 * int n = 5;
		
		for(int row=1 ; row<=n ; row++) {
			
			// Print spaces -> ( n - row )
			for(int space=1 ; space <= n-row) ; space++) {
				System.out.print(" ");
			}
			
			// Print increasing number pattern -> [row, 2*row-1]
			for(int num=row; num <= 2*row-1 ; num++) {
				System.out.print(num);
			}
			
			// Print decreasing number pattern -> [2*row-2, row]
			for(int num=2*row-2; num >= row ; num--) {
				System.out.print(num);
			}
			
			System.out.println();
			
		}
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); 
		
		for(int row=1; row<=n; row++){
			
			for(int col=1; col<=n-row+1; col++){
				System.out.print("*");
			}
			for(int col=1; col<2*row-2; col++){
				System.out.print(" ");
			}
			
			for(int col=0; col<n-row+1; col++){
				System.out.print("*");
			}
			
			System.out.println();
		} 
		 */
		/*
		 * int i=1; while(i<=tc) { if(i%2==1) { System.out.println(i); } i++; }
		 * while(i<=tc) { System.out.println(i); i+2; }
		 */
		
		
			/*
			 * int i=4; while(i*4<=50){ System.err.println(i*4+ " "); i = i + 1;
			 * 
			 * }
			 */
		/*
		 * FindElementInRotations fe = new FindElementInRotations(); int arr[] = { 1, 2,
		 * 3, 4, 5 }; int rotations = 3; int[][] ranges = { {0,2}, {1,4}, {0,3} }; int
		 * index = 1; System.out.println(fe.findElement(arr, ranges, rotations, index));
		 */
		
		/*
		 * int arr[] = { 12, 10, 5, 6, 52, 36 }; int n = arr.length; int position = 2;
		 * ArrayRotation arrayRotation = new ArrayRotation();
		 * arrayRotation.leftRotate(arr, position); arrayRotation.printArray(arr);
		 */
		/*
		 * ArrayRotation arrayRotation = new ArrayRotation(); int[] a = {1, 3, 5, 7, 9};
		 * arrayRotation.leftRotate(a,1); arrayRotation.printArray(a);
		 */
		
		/*8.
		 * ArrayRotation ar = new ArrayRotation(); int[] a = {1,2,3,4,5,6,7};
		 * ar.leftRotate(a, 2); ar.printArray(a);
		 */
		
		/*
		 * 1. Array.Vowels av = new Array.Vowels();
		 * System.out.print(av.solve("abhishek"));
		 */

		/*
		 * 2. Array.MaxMod maxmod = new Array.MaxMod(); int[] arr = {927, 707, 374, 394,
		 * 279, 799, 878, 937, 431, 112 }; System.out.print(maxmod.getMaxMod(arr));
		 */
		/*
		 * 3. Array.AdjacentSumArray as = new Array.AdjacentSumArray(); int[] arr = {5,
		 * 17, 100, 11}; System.out.print(as.adjacentSum(arr));
		 */
		/*
		 * 4. Array.PonnyMobilePhone pmp = new Array.PonnyMobilePhone(); int[] A = {3,
		 * 4, 4, 6}; int B[] = {20, 4, 10, 2};
		 * System.out.println(Arrays.toString(pmp.getponnymobile(A, B)));
		 */

		/*
		 * 5. Array.MiniumPick mp = new Array.MiniumPick(); int[] inputArray =
		 * {-98,54,-52,15,23,-97,12,-64,52,85};
		 * System.out.println(mp.getDiffMaxEvenMinOdd(inputArray));
		 */

		/*
		 * 6. Array.PairCount pc = new Array.PairCount(); int[] inputArray =
		 * {1,2,3,2,1}; System.out.println(pc.sumPairCount(inputArray, 5));
		 */

		/*7.
		 * Scanner scanner = new Scanner(System.in); String a = scanner.nextLine();
		 * String[] splited = a.split(" "); int l = splited.length; for(int
		 * i=0;i<l;i++){ System.out.println(splited[i]); } scanner.close();
		 */

		/*8.
		 * ArrayList<Integer> al1 = new ArrayList<>(20);
		 * 
		 * ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(50, 60, 70, 80, 90));
		 * 
		 * al1.add(10); al1.add(0, 5); al1.addAll(al2); al1.addAll(1, al2);
		 * 
		 * al1.forEach(n->System.out.println(n)); al1.forEach(System.out::println);
		 * al1.forEach(n->show(n)); Iterator<Integer> it=al1.listIterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 * 
		 * for(Iterator<Integer> it= al1.iterator(); it.hasNext();) { java.lang.Integer
		 * x = it.next(); System.out.println(x); } System.out.println(al1);
		 * System.out.println(al1.contains(10));
		 */
	} 

	/*
	 * static void show(int n) { if (n > 60) System.out.println(n); }
	 */
}
