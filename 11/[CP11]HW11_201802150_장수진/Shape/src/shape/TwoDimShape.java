package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class TwoDimShape extends Shape {
	// Shape Ŭ������ ��ӹ��� TwoDimShape Ŭ���� ����
	public TwoDimShape(double x, double y) {
		// parameter�� 2���� TwoDimShape ������ ����
		super(x,y); // ����Ŭ���� ������
	} // TwoDimShape ������ ��
	public double getArea() {
		// area ������
		return 0; // ��ȯ���� ������ �Ѵ�.(������ �� ���̱� ����)
	}
	
	public String toString() {
		return "[ point : ("+x+", "+y+") "+"area : "+getArea()+"]";
		// ��ü�� ���� ���¸� ��Ÿ���� ���ڿ� ��ȯ
	}

} // TwoDimShape Ŭ���� ��
