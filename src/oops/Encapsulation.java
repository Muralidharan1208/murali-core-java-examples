package oops;

public class Encapsulation {
	
	//Access modifier: private, package private, public, protected
	public int age;
	String name = "";

	public void display() {
		
		String displayAgeString = "";
		if(age == 0) {
			displayAgeString = "";
		}
		else {
			displayAgeString = "" + age;
		}
		System.out.println("age=" + displayAgeString + ", name=" + name);
	}
	
}
