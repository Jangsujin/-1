package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Sphere extends ThreeDimShape {
	// ThreeDimShape Ŭ������ ��ӹ��� Sphere Ŭ���� ����
	double radius; // �������� ������ ���� ����
	public Sphere(double x, double y, double z, double radius){
		// parameter�� 4���� Sphere ������ ����
		super(x,y,z); // ����Ŭ���� ������
		this.radius = radius; // �Է¹��� radius�� �ʵ� radius�� ����
	} // Sphere ������ ��
	
	@Override // ���������� ǥ��
	public double getVolume() {
		// volume ������
		return 4*(3.14*radius*radius*radius)/3; // ���� ���Ǹ� ����Ͽ� return
	}
	
	@Override // ���������� ǥ��
	public String toString() {
		return "Sphere    "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Sphere Ŭ���� ��
