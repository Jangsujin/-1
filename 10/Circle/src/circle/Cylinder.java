package circle;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		height = 1; // height�� 1����
		
	}
	public Cylinder(double radius) {
		super(radius); // ����Ŭ���� ������
		height = 1;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;

	}
	
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea()*height;
		// Circle Ŭ������ �޼ҵ� getArea()�� height�� ����ϰ� ��갪 ��ȯ
	}
	
}

