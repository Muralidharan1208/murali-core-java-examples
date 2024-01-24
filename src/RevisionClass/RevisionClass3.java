package RevisionClass;

import java.util.Scanner;

public class RevisionClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int total = 0;

		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();

		while (x != -99) {
			
			total = total + x;
			
			x = sc.nextInt();
			
		}

		sc.close();
		System.out.println("Total = " + total);
	}

}
