package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Rectangle extends TwoDimShape {
	// TwoDimShape 클래스를 상속받은 Rectangle 클래스 시작
	double width; // 가로를 저장할 변수 선언
	double height; // 높이를 저장할 변수 선언
	public Rectangle(double x, double y, double width, double height) {
		// parameter가 4개인 Rectangle 생성자 시작
		super(x,y); // 수퍼클래스 생성자
		this.width = width; // 입력받은 width를 필드 width에 저장
		this.height = height; // 입력받은 height를 필드 height에 저장
	} // Rectangle 생성자 끝
	
	@Override // 재정의함을 표시
	public double getArea() {
		// area 접근자
		return width*height; // 직사각형의 넓이를 계산하여 return
	}
	
	@Override // 재정의함을 표시
	public String toString() {
		return "Rectangle "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}


} // Rectangle 클래스 끝
