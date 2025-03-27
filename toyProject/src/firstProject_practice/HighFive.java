package firstProject_practice;

public class HighFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1~100 정수에서 5의 배수이면서 7의 배수인것만 출력
// %, && 사용
		for (int i=1; i<=100; i++) {
			if((i%5==0)&&(i%7==0)){
				System.out.println(i);
			}
			
		}

	}

}
