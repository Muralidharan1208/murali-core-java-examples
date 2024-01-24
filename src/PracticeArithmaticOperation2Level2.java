
import java.util.Scanner;

public class PracticeArithmaticOperation2Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, a, s, m, d;
		double i, j, t, u, v, w;

		Scanner sc = new Scanner(System.in);
		System.out.println("x = ");
		x = sc.nextInt();
		
		System.out.println("i = ");
		i = sc.nextDouble();

		System.out.println("y = ");
		y = sc.nextInt();
		
		System.out.println("j = ");
		j = sc.nextDouble();

		sc.close();
		a = x + y;
		s = x - y;
		m = x * y;
		d = x / y;
		
		System.out.println("a = " + a);
		System.out.println("s = " + s);
		System.out.println("m = " + m);
		System.out.println("d = " + d);
		
		t = i + j;
		u = i - j;
		v = i * j;
		w = i / j;
		
		System.out.println("t = " + t);
		System.out.println("u = " + u);
		System.out.println("v = " + v);
		System.out.println("w = " + w);
	}
}