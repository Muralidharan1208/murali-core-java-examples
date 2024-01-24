package kumaran;

public class KumaranCalculatorApp {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 2;
		 
		int total = add(x, y);
		
		System.out.println("addition total = " + total);
		
		int total2 = subtract(x, y);
		System.out.println("subtraction = " + total2);
		
		int total3 = multiply(x, y);
		System.out.println("multiplication = " + total3);
		
		int total4 = divide(x,y);
		System.out.println("divition = " + total4);

	}
	
	public static int add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}
	
	public static int subtract(int a, int b) {
		return (a - b);
	}
	
	public static int multiply(int a, int b) {
		//int 
		return (a * b);
	}
	
	public static int divide(int a, int b) {
		int div = 0;
		div = (a / b);
		
		return div;
	}

}
