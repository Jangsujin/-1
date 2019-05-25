package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class TwoDimShape extends Shape {
	// Shape 클래스를 상속받은 TwoDimShape 클래스 시작
	public TwoDimShape(double x, double y) {
		// parameter가 2개인 TwoDimShape 생성자 시작
		super(x,y); // 수퍼클래스 생성자
	} // TwoDimShape 생성자 끝
	public double getArea() {
		// area 접근자
		return 0; // 반환값이 없도록 한다.(재정의 할 것이기 때문)
	}
	
	public String toString() {
		return "[ point : ("+x+", "+y+") "+"area : "+getArea()+"]";
		// 객체의 현재 상태를 나타내는 문자열 반환
	}

} // TwoDimShape 클래스 끝
