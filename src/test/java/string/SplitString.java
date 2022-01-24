package string;

import org.junit.Test;

public class SplitString {

	@Test
	public void testSplitString() {

		String str = "This is a statement";
		String[] charArr = str.split(" ");
		for (int x = 0; x < charArr.length; x++) {
			System.out.println(charArr[x]);
		}
	}

}
