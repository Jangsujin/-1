package point;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW07
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

// Ŭ���� Point�� �����.
class Point{
	int px, py; // px�� py ���� ������ �Ѵ�.
	
	// ������ �޼ҵ� setX�� �����Ѵ�.(x�� y�� int������ �ؼ� ������ ���̴�.)
	public void setX(int x, int y) {
		px = x; // px�� x�� �Ѵ�.
		py = y; // py�� y�� �Ѵ�.
	}
	// �޼ҵ� setX�� ���̳���.
	// �޼ҵ� print�� �����Ѵ�.
	void print() {
		System.out.println("���� ��ǥ(x,y)�� " + "("+px+","+py+") �Դϴ�."); // ������ px�� py�� ����Ѵ�.
	}
	// �޼ҵ� print�� ���̳���.
} // Ŭ���� Point�� ���̳���.


public class PointTest {
	// ���� �޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
		Point x = new Point(); // Point Ŭ�����κ��� ��ü x�� �����.
		x.setX(10,20); // ���� �Ҵ��Ѵ�.
		x.print(); // ����Ѵ�.
		
	} // ���� �޼ҵ尡 ���̳���.
} // PointTest Ŭ������ ���̳���.
