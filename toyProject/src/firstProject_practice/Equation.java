package firstProject_practice;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {

				int total = 4 * x + 5 * y;
				if (total == 60) {
					// if ((4 * x) + (5 * y) == 60) {
					System.out.print("(" + x + "," + y + ")" + "\t");
					System.out.println("4" + "x" + x + "+" + "5" + "x" + y + "=" + (4 * x + 5 * y) + "\t");

				}
			}
		}
	}

}
