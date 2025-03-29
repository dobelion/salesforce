package partTwo;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="hong";
String name2="hong";
//String name2 = new String("hong is cool");
//new 해도 주솟값 안달라질수도 있다

System.out.println(name1);
System.out.println(name2);

//주솟값 나오게 할 수 있다
System.out.println(name1.hashCode());
System.out.println(name2.hashCode());

System.out.println(name2.charAt(1));
System.out.println(name1.length());

if(name1==name2) {
	System.out.println(name1.length());
}

	}

}
