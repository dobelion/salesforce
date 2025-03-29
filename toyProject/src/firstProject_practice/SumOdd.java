package firstProject_practice;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 처음 출력
		System.out.println("insert number");

		// 입력받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// if로 홀수인지 짝수인지 판별
		int sum = 0;
		if (num % 2 == 0) {
			for (int i = 2; i < num; i += 2) {
				sum += i;
				System.out.print(i + "+");
			}
		} else {
			for (int i = 1; i < num; i += 2) {
				sum += i;
				System.out.print(i + "+");
			}

		}
		System.out.print(num);
		System.out.println("=" + (sum+num));
		
//		System.out.println(num/2);
//		System.out.println(num%2);
// 음수인지 확인


		// 각각 상황에 따라서 입력값까지의 sum
		// 덧셈과정 및 결과 값 출력

	}

}
