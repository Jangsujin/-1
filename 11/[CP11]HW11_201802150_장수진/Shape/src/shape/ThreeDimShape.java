package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class ThreeDimShape extends Shape {
	// Shape Ŭ������ ��ӹ��� ThreeDimShape Ŭ���� ����
	double z; // z ��ǥ�� ������ ���� ����
	public ThreeDimShape(double x, double y, double z) {
		// parameter�� 3���� ThreeDimShape ������ ����
		super(x, y); // ����Ŭ���� ������
		this.z = z; // �Է¹��� z�� �ʵ� z�� ����
	} // ThreeDimShape ������ ��
	
	public double getVolume() {
		// volume ������
		return 0; // ��ȯ���� ������ �Ѵ�.(������ �� ���̱� ����)
	}
	
	public String toString() {
		return "[ point : ("+x+", "+y+", "+z+") "+"volume : "+getVolume()+"]";
		// ��ü�� ���� ���¸� ��Ÿ���� ���ڿ� ��ȯ
	}

} // ThreeDimShape Ŭ���� ��
