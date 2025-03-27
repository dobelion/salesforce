package firstProject;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		while (true) {
//			System.out.print(i);
//			i++;
//		}
//		System.out.println("");
//		for(int j=1;j<=10;j++) {
//			System.out.print(j);
//		}

		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <= 9; n++) {
				//System.out.printf("%dX%d =%-4d",n,m,n*m);
				System.out.printf("%dX%d = %d\t",n,m,n*m);
				System.out.print("     ");
			}
			System.out.println();
//for while 서로 변환 용이
//
//		}
	}
}
