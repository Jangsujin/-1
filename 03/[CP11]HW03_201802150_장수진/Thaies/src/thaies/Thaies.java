package thaies;

/*
 * 
 * ��ǻ�����α׷��� 1 (11) HW03
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 */
import java.util.Scanner; // Scanner Ŭ������ �����Ѵ�.
public class Thaies { 
	// ���� �޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in); // ����ڷκ��� �Է��� ���� �� �ֵ��� ��ĳ�ʸ� �����Ѵ�.
	double ac; // �ﰢ�� ABC�� �� AC ���� �����ϱ� ���� ������ �����Ѵ�.
	double ae; // �ﰢ�� ADE�� �� AE ���� �����ϱ� ���� ������ �����Ѵ�.
	double bc; // �ﰢ�� ABC�� �� BC ���� �����ϱ� ���� ������ �����Ѵ�.
	double de; // �ﰢ�� ADE�� �� DE ���� �����ϱ� ���� ������ �����Ѵ�.
	
	System.out.print("AC : "); // �� AC���� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
	ac = input.nextDouble(); // �� AC���� �Է¹޴´�.
	System.out.print("AE : "); // �� AE���� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
	ae = input.nextDouble(); // �� AE���� �Է¹޴´�.
	System.out.print("BC : "); // �� BC���� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
	bc = input.nextDouble(); // �� BC���� �Է¹޴´�.
	de = ae*bc/ac; // ��ʽ� ��� : ������ �� = ������ ��, ��ʽ� ����� ���� �� DE�� ���� ����Ѵ�.
	System.out.print("DE : "); // ����� �� DE�� ���� ����ϱ� �� �ȳ����ڸ� ����Ѵ�.
	System.out.printf("%.6f", de); // �� DE�� ���� �Ҽ��� 6�ڸ� ���� ����Ѵ�. 
	
	} // ���� �޼ҵ尡 ���̳���.
	

} // Thaies class�� ���̳���.
