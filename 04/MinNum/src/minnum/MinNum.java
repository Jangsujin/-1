package minnum;

import java.util.Scanner;

public class MinNum {
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ� : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a>b) {
			x = (b>c) ? c : b;
		System.out.println("���� ���� ���� "+x+"�Դϴ�.");
		}
		else if(a<b) {
			x = (a>c) ? c : a;
			System.out.println("���� ���� ���� "+x+"�Դϴ�.");
		}
	
	
	}
}
