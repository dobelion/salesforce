package partTwo;

public class Arrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2; // 배열이란 비슷한 형태 여러개 저장 시킬 것
		int[] arr3; // 배열 변수 선언

//참조형 변수들은 new 로 초기화를 시켜줘야함

		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 }; // new 로 객체 만듬. 새로운 번지를 arr2에 넣음
		arr3 = arr2; // 주소 복사
// 배열일때는 객체가 필요함!
//new 로 하면 heap 영역에 객체가 들어갈 공간 만들어줌

		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);

	}

}
