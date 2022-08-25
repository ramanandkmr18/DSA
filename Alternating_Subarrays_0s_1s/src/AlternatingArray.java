import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		 
		A.add(1);
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(1);
		
		System.out.print(alternatingSubArrayCenter(A, 1));
		
		
	}
	public static ArrayList<Integer> alternatingSubArrayCenter(ArrayList<Integer> A, int B) {
		int alterningLength = 2 * B + 1;
        int[] dpArr = new int[A.size()];
        dpArr[0] = 1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) != A.get(i - 1))
                dpArr[i] = 1 + dpArr[i - 1];
            else
                dpArr[i] = 1;
        }
       
        ArrayList<Integer> resultArrLst = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (i + B < A.size()) {
                if (dpArr[i + B] >= alterningLength)
                    resultArrLst.add(i);
            }
        }
        return resultArrLst;
    }

}
