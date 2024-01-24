package javaarray;

public class PracticeArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "Murali", "Kevin", "Nila", "Kavya", "Mahi", "Dhinesh" };
		String temp = "";
		String temp2 = "";

		for (int i = 0; i < name.length; i++) {

			temp = name[i].toLowerCase();
			temp2 = temp.toUpperCase();

			System.out.println("Name [" + i + "]=" + temp + " - Small letters");
			System.out.println("Name [" + i + "]=" + temp2 + " - Capital letters");

		}

	}

}
