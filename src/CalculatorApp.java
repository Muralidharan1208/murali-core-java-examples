
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 4;
		int r = 0;

		r = addition(a, b);
		System.out.println("Result for addition is = " + r);
		
		r = subtraction(a, b);
		System.out.println("Result for subtraction is = " + r);
		
		r = multiplication(a, b);
		System.out.println("Result for multiplication is = " + r);
		
		r = division(a, b);
		System.out.println("Result for multiplication is = " + r);

	}

	public static int addition(int a, int b) {

		int x = a + b;
		System.out.println("a + b = " + x);
		return x;

	}

	public static int subtraction(int a, int b) {

		int y = a - b;
		System.out.println("a - b = " + y);
		return y;
	}

	public static int multiplication(int a, int b) {

		int z = a * b;
		System.out.println("a * b = " + z);
		return z;
	}

	public static int division(int a, int b) {

		int d = a / b;
		System.out.println("a / b = " + d);
		return d;
	}

}
