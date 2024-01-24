package Myjavaproject;

public class CalculatorApp {

	int x;
	int y;
	int z;

	public void main(String[] args) {

		this.z = show4();
		System.out.println("Addition = " + z);

		show1();
		System.out.println("Subtraction = " + show1());

		show2();
		System.out.println("Multiplication = " + show2());

		show3();
		System.out.println("Division = " + show3());

	}

	public void show() {
		this.x = 10;
		this.y = 20;

		// int A = x + y;
		// int S = x - y;
		// int M = x * y;
		// int D = x / y; //
		return;
	}

	public int show1() {
		show();

		int S = x - y;
		return S;
	}

	public int show2() {
		show();

		int M = x * y;
		return M;
	}

	public int show3() {
		show();

		int D = x / y;
		return D;
	}

	public int show4() {
		show();

		int A = x + y;
		return A;
	}

}
