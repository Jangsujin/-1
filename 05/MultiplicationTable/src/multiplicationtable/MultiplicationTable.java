package multiplicationtable;

public class MultiplicationTable {
	public static void main(String args[]) {
		int a;
		int b;
		for(a=1;a<=10;a++) {
			for(b=1;b<=10;b++) {
				System.out.printf("%3d ", a*b);
			}
			System.out.println("");
				
		}
	}

}
