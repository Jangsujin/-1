package circle;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1; // radius�� 1 ����
	}
	public Circle(double radius) {
		this.radius = radius;
		// �Է¹��� radius�� �ʵ� radius�� ����
	}
	public double getRadius() {
		return radius;
		// radius ��ȯ
	}
	public double getArea() {
		return radius*radius*3.14;
		// ���̸� ����Ͽ� ��ȯ
	}

}
