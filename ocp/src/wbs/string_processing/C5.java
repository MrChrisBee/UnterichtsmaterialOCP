package wbs.string_processing;

import java.util.Scanner;

public class C5 {
	public static void main(String[] args) {
		String s = "1 22 ff 333 4444 fuenf 666666";
		Scanner scanner = new Scanner(s);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				System.out.println(scanner.nextInt());
			} else {
				scanner.next();
			}
		}
		scanner.close();
	}
}