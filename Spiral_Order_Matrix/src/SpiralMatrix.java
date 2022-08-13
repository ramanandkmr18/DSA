import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		 
		Scanner scanner =  new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int[][] spiralMatrix= generateMatrix(size);
		
		for(int i=0; i< size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(spiralMatrix[i][j]+" " );
			}
			System.out.println();
		}
		

	}
	public static int[][] generateMatrix(int A) {
		 
		int[][] spiralMat = new int[A][A];
        int input =1;
        
        int rowStart = 0, rowEnd = A-1;
        int colStart = 0, colEnd = A-1;
          
        
        // after each for loop {---}Start will increase and each {---}End will decrease
        while(rowStart<=rowEnd && colStart<=colEnd){
            
            // left to right
        	// Row will as it is and Column will increase
            for(int i=colStart; i<=colEnd; i++){
                spiralMat[rowStart][i] = input++; 
            }
            //Now {---}Start will Increase
            rowStart = rowStart+1; 
             
           // top to bottom in right most column
           // So last Column is as it is  Row will increase
           for(int i=rowStart; i<=rowEnd; i++){
                spiralMat[i][colEnd] = input++; 
            }
            // Now {---}End will Decrease
            colEnd = colEnd -1;
 
            // from right to left movement at Bottom of Matrix
            // So Row will be as it is and Column will decrease n-1 to 0
            for(int i= colEnd; i>=colStart; i--){
                spiralMat[rowEnd][i] = input++; 
            }
            
            // Now {---}End will Decrease
            rowEnd = rowEnd - 1;
            
            // from Bottom to top movement at left most column of Matrix
            // So Column will be as it is and Row will decrease n-1 to 0
            for(int i= rowEnd ; i>=rowStart; i--){
                spiralMat[i][colStart] = input++; 
            }
          //Now {---}Start will Increase
            colStart = colStart +1;
        } 
        return spiralMat;
    }

}
