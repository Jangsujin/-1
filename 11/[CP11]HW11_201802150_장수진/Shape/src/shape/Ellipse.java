package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Ellipse extends TwoDimShape {
	// TwoDimShape Ŭ������ ��ӹ��� Ellipse Ŭ���� ����
	double minor; // ª�� �������� ������ ���� ����
	double major; // �� �������� ������ ���� ����
	public Ellipse(double x, double y, double minor, double major) {
		// parameter�� 4���� Ellipse ������ ����
		super(x,y); // ����Ŭ���� ������
		this.minor = minor; // �Է¹��� minor�� �ʵ� minor�� ����
		this.major = major; // �Է¹��� major�� �ʵ� major�� ����
	} // Ellipse ������ ��
	
	@Override // ���������� ǥ��
	public double getArea() {
		// area ������
		return 3.14*minor*major; // Ÿ���� ���̸� ����Ͽ� return
	}
	
	@Override // ����������  ǥ��
	public String toString() {
		return "Ellipse   "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Ellipse Ŭ���� ��
