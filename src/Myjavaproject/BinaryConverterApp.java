package Myjavaproject;

public class BinaryConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 7;
		
		// initializing q to 0
		int q = 0;
		int r = 0;
		String s = "";

		q = x / 2;
		r = x % 2;
		s = r + s;

		do {

			if (q >= 2) {
				q = q / 2;
				r = q % 2;
				s = r + s;

			}

		} while (q >= 2);

		s = q + s;
		System.out.println("Binary value of " + x + " = " + s);
	}

}
