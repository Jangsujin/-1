package circle;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		height = 1; // height에 1저장
		
	}
	public Cylinder(double radius) {
		super(radius); // 수퍼클래스 생성자
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
		// Circle 클래스의 메소드 getArea()와 height를 계산하고 계산값 반환
	}
	
}

