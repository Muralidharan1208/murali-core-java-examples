package oops;

public class Student {

	String name;
	int rollno;
	double english;
	double tamil;
	private double maths;
	private double science;
	double scocial;
	
	
	void displayenglish(double E) {
		this.english = E;
		System.out.println("English = " + english);

	}
	
	void displaytamil(double T) {
		this.tamil = T;
		System.out.println("Tamil = " + T);
	}
	
	public void diplaymaths(double M) {
		this.maths = M;
		System.out.println("Maths = " + M);
	}
	
	void displayscience(double S) {
		this.science = S;
		System.out.println("Science = " + S);
	}
	
	void displayscocial(double Sc) {
		this.scocial = Sc;
		System.out.println("Scocial = " + Sc);
	}

}
