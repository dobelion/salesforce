package partTwo;

public class NullStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String hobby = "dog";
hobby = null; //dog 에 해당하는 String 객체를 쓰레기로 만듬

String kind1 = "car";
String kind2 = kind1; // 객체 복사. kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
kind1 = null;
System.out.println(kind2);

	}

}
