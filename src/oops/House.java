package oops;

class House {
	String address;
	String color;
	double area;
	
	//Constructor: is nothing but a special method, which will be executed followed by the completion of construction of object
	//no return type
	House() {
		System.out.println("Object of house is created...");
		this.address = "";
		this.color = "";
	}

	void openDoor() {
		// Write code here
		System.out.println("Opening the door...");
	}

	void closeDoor() {
		// Write code here
		System.out.println("Closing the door...");
	}
	
	void displayAddress () {
		String name = "Kumaran";
		String address = " 3467 Brich Ln, Naperville, IL 60564";
		
		System.out.println ("address = " + this.address);
	}
	
	void displayAll() {
		System.out.println("address=" + address + ", color=" + color + ", area=" + area);
	}
	
	
}