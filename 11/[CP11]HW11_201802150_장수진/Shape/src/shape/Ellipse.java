package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Ellipse extends TwoDimShape {
	// TwoDimShape 클래스를 상속받은 Ellipse 클래스 시작
	double minor; // 짧은 반지름을 저장할 변수 선언
	double major; // 긴 반지름을 저장할 변수 선언
	public Ellipse(double x, double y, double minor, double major) {
		// parameter가 4개인 Ellipse 생성자 시작
		super(x,y); // 수퍼클래스 생성자
		this.minor = minor; // 입력받은 minor를 필드 minor에 저장
		this.major = major; // 입력받은 major를 필드 major에 저장
	} // Ellipse 생성자 끝
	
	@Override // 재정의함을 표시
	public double getArea() {
		// area 접근자
		return 3.14*minor*major; // 타원의 넓이를 계산하여 return
	}
	
	@Override // 재정의함을  표시
	public String toString() {
		return "Ellipse   "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}

} // Ellipse 클래스 끝
