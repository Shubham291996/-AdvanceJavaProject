package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program starts...");
		int result = 0;
		try {
		result = 10/2;
		System.out.println(result);
		int [] array = new int [result];
		array[4] = 100;
		System.out.println(array[4]);
		String str = "str";
		System.out.println(str.concat("ccc"));
		}catch (ArithmeticException e) {
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
		}finally {
			System.out.println("Important Code");
		}
		
		System.out.println("Program ends...");
		
		

	}

}
