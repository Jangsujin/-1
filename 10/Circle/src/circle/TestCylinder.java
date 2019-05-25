package circle;

public class TestCylinder {
	public static void main(String args[]) {
		Cylinder obj1 = new Cylinder();
		// parameter가 없는 생성자로 객체 생성
		Cylinder obj2 = new Cylinder(5.0,3.0);
		// parameter가 2개인 생성자로 객체 생성
		
		System.out.println("obj1의 밑면의 반지름 : "+obj1.getRadius()+", 밑면의 넓이 : "+obj1.getArea()+", 높이 : "+obj1.getHeight()+", 부피 : "+obj1.getVolume());
		// obj1의 속성을 접근자를 통해 출력
		System.out.println("obj2의 밑면의 반지름 : "+obj2.getRadius()+", 밑면의 넓이 : "+obj2.getArea()+", 높이 : "+obj2.getHeight()+", 부피 : "+obj2.getVolume());
		// obj2의 속성을 접근자를 통해 출력

	}

}
