package cm2ftln;

import java.util.Scanner;

public class Cm2Ftln {
	public static void main (String args[]) {
		int cm;
		double inch;
		double in;
		int ft;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		cm = input.nextInt();
		inch = cm/2.54;
		ft = (int)inch/12;
		in = inch%12;
		System.out.printf(cm + "cm��" + ft + "��Ʈ");
		System.out.printf("%.5f��ġ�Դϴ�.", in);
	}

}
