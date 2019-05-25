package datecal;

/*
 * 
 * ��ǻ�� ���α׷���1 (11) HW05
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 */

import java.util.Scanner; // Scanner Ŭ������ �����Ѵ�.

public class DateCal {
	// ���� �޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // ����ڷκ��� �Է��� �ޱ� ���� Scanner�� �����Ѵ�.
		
		int year; // �Է¹��� ������ �����ϱ� ���� ������ �����Ѵ�.
		int month; // �Է¹��� ���� �����ϱ� ���� ������ �����Ѵ�.
		int day; // �Է¹��� ���� �����ϱ� ���� ������ �����Ѵ�.
		long calday; // �Է¹��� �������� 1900�� �� ���� �� �� ���� �����ϱ� ���� ������ �����Ѵ�.(���� Ŭ ������ ����Ǿ� long�� ����Ѵ�.)
		int countly; // ������ Ƚ���� �����ϱ� ���� ������ �����Ѵ�.
		long realday; // �Է¹��� �������� 1900�� �� ���� �� �� ���� ������ �� �������� ���� ����ϰ� �����ϱ� ���� ������ �����Ѵ�.
		long x=0; // �Է¹��� ���� �� ���� �����ϱ� ���ؼ� ������ �����Ѵ�. 
		long w; // �� ���� 7�� ������, �������� �̿��Ͽ� ������ ����ϴµ�, �� �� �� �������� ������ ������ �����Ѵ�.
		
		System.out.print("������ �Է��Ͻÿ� : "); // ������ �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		year = input.nextInt(); // ������ �Է¹޴´�.
		System.out.print("���� �Է��Ͻÿ� : "); // ���� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		month = input.nextInt(); // ���� �Է¹޴´�.
		System.out.print("���� �Է��Ͻÿ� : "); // ���� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		day = input.nextInt(); // ���� �Է¹޴´�.
		calday = (year-1900)*365; // ������ �� ���� ����Ѵ�.
		countly=(year-1900)/4; // ������ Ƚ���� ����Ѵ�.
		realday = calday + (long)countly; // ������ �� ���� ������ Ƚ���� ���Ѵ�. (countly�� �ڷ����� int�̹Ƿ� �̸� long���� ����ȯ�Ͽ� ����Ѵ�.)
		System.out.print(year+"�� "+month+"�� "+day+"���� "); // '�� �� �� �� ������'�� ����Ѵ�.
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			// ������ ���
			switch(month) {
			case 1:
				realday = realday-1;
				break;
			case 2:
				realday = realday-1;
				break;
			} // �Է¹��� ���� 1���� 2���� ��쿡�� ������ ������ �ʱ� ������ ������ Ƚ���� 1ȸ ���̱� ���� -1�� �Ѵ�.
			switch(month) {
			case 1:
				x=0;
				break;
			case 2:
				x = 31;
				break;
			case 3:
				x = 31+28;
				break;
			case 4:
				x = 31*2+28;
				break;
			case 5:
				x = 31*2+28+30;
				break;
			case 6:
				x = 31*3+28+30;
				break;
			case 7:
				x = 31*3+28+30*2;
				break;
			case 8:
				x = 31*4+28+30*2;
				break;
			case 9:
				x = 31*5+28+30*2;
				break;
			case 10:
				x = 31*5+28+30*3;
				break;
			case 11:
				x = 31*6+28+30*3;
				break;
			case 12:
				x = 31*6+28+30*4;
				break;
			} // �Է¹��� ��-1�� ������ �� ���� ���� ���� x�� �����Ѵ�.
			w = (realday + x + (long)day)%7; // ������ ����ϱ� ���� (���� �� �� + ���� �� �� + ��)�� 7�� ������ �������� ����Ѵ�.
			switch((int)w) {
			case 0:
				System.out.println("�Ͽ����Դϴ�."); // �������� 0�� ��� �Ͽ����� ���´�.
				break;
			case 1:
				System.out.println("�������Դϴ�."); // �������� 1�� ��� �������� ���´�.
				break;
			case 2:
				System.out.println("ȭ�����Դϴ�."); // �������� 2�� ��� ȭ������ ���´�.
				break;
			case 3:
				System.out.println("�������Դϴ�."); // �������� 3�� ��� �������� ���´�.
				break;
			case 4:
				System.out.println("������Դϴ�."); // �������� 4�� ��� ������� ���´�.
				break;
			case 5:
				System.out.println("�ݿ����Դϴ�."); // �������� 5�� ��� �ݿ����� ���´�.
				break;
			case 6:
				System.out.println("������Դϴ�."); // �������� 6�� ��� ������� ���´�.
				break;
			} // ������ ����ϱ� ���� switch���� ���̳���.
			} // ������ ��츦 ����� if���� ���̳���.
		else {
			// ������ �ƴ� ���
			switch(month) {
			case 1:
				x=0;
				break;
			case 2:
				x = 31;
				break;
			case 3:
				x = 31+28;
				break;
			case 4:
				x = 31*2+28;
				break;
			case 5:
				x = 31*2+28+30;
				break;
			case 6:
				x = 31*3+28+30;
				break;
			case 7:
				x = 31*3+28+30*2;
				break;
			case 8:
				x = 31*4+28+30*2;
				break;
			case 9:
				x = 31*5+28+30*2;
				break;
			case 10:
				x = 31*5+28+30*3;
				break;
			case 11:
				x = 31*6+28+30*3;
				break;
			case 12:
				x = 31*6+28+30*4;
				break;
			} // �Է¹��� ��-1�� ������ �� ���� ���� ���� x�� �����Ѵ�.
			w = (realday + x + (long)day)%7; // ������ ����ϱ� ���� (���� �� �� + ���� �� �� + ��)�� 7�� ������ �������� ����Ѵ�.
			switch((int)w) {
			case 0:
				System.out.println("�Ͽ����Դϴ�."); // �������� 0�� ��� �Ͽ����� ���´�.
				break;
			case 1:
				System.out.println("�������Դϴ�."); // �������� 1�� ��� �������� ���´�.
				break;
			case 2:
				System.out.println("ȭ�����Դϴ�."); // �������� 2�� ��� ȭ������ ���´�.
				break;
			case 3:
				System.out.println("�������Դϴ�."); // �������� 3�� ��� �������� ���´�.
				break;
			case 4:
				System.out.println("������Դϴ�."); // �������� 4�� ��� ������� ���´�.
				break;
			case 5:
				System.out.println("�ݿ����Դϴ�."); // �������� 5�� ��� �ݿ����� ���´�.
				break;
			case 6:
				System.out.println("������Դϴ�."); // �������� 6�� ��� ������� ���´�.
				break;
			} // ������ ����ϱ� ���� switch���� ���̳���.
		} // ������ �ƴ� ��츦 ����� else���� ���̳���.
	
	} // ���θ޼ҵ尡 ���̳���.

} // DateCal class�� ���̳���.
