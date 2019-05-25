package circle;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1; // radius에 1 저장
	}
	public Circle(double radius) {
		this.radius = radius;
		// 입력받은 radius를 필드 radius에 저장
	}
	public double getRadius() {
		return radius;
		// radius 반환
	}
	public double getArea() {
		return radius*radius*3.14;
		// 넓이를 계산하여 반환
	}

}
