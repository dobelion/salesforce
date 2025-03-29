package partTwo;

public class NewStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123433-123443";
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		int num=ssn.indexOf("443");
		System.out.println(num);
		
		// 찾기 실패하면 -1 출력함

	}

}
