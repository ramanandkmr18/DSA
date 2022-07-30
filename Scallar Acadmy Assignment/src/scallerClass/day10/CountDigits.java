package scallerClass.day10;

public class CountDigits {
	public int getCountDigit(int number) {
		
		int count=0;
		
		if(number==0) {
			count = 1;
		}else {
			for(int i=0; number!=0; i++) { 
				count++;
				number = number/10;
			}
		}				
		
		return count;
	}
}
