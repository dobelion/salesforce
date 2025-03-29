package partTwo;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "number,gender,vibe";
		String[] arr = board.split(",");
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(arr[0].charAt(0));

	}

}
