package firstProject_practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

// 게임 시작 출력
		System.out.println("========================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("========================");

//임의의 수 생성
		int random = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(">>");
			int pick = Integer.parseInt(sc.nextLine()); // 입력 받기

//입력에 대해서 비교 후 출력 값 내기
			if (pick < random) {
				System.out.println("더 높게");
			} else if (pick > random) {
				System.out.println("더 낮게");
			}

//맞았습니다. 게임을 종료하시겠습니까?
			else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) ");
				System.out.print(">>");
				String choose = sc.nextLine();
				if ("y".equals(choose)) {
					System.out.println("========================");
					System.out.println("[숫자맞추기게임 종료]");
					System.out.println("========================");
					break;
				} else {
					// 게임 시작 출력
					System.out.println("========================");
					System.out.println("[숫자맞추기게임 시작]");
					System.out.println("========================");

					// 임의의 수 생성
					random = (int) (Math.random() * 100) + 1;
					continue; // Y인 경우, 게임 재시작
				}
			}

		}
	}

}
