package Myjavaproject;

public class CalculateTotalUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
        int total = 0;
        
		do {
			
			
			// incrementing x
			x = x + 1;
			total = total + x;
			
		} while (x < 5);

		// initializing q to 0
         System.out.println("Total = " + total);
	}
}
