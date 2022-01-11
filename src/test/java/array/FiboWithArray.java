package array;

public class FiboWithArray {

	public static void main(String[] args) {

		int[] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		for (int x = 2; x < 10; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		
		for(int x=0;x<10;x++) {
			System.out.println(arr[x]);
		}
	}
}
