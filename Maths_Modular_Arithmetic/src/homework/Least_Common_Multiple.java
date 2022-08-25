package homework;

import java.util.Scanner;

/*
 *  Write a program to input an integer T and then for each test case input two integers A and B in two different lines and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.
	LCM of two integers is the smallest positive integer divisible by both. 
	
	Problem Constraints
	1 <= T <= 1000 
	1 <= A,B <= 1000 
	
	Input Format
	In first-line input T which means number of test cases.
	
	Next 2T lines contains input A and B for each testcase.
	First line of each testcase contain an integer A and second line of the testcase contains input B.
	 
	Output Format 
	T lines each containing an integer representing LCM of A & B. 
	
	Example Input
	Input 1:
	3
	2
	3
	9
	6
	2
	6
	
	
	Example Output
	Output 1:
	6
	18
	6
	
	
	Example Explanation
	Explanation:
	
	 In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
	 In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
	 In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
 */
public class Least_Common_Multiple {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){

            int A = sc.nextInt();
            int B = sc.nextInt();

            /*for(int j=1; true; j++){
                if(j%A==0 && j%B==0){
                    System.out.println(j);
                    break;
                }
            }*/
            System.out.println(getLCM(A,B));
        }
        
    }

    public static int getLCM(int A, int B){

        return (A/getGCD(A,B))*B;
    }
    public static int getGCD(int A, int B){

        return B>0?getGCD(B, A%B):A;
    }

}
