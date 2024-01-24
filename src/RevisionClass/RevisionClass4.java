package RevisionClass;

import java.util.Scanner;

public class RevisionClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;
		int total = 0;

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();

		while (x != -99) {
			
			y = x % 2;
			
			if (y == 0) {

				total = total + x;
			}

			x = sc.nextInt();

		}

		sc.close();
		System.out.println("Total = " + total);

	}
}
