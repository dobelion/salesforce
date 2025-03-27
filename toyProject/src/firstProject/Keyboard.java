package firstProject;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("---------------------");
			System.out.println("1. speed up | 2. lower | 3. Stop");
			System.out.println("---------------------");
			System.out.println("choose : ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				speed++;
				System.out.println("speed = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("speed =" + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("shut up");
	}

}
