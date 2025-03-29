package firstProject_practice;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// max 구하기
		// for 반복, temp에 저장
		int temp=0;
		System.out.println("insert number");
		for (int i = 1; i <= 5; i++) {
			System.out.print("number : ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if (num >= temp) {
				temp = num;
			}

		}

		System.out.println("max is " + temp);

	}

}
