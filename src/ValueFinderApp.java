import java.util.Scanner;

public class ValueFinderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int mark = sc.nextInt();

		if ((mark >= 97 && mark <= 122) || (mark >= 65 && mark <= 90)) {
			System.out.println(mark + " is an alphabets");
			char ch = (char) mark;

			System.out.println(ch);
		} else {
			System.out.println(mark + " Is not an alphabets");
		}

		System.out.println();
		sc.close();

	}

}
