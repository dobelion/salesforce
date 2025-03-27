package firstProject_practice;

import java.util.Scanner;

public class Scannnn {

	public static void main(String[] args) {

		int balance = 0; // 잔액
		int request = 0; // 요청 금액
		String temp = ""; // 임시 저장 문자열 숫자
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");

			System.out.print("선택>");

			// 메뉴 선택 입력
			temp = sc.nextLine();

			// 해당 메뉴에 대한 일 처리
			// 해당 메뉴에서 필요한 데이터 받기

			// 예금
			if ("1".equals(temp)) {
//잔액 변수에 요청 값 누적
				//equals 순서 바꾸는 이유 : temp 문자열이 초기화 되어있지 않다면 에러가 날 수 있어서 앞 뒤를 바꿔서 쓴다
				System.out.print("예금액>");
				request = Integer.parseInt(sc.nextLine());
				balance += request;
				// 출금
			} else if ("2".equals(temp)) {
				System.out.print("출금액>");
				request = Integer.parseInt(sc.nextLine());
			//잔액이 부족한 경우도 처리해야 함	
				if(balance<request) {
					System.out.println("you don't have enough money");
				}else {
					balance -= request; // 잔액이 충분한 경우
				}

			} else if ("3".equals(temp)) {
				System.out.println("잔고>" + balance); // 잔고 출력
			} else if ("4".equals(temp)) {
				break; // 종료
			} else {
				System.out.println("wrong");
			}

		}
	}

}
