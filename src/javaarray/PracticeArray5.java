package javaarray;

public class PracticeArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[][] = { { 1, 2, 3, 4, 5 },
		                   { 6, 7, 8, 9, 10 } };

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.println("Number " + number[i][j]);
			}

			System.out.println();

		}

	}

}
