package array;

public class FindSmallest {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 1, 4, 9, 0 };
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (temp > arr[i]) {
				temp = arr[i];
			}
		}
		
		System.out.println("Smallest Number: " + temp);
	}
}
