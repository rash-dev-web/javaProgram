package array;

public class SortArrayOfString {

	public static void main(String[] args) {

		String[] arr = { "abc", "xyz", "qwe", "poi", "asd", "jkl" };
		String temp;
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.println(arr[j]);
		}
	}

}
