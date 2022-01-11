package array;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 1, 4, 9, 0 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all Array Elements: " + sum);
	}
}
