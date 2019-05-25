package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Triangle extends TwoDimShape {
	// TwoDimShape 클래스를 상속받은 Triangle 클래스 시작
	double base; // 밑변을 저장할 변수 선언
	double height; // 높이를 저장할 변수 선언
	public Triangle(double x, double y, double base, double height) {
		// parameter가 4개인 Triangle 생성자 시작
		super(x,y); // 수퍼클래스 생성자
		this.base = base; // 입력받은 base를 필드 base에 저장
		this.height = height; // 입력받은 height를 필드 height에 저장
	} // Triangle 생성자 끝
	
	@Override // 재정의함을 표시
	public double getArea() {
		// area 접근자
		return base*height/2; // 삼각형의 넓이를 계산하여 return
	}
	
	@Override // 재정의함을 표시
	public String toString() {
		return "Triangle  "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}

} // Triangle 클래스 끝
