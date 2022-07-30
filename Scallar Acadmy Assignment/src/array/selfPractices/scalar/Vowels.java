package array.selfPractices.scalar;

/*
Raman is very fond of vowels. One day, he got a string as a gift for his birthday. He got very excited and wanted to obtain the longest subsequence of vowels from the original string. 
You are asked to help Raman. Given a string A of lowercase English alphabets, find and return a string which is the longest subsequence of vowels in the string A.

For Example

Input 1:
   abcdye
Output 1:
    ae

Input 2:
    abhishek
Output 2:
    aie

Input 3:
    interviewbit
Output 3:
    ieiei
*/
public class Vowels {
	public String solve(String str){
		
		int size = str.length();
		String volStr = "";
		for (int i = 0; i < size; i++)
	    {
	        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
	        	volStr = volStr + str.charAt(i); 
	        	//System.out.println(str.charAt(i));
	        }      
	       
	    } 
		return volStr;
		
	} 
}
