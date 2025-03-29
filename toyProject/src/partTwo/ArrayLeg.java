package partTwo;

import java.util.Scanner;

public class ArrayLeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[3];
//배열에서 숫자 항상 유의. indexing 하는 것은 0부터 시작
//made a array with 3 room

		System.out.println("insert 3 numbers");
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < 3; i++) {
			scores[i] = sc.nextInt();
			sum += scores[i];
			//System.out.print(scores[i]+", ");
		}

//		System.out.println(scores);
		// 내용 표시 어떻게 하는지 : 이건 파이썬에서 딱 중괄호로 보이지만for 문으로 해야함
		// arr.length : 배열 객체에 메서드는 () 필요없음
		// arr.length() : string 객체에 () 해서 연산 

//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//			System.out.print(scores[i]+", ");
//		}
		System.out.println();
		System.out.println(sum);

		double avg = (double) sum / scores.length;
		System.out.println(avg);
//정확하지 않을수도있다
	}

}
