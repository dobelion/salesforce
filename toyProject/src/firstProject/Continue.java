package firstProject;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			// i+=2 로 짝수 출력도 가능
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + "  ");
		}
	}

}
