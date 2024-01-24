package oops;

public class B extends A {
	
	private String name;
	
	
	B() {
		this.name = "Kumaran";
		
	}

	public void display() {
		System.out.println("name=" + this.name);
		displayAge ();
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
 }
