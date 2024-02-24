package Exception;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Program starts...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter 2nd number: ");
		int number2 = scanner.nextInt();
		try {
		int result = number1/number2;
		System.out.println(result);
		
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Program finished ...");
	}
}
