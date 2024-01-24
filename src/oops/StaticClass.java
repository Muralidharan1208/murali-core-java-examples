package oops;

public class StaticClass {

	public static void main(String[] args) {
		
		Circle1.d1();
		System.out.println("d1 is a static method, that is being called in the main class");
	  //Circle.d2();
	  //Circle.d3();
	 //System.out.println("d2 & d3 is a non-static method (member method), so it cannot be referred to a static var");
		Circle1.d4();
		
	  //NOTE : 1) A static method/variable can be called inside a member method.
	  //       But a static method cannot call the local/member variable.
	  //NOTE : 2) 'Final' is the keyword to protect the value from being changed by others,
      //       who access the program.

	}

}

class Circle1 {
	static int x = 10;
	int y = 20;
	final static double z = 3.14;
	
	static void d1() {
		System.out.println("x= " + x);
		System.out.println("Z= " + z);
		//System.out.println("Y= " + y);
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
