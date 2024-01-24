package Myjavaproject;

public class CalculateSumOfEvenNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int total = 0;
		int r = 0;

		for (x = 0; x <= 5; x = x + 1) {
			r = x % 2;
			if (r == 0) {

				total = total + x;
			}

		}
		System.out.println("Total = " + total);
	}
}
