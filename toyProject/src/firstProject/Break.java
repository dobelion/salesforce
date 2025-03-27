package firstProject;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("dd");
		
//		int i=1;
//		do {
//			System.out.println(i);
//			i++;
//		} while(i<=10);

	}

}
