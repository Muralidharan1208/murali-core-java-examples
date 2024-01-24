package RevisionClass;

public class RevisionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		int x = 0;

		if (a > b && a > c) {
			x = a;
		}
		else if (b > a && b > c) {
			x = b;
		}
		else if (c > a && c > b) {
			x = c;

		}

		System.out.println("the biggest value is = " + x);

	}

}
