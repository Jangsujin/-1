package division;

import java.util.Scanner;

public class Division {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int x;
		int y;
		System.out.print("������ �Է��Ͻÿ� : ");
		num1 = input.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		num2 = input.nextInt();
		x = (num1>=num2) ? num1 : num2;
		y = (num1>=num2) ? num2 : num1;
		System.out.println(x + "��" + y + "���� ���� ����" + x/y + "�̰� ��������" + x%y + "�Դϴ�.");
		
		
	}
	
	

}
