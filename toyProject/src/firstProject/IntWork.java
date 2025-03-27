package firstProject;

public class IntWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*int apple =1;
double piece = 0.1;
int num = 8;

double result;
result = apple - num*piece;
System.out.println("what is left : "+piece);

		int x = 5;
		double y = 0.0;
		double z = x/y;
		//System.out.println(z+2);
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("duck");
		}else {System.out.println(z+2);
	}
	*/
	int num1 = 10;
	int num2 = 10;
	boolean result1 = (num1==num2);
	boolean result2 = ( num1 != num2);
	System.out.println(result1);
	System.out.println(result2);
	
	char char1 = 'A';
	char char2 = 'B';
	boolean result3 = (char1<char2);
	System.out.println(result3);
	
	float num5 = 1.0f;
	double num6 = 1.0;
	boolean result6 = (num5 ==num6);
	System.out.println(result6);
	
	String str1 = new String("java");
	String str2 = new String("java");
	boolean result7 = (str1==str2);
	boolean result8 = (str1.equals(str2));
	System.out.println(result7);
	System.out.println(result8);

}
}
