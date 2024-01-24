
import java.util.Scanner;

public class PracticeScanEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		long num = sc.nextLong();
		
		String evenorodd = (num % 2 == 0) ? "Even" : "Odd" ;
		
		sc.close();
		System.out.println(num + " is " + evenorodd);
		
	}
}