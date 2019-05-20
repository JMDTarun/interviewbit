package dsalgo.arrays;

public class MaximumSumDecreasingSubsequence {

	public static void main(String[] args) {
		int[] array = {5, 4, 100, 3, 2, 101, 1};
		maximumSumDecreasingSubsequence(array);
	}
	
	private static int maximumSumDecreasingSubsequence(int[] array) {
		int tempArr[] = new int[array.length];
		
		for(int i=0;i<tempArr.length;i++) {
			tempArr[i] = array[i];
		}
		
		for(int i=1;i<array.length; i++) {
			for(int j=0;j<i;j++) {
				if(array[i] < array[j]) {
					if(array[i] + tempArr[j] > tempArr[i]) {
						tempArr[i] = array[i] + tempArr[j];
					}
				}
			}
		}
		for(int i=1;i<tempArr.length;i++) {
			System.out.println(tempArr[i]);
		}
		return 0;
	}
	
}
