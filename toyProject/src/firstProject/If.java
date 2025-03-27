package firstProject;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int score = 73; if (score > 90) { System.out.println("heyy");
		 * System.out.println("great"); } else if (score >= 85) {
		 * System.out.println("hmm"); } else { System.out.println("shut the duck"); }
		 */
		// if nested
		int score = (int) (Math.random() * 9) + 1;
		System.out.println(score);

		/*
		 * switch (score) { case 1: System.out.println("he"); //break;
		 * 
		 * case 2: System.out.println("he"); //break;
		 * 
		 * case 9: System.out.println("he"); //break;
		 * 
		 * default: System.out.println("got you"); }
		 */

		switch (score) {
		case 1 -> {
			System.out.println("got you");
		}
		case 2 -> {
			System.out.println("he");

		}
		default -> {
			System.out.println("he");

		}
		}
	}
}
