package Myjavaproject;


public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		System.out.println("x = " + x);
		// initializing q to 0
		int q = 0;
		int r = 0;
		String s = "";

		q = x / 2;
		r = x % 2;
		s = r + s;
		
		System.out.println("quotiant is " + q);
		System.out.println("reminder is " + r);
		System.out.println("***************");

		do {

			if (q >= 2) {
				q = q / 2;
				r = q % 2;
                s = r + s;
                
				System.out.println("quotiant is " + q);
				System.out.println("reminder is " + r);
				System.out.println("***************");
			}

		} while (q >= 2);
		
		s = q + s;
		System.out.println("s = " + s);
	}

}
