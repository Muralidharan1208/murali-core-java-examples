package flowcontrol.switchdemo;

public class SwitchApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		switch (num + 2) {
		case 1:
			System.out.println("Case1: Value is: " + num);
		case 2:
			System.out.println("Case2: Value is: " + num);
		case 3:
			System.out.println("Case3: Value is: " + num);
		default:
			System.out.println("Default: Value is: " + num);
		}

	}

}
