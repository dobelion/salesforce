package firstProject_practice;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 중첩
		// 가로부터 한다음에, 아래로
		// 한 줄씩
		
		for(int j=1; j<=10; j++)
		{
			for (int i =j ; i <= j+9; i++) {
				System.out.print(i + "\t");
			}

			System.out.println();

		}
	 }
 }
