package javaarray;

public class PracticeArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = { 1, 2, 3, 4, 5 };

		// for (int num : number)
		// System.out.println(num);

		String name[] = { "Murali", "kavin", "Nila", "Kumaran", "Ram" };

		for (int i = 0; i < name.length; i++) {
			name[4] = "Deepa" ;
			System.out.println(number[i] + " " + name[i]);
		}
		
		System.out.println(name.length + " + " + number.length);

	}

}
