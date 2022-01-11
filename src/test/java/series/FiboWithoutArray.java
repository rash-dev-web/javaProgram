package series;

public class FiboWithoutArray {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int sum = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println(i);
			sum = i + j;
			i = j;
			j = sum;
		}

	}
}
