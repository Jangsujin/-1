package moneybox;

import java.util.Scanner;
public class MoneyBox {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int sum;
		System.out.print("500�� ¥�� ������ ���� : ");
		a = input.nextInt();
		System.out.print("100�� ¥�� ������ ���� : ");
		b = input.nextInt();
		System.out.print("50�� ¥�� ������ ���� : ");
		c = input.nextInt();
		System.out.print("10�� ¥�� ������ ���� : ");
		d = input.nextInt();
		sum = 500*a + 100*b + 50*c + 10*d;
		System.out.print("���� �׼� : " + sum + "��");
		
	}

}
