package hexa;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

import java.util.Scanner;

public class Hexa2bin {
	// Hexa2bin Ŭ���� ����
	public static void main(String args[]) {
		// ���� �޼ҵ� ����
		String str; // ���ڿ��� ������ ���� ����
		char num; // ���ڸ� ������ ���� ����
		String [] hexa2bin = {"0000", "0001", "0010","0011",
							 "0100", "0101", "0110", "0111",
							 "1000", "1001", "1010", "1011",
							 "1100", "1101", "1110", "1111"};
		// 16���� 0���� f�� �ش�Ǵ� �迭 hexa2bin ����
		Scanner in = new Scanner(System.in);
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ� : ");
		// ���ڿ� �Է� �ȳ� ���
		str = in.nextLine();
		// ���ڿ� �Է¹���
		System.out.print("\""+str+"\"�� ���� �������� ");
		for(int i = 0; i<str.length();i++) {
			// ���ڿ��� ���̸�ŭ �ݺ�
			num = str.charAt(i);
			// �Է¹��� ���ڿ��� i��° ���ڸ� num�� ����
			if(num=='0') // num�� 0�̶��
				System.out.print(hexa2bin[0]+" ");
			// �迭 hexa2bin�� 0��° ���ڿ� ���
			else if(num=='1') // num�� 1�̶��
				System.out.print(hexa2bin[1]+" ");
			// �迭 hexa2bin�� 1��° ���ڿ� ���
			else if(num=='2') // num�� 2���
				System.out.print(hexa2bin[2]+" ");
			// �迭 hexa2bin�� 2��° ���ڿ� ���
			else if(num=='3') // num�� 3�̶��
				System.out.print(hexa2bin[3]+" ");
			// �迭 hexa2bin�� 3��° ���ڿ� ���
			else if(num=='4') // num�� 4���
				System.out.print(hexa2bin[4]+" ");
			// �迭 hexa2bin�� 4��° ���ڿ� ���
			else if(num=='5') // num�� 5���
				System.out.print(hexa2bin[5]+" ");
			// �迭 hexa2bin�� 5��° ���ڿ� ���
			else if(num=='6') // num�� 6�̶��
				System.out.print(hexa2bin[6]+" ");
			// �迭 hexa2bin�� 6��° ���ڿ� ���
			else if(num=='7') // num�� 7�̶��
				System.out.print(hexa2bin[7]+" ");
			// �迭 hexa2bin�� 7��° ���ڿ� ���
			else if(num=='8') // num�� 8�̶��
				System.out.print(hexa2bin[8]+" ");
			// �迭 hexa2bin�� 8��° ���ڿ� ���
			else if(num=='9') // num�� 9���
				System.out.print(hexa2bin[9]+" ");
			// �迭 hexa2bin�� 9��° ���ڿ� ���
			else if(num=='a') // num�� a���
				System.out.print(hexa2bin[10]+" ");
			// �迭 hexa2bin�� 10��° ���ڿ� ���
			else if(num=='b') // num�� b���
				System.out.print(hexa2bin[11]+" ");
			// �迭 hexa2bin�� 11��° ���ڿ� ���
			else if(num=='c') // num�� c���
				System.out.print(hexa2bin[12]+" ");
			// �迭 hexa2bin�� 12��° ���ڿ� ���
			else if(num=='d') // num�� d���
				System.out.print(hexa2bin[13]+" ");
			// �迭 hexa2bin�� 13��° ���ڿ� ���
			else if(num=='e') // num�� e���
				System.out.print(hexa2bin[14]+" ");
			// �迭 hexa2bin�� 14��° ���ڿ� ���
			else if(num=='f') // num�� f���
				System.out.print(hexa2bin[15]+" ");
			// �迭 hexa2bin�� 15��° ���ڿ� ���
			else
				break;
			// ���� ��쿡 �ش����� �ʴ´ٸ� �ݺ����� ����������.
		} // �ݺ��� ��
		System.out.println("�Դϴ�."); // ������ �ϼ�	
	} // ���� �޼ҵ� ��

} // Hexa2bin Ŭ���� ��
