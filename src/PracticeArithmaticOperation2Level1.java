
import java.util.Scanner;

public class PracticeArithmaticOperation2Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, a, s, m, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x = ");
		x = sc.nextInt();

		System.out.println("y = ");
		y = sc.nextInt();

		sc.close();
		a = x + y;
		s = x - y;
		m = x * y;
		d = x / y;
		
		System.out.println("a = " + a);
		System.out.println("s = " + s);
		System.out.println("m = " + m);
		System.out.println("d = " + d);
		
	}
}