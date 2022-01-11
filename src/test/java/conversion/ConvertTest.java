package conversion;

public class ConvertTest {
	
	public static void main(String[] args) {
		
		int value = 12; 
		String str = Integer.toString(value);
		System.out.println(str);
		
		int newValue = Integer.parseInt(str);
		System.out.println(newValue);
	}

}
