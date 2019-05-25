package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Cube extends ThreeDimShape {
	// ThreeDimShape Ŭ������ ��ӹ��� Cube Ŭ���� ����
	double width; // ���θ� ������ ���� ����
	double length; // ���θ� ������ ���� ����
	double height; // ���̸� ������ ���� ����
	public Cube(double x, double y, double z, double width, double length, double height) {
		// parameter�� 6���� Cube ������ ����
		super(x,y,z); // ����Ŭ���� ������
		this.width = width; // �Է¹��� width�� �ʵ� width�� ����
		this.length = length; // �Է¹��� length�� �ʵ� length�� ����
		this.height = height; // �Է¹��� height�� �ʵ� height�� ����
	} // Cube ������ ��
	
	@Override // ���������� ǥ��
	public double getVolume() {
		// volume ������
		return width*length*height; // ������ü�� ���Ǹ� ����Ͽ� return
	}
	
	@Override // ���������� ǥ��
	public String toString() {
		return "Cube      "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Cube Ŭ���� ��
