package average;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW08
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

class Average{ // Average Ŭ���� ����
	int x;
	// �� �μ��� �Է¹޾� ����� ����� �޼ҵ� ����
	public void getAverage(int a, int b) {
		x = (a+b)/2; // ��հ��
		System.out.println("�� �μ�("+a+", "+b+")�� ��� : "+x); // ��� ���
	} // �޼ҵ� ��
	// �� �μ��� �Է¹޾� ����� ����� �޼ҵ� ����
	public void getAverage(int a, int b, int c) {
		x = (a+b+c)/3; // ��հ��
		System.out.println("�� �μ�("+a+", "+b+", "+c+")�� ��� : "+x); // ������
	} // �޼ҵ� ��
} // Average Ŭ���� ��

public class AverageTest {
	// ���� �޼ҵ� ����
	public static void main(String args[]) {
		Average x = new Average(); // Average Ŭ���� ��ü ����
		x.getAverage(10, 20); // �� ���� �μ��� �־ �޼ҵ� ����
		x.getAverage(10,20,30); // �� ���� �μ��� �־ �޼ҵ� ����
	} // ���� �޼ҵ� ��

} // AverageTest Ŭ���� ��
