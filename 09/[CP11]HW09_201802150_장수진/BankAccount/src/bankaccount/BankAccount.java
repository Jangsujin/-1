package bankaccount;

// BankAccount Ŭ���� ����
public class BankAccount {
	String name; // �̸� ���� ����
	String num; // ���¹�ȣ ���� ����
	int balance; // �ܾ� ���� ����
	double interest; // ������  ���� ����
	
	// parameter���� ������
	public BankAccount() {
		name = "ȫ�浿"; // �̸� ������ �� ����
		num = "12-345-6-7890"; // ���¹�ȣ ������ �� ����
		balance = 300000; // �ܾ� ������ �� ����
		interest = 2.20; // ������ ������ �� ����
		System.out.print("b1(no parameter) : "+name+" / "+num+" / "+balance+" / "); // ���
		System.out.printf("%.2f",interest); // �Ҽ��� ��°�ڸ����� ������ ���
		System.out.println(""); // �� �ٲ�
	}
	// parameter���� ������ ��
	// parameter�� 4���� ������
	public BankAccount(String a, String b, int c, double d) {
		name = a; // �Է¹��� a�� �̸� ������ ����
		num = b; // �Է¹��� b��  ���¹�ȣ ������ ����
		balance = c; // �Է¹��� c�� �ܾ� ������ ����
		interest = d; // �Է¹��� d�� ������ ������ ����
		System.out.print("b2(4 parameters) : "+name+" / "+num+" / "+balance+" / "); // ���
		System.out.printf("%.2f",interest); // �Ҽ��� ��°�ڸ����� ������ ���
		System.out.println(""); // �� �ٲ�
	}
	// parameter�� 4���� ������ ��
} // BankAccount Ŭ���� ��
