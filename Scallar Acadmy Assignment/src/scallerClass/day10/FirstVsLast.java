package scallerClass.day10;

public class FirstVsLast {
	
    public long getFirstDigit(long num){
        long firstNum = 0;
        if(num==0){
            return 0;
        }else{
            while(num!=0){
            	firstNum = num%10;
                num = num/10;
            }
            return firstNum;
        }
    }
    public long getLastDigit(long num){
    	return num%10;
    }
}
