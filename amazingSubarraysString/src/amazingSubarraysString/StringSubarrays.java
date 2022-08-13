package amazingSubarraysString;
/*
 *  You are given a string S, and you have to find all the amazing substrings of S.
	An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
	
	Input
	
	Only argument given is string S.
	Output
	
	Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
	Constraints
	
	1 <= length(S) <= 1e6
	S can have special characters
	Example
	
	Input
	    ABEC
	
	Output
	    6
	
	Explanation
	    Amazing substrings of given string are :
	    1. A
	    2. AB
	    3. ABE
	    4. ABEC
	    5. E
	    6. EC
	    here number of substrings are 6 and 6 % 10003 = 6.
 */
public class StringSubarrays {

	public static void main(String[] args) {
		String A = "ABEC";
		int count=0;
		int ans = 0;
		
		String S = A.toLowerCase();
		int n  = S.length();
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count = (count+ (n-i))%10003; 
			}
		}
		
		System.out.println(count);

	}

}
