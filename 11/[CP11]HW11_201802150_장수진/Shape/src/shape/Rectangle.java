package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Rectangle extends TwoDimShape {
	// TwoDimShape Ŭ������ ��ӹ��� Rectangle Ŭ���� ����
	double width; // ���θ� ������ ���� ����
	double height; // ���̸� ������ ���� ����
	public Rectangle(double x, double y, double width, double height) {
		// parameter�� 4���� Rectangle ������ ����
		super(x,y); // ����Ŭ���� ������
		this.width = width; // �Է¹��� width�� �ʵ� width�� ����
		this.height = height; // �Է¹��� height�� �ʵ� height�� ����
	} // Rectangle ������ ��
	
	@Override // ���������� ǥ��
	public double getArea() {
		// area ������
		return width*height; // ���簢���� ���̸� ����Ͽ� return
	}
	
	@Override // ���������� ǥ��
	public String toString() {
		return "Rectangle "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}


} // Rectangle Ŭ���� ��
