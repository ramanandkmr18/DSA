package scallerClass.day10;

import java.util.ArrayList;
import java.util.List;

import array.selfPractices.geeksForgeeks.FindElementInRotations;

/*
 * You are given an integer N you need to print all the Armstrong Numbers between 1 to N.

If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 */

public class ArmstrongNumbers {
	public Object[] findArmstrongNumberCount(int limit) {
		
		List<Integer> aList = new ArrayList<Integer>();
		
		
		for(int i=1; i<=limit ; i++) {
			if(digitArmstrongSum(i)==i) {
				aList.add(i);
			}
		} 
		 
		return aList.toArray();
	}
	public int digitArmstrongSum(int digit) {
		
		int num=0;
		
		for(int i=1; digit!=0; i++) {
			int reminder = digit%10;
			digit /=10;
			num = num+ reminder*reminder*reminder;
		}
		
		return num;
	}
	public void printArmstrongNumber(int limit) {
		 	
		Object[] objects = findArmstrongNumberCount(limit);
		  
        // Printing array of objects
        for (Object obj : objects) {
        	System.out.println(obj);
        }
	}
}
