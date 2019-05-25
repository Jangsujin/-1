package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Cylinder extends ThreeDimShape {
	// ThreeDimShape Ŭ������ ��ӹ��� Cylinder Ŭ���� ����
	double radius; // �������� ������ ���� ����
	double height; // ���̸� ������ ���� ����
	public Cylinder(double x, double y, double z, double radius, double height) {
		// parameter�� 5���� Cylinder ������ ����
		super(x,y,z); // ����Ŭ���� ������
		this.radius = radius; // �Է¹��� radius�� �ʵ� radius�� ����
		this.height = height; // �Է¹��� height�� �ʵ� height�� ����
	} // Cylinder ������ ��
	
	@Override // ���������� ǥ��
	public double getVolume() {
		// volume ������
		return 3.14*radius*radius*height; // ������� ���Ǹ� ����Ͽ� return
	}
	
	@Override // ���������� ǥ��
	public String toString() {
		return "Cylinder  "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Cylinder Ŭ���� ��
