package oops;

public class HouseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House muraliHouse = new House();
		
		muraliHouse.displayAll();
		
		muraliHouse.address = "quaide millath nagar";
		muraliHouse.color = "black";
		muraliHouse.area = 1000;

		muraliHouse.openDoor();
		muraliHouse.closeDoor();
		muraliHouse.displayAll();
		
		/*we can give instructions for multiple houses in same method
		  by creating object for each house */ 

		House dhineshHouse = new House();
		
		dhineshHouse.address = "madha kottai";
		dhineshHouse.color = "peach";
		dhineshHouse.area = 1000;
		
		dhineshHouse.openDoor();
		dhineshHouse.closeDoor();
		dhineshHouse.displayAll();
		
		
		House kavinHouse = new House();
		kavinHouse.address = "vallalar nagar";
		kavinHouse.color = "peach";
		kavinHouse.area = 1000;
		
		kavinHouse.openDoor();
		kavinHouse.closeDoor();
		kavinHouse.displayAll();

	}

}

