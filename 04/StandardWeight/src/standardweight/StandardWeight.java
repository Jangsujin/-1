package standardweight;

import java.util.Scanner;

public class StandardWeight {
	public static void main(String args[]) {
		int hei;
		int wei;
		double stan;
		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		hei = input.nextInt();
		System.out.print("ü���� �Է��Ͻÿ� : ");
		wei = input.nextInt();
		stan = (hei-100)*0.9;
		if(wei>stan) 
		System.out.println("��ü���Դϴ�.");
		else if(wei==stan)
			System.out.println("ǥ��ü���Դϴ�.");
		else if(wei<stan)
			System.out.println("��ü���Դϴ�.");
		
	}

}
