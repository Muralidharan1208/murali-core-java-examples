package oops;

public class StaticDemo {

	public static void main(String args[]) {
		
		Circle.d1();
		
		Circle c1 = new Circle();
		c1.d2();
		
	}
}


class Circle {
	static int x = 10;
	int y = 20;
	final static double z = 3.14;
	
	static void d1() {
		System.out.println("x=" + x);
	}
	
	void d2() {
		System.out.println("I am invincible");
	}
	
	void d3() {
		d1();
		d2();
	}
	
	static void d4() {
		d1();
		//d2();
	}
}

