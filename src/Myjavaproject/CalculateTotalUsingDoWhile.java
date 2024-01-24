package Myjavaproject;

public class CalculateTotalUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int total = 0;

		while (x <= 5) {
			total = total + x;

			// incrementing x
			x = x + 1;
			
		}

		// initializing q to 0
		System.out.println("Total = " + total);
	}
}
