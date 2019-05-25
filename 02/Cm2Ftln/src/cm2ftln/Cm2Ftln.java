package cm2ftln;

import java.util.Scanner;

public class Cm2Ftln {
	public static void main (String args[]) {
		int cm;
		double inch;
		double in;
		int ft;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오 : ");
		cm = input.nextInt();
		inch = cm/2.54;
		ft = (int)inch/12;
		in = inch%12;
		System.out.printf(cm + "cm는" + ft + "피트");
		System.out.printf("%.5f인치입니다.", in);
	}

}
