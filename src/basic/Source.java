package basic;

import java.util.Scanner;

public class Source {

	public static void main(String args[]) {
		try (/* Enter your code here. Read input from STDIN. Print output to STDOUT */
				Scanner scanner = new Scanner(System.in)) {
			String str = scanner.nextLine();

			InAmsterdam obj = new InAmsterdam();
			int result = obj.countAm(str);
			System.out.println(result);
		}
	}
}