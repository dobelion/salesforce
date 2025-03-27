package firstProject_practice;

public class SumOfLIfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int j = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
			j = i;

		}
		System.out.print("1부터 "+(j) + "까지 총합은 " + sum);

	}
}
