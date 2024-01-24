package Myjavaproject;

public class CalculateTotalUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int total = 0;

		for (x = 0; x <= 5; x = x + 1) {

			total = total + x;

		}
		System.out.println("x = " + x);
		// initializing q to 0
		System.out.println("Total = " + total);
	}
}
