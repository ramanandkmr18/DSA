package homework;

import java.util.ArrayList;

/*
 * Problem Description
	Write a function that takes an integer and returns the number of 1 bits it has.
	
	Problem Constraints
	1 <= A <= 109
	
	Input Format
	First and only argument contains integer A
	
	Output Format
	Return an integer as the answer
	
	
	Example Input
	Input1:
	11
	
	
	Example Output
	Output1:
	3
	
	
	Example Explanation
	Explaination1:
	11 is represented as 1011 in binary.
 */
public class Number_Of_1_Bits {
    public int numSetBits(int A) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        /*
            Decimal to Binary converstion
        */
        while(A>0){
            int rem = A%2;
            A /=2;
            list.add(rem);
        }

        int count = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 1){
                count++;
            }
        }

        return count;
    }
}
