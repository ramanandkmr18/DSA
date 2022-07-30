package array.selfPractices.geeksForgeeks;

public class FindElementInRotations {
	public int findElement(int[] arr, int[][] range, int rotation, int index) {
		
		for(int i=rotation-1;i>=0;i--) {
			int left = range[i][0];
			int right = range[i][1];
			
			if(left<=index && right>=index) {
				if(index==left) {
					index = right;
				}else {
					index--;
				}
			}
			
		}
		
		return arr[index];
	}
}
