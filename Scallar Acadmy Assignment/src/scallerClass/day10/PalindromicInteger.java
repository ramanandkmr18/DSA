package scallerClass.day10;

public class PalindromicInteger {
	
	public boolean isPalindromicInteger(int num) {
		
		int rev=0;
		int temp = num;
		
		if(num==0) {
			return true;
		}else {
			while(temp>0) {
				rev= rev*10 + temp%10;
				temp /=10;
			}
		}	
		
		if(rev==num) {
			return true;
		}
		
		return false;
	}
}
