package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Triangle extends TwoDimShape {
	// TwoDimShape Ŭ������ ��ӹ��� Triangle Ŭ���� ����
	double base; // �غ��� ������ ���� ����
	double height; // ���̸� ������ ���� ����
	public Triangle(double x, double y, double base, double height) {
		// parameter�� 4���� Triangle ������ ����
		super(x,y); // ����Ŭ���� ������
		this.base = base; // �Է¹��� base�� �ʵ� base�� ����
		this.height = height; // �Է¹��� height�� �ʵ� height�� ����
	} // Triangle ������ ��
	
	@Override // ���������� ǥ��
	public double getArea() {
		// area ������
		return base*height/2; // �ﰢ���� ���̸� ����Ͽ� return
	}
	
	@Override // ���������� ǥ��
	public String toString() {
		return "Triangle  "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Triangle Ŭ���� ��
