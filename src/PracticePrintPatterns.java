import java.util.Scanner;
public class PracticePrintPatterns {
	
	public static void main(String[] args) {
		
				
		System.out.println("This is main method ");
		main2();
	}
	public static void main2() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name ? ");
		
		String name = sc.nextLine();
		System.out.println("My name is " + name);
		
		sc.close();
	}
}