package tester;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {

		int choice, v1 = 1, v2 = 1;
		int result = 0;
		System.out.print("Enter the positive number: ");
		try (Scanner sc = new Scanner(System.in)) {
			choice = sc.nextInt();
			if (choice <= 0)
				System.out.println("wrong input");
			else {

				for (int i = 1; i <= choice - 2; i++) {

					result = v1 + v2;
					v1 = v2;
					v2 = result;
				}
				System.out.print("Fibonacci number of position " + choice + " is: " + (result == 0 ? 1 : result));
			}
		}
	}
}
