import java.util.ArrayList;

public class ProductArray {

	public static void main(String[] args) {
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(4);
		originalList.add(5);
		
		System.out.println("Orginal List: "+ originalList);
		System.out.println("Resultant List: "+ solve(originalList));

	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        long totalProduct = productArray(A);
        //ArrayList<Long> divisionArray = new ArrayList<Long>();

        for(int i=0; i<A.size(); i++){
            int resultDiv = (int)totalProduct/A.get(i);
            A.set(i, resultDiv);
            //divisionArray.add(resultDiv);
        }

        return A;

    }
    public static long productArray(ArrayList<Integer> A){

        long product = 1l;

        for(int i=0; i<A.size(); i++){
            product *= A.get(i);
        }

        return product;
    }

}
