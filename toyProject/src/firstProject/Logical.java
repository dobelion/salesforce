package firstProject;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int charCode = 'A';
		if((65<=charCode)&&(charCode<=90)) {
			System.out.println("well..");
		}
		
		int value =6;
		boolean result = (value%2==0)||(value%4==0);
		if (!result) {
			System.out.println("정신차려");}
		*/
		
		byte receive = -120;
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
		int change = receive&255;
		System.out.println(change);
		int auto = Byte.toUnsignedInt(receive);
		System.out.println(auto);
		}
	}


