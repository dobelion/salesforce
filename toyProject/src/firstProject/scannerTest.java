package firstProject;

import java.util.Scanner;

public class scannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 키보드와 연결되어있음

		/*
		String inputData = scanner.nextLine();
		System.out.println("입력한 내용: "+inputData);
		
		String strX=scanner.nextLine();
		int x = Integer.parseInt(strX);
		int y = 3;
		System.out.println(x+y);
		
		*/
		
		while(true) {
			System.out.print("gggg: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;				
			}
			System.out.println("출력 문자열: " + data);

		}
		
		scanner.close();
	}

}
