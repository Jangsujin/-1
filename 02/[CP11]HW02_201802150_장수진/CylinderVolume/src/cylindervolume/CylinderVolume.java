package cylindervolume;

/*
 * 
 * ��ǻ�����α׷��� 1 (11) HW02
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 */

import java.util.Scanner; //Scanner class�� �����Ѵ�.
public class CylinderVolume {
	//���� �޼ҵ���� �����Ѵ�.
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); // ����ڷκ��� �Է��� �ޱ� ���� Scanner�� �����Ѵ�.
		
		int r; // ����� �ظ��� ������ ���� �����ϱ� ���� ������ �����Ѵ�.
		int h; // ����� ���� ���� �����ϱ� ���� ������ �����Ѵ�. 
		double V; // ����� ���� ���� �����ϱ� ���� ������ �����Ѵ�.
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : "); // ����� �ظ��� ������ �� �Է¾ȳ��� ����Ѵ�.
		r = input.nextInt(); // ����� �ظ��� ������ ���� �Է¹޴´�.
		System.out.print("������� ���̸� �Է��Ͻÿ� : "); // ����� ���� �� �Է¾ȳ��� ����Ѵ�.
		h = input.nextInt(); // ����� ���� ���� �Է¹޴´�.
		V = r*r*3.141592*h; // ����� ���� ���� ����Ѵ�.
		System.out.println("������� ���Ǵ�" + V +"�Դϴ�."); // ����� ����� ���� ���� �������� ����Ѵ�.
	} // ���� �޼ҵ尡 ���̳���.

} // CylinderVolume class�� ���̳���.
