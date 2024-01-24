class studyopedia {
	public static void main(String[] args) {
		int a = 1000;
		int b = 450;
		int c = 500;
		int d = 2500;

		if (a > b) {
			if (a > c) {
			    if (a > d) {
					System.out.println("a is the Biggest");
				} else {
					System.out.println("d is the Biggest");

				}
			}
			else {
				if (c > d) {
					System.out.println("c is the Biggest");
				}
				else {
					System.out.println("d is the Biggest");
				}
			}
		} else {
			if (b > c) {
				if (b > d) {
					System.out.println("b is the Biggest");
				} else {
					System.out.println("d is the Biggest");
				}
			} else {
				if (c > d) {
					System.out.println("c is the Biggest");
				} else {
					System.out.println("d is the Biggest");
				}
			}
		}
		System.out.println("It took a very long time, but did it in a single go");
	}
}