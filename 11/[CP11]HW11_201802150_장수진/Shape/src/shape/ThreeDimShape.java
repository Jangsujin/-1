package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class ThreeDimShape extends Shape {
	// Shape 클래스를 상속받은 ThreeDimShape 클래스 시작
	double z; // z 좌표를 저장할 변수 선언
	public ThreeDimShape(double x, double y, double z) {
		// parameter가 3개인 ThreeDimShape 생성자 시작
		super(x, y); // 수퍼클래스 생성자
		this.z = z; // 입력받은 z를 필드 z에 저장
	} // ThreeDimShape 생성자 끝
	
	public double getVolume() {
		// volume 접근자
		return 0; // 반환값이 없도록 한다.(재정의 할 것이기 때문)
	}
	
	public String toString() {
		return "[ point : ("+x+", "+y+", "+z+") "+"volume : "+getVolume()+"]";
		// 객체의 현재 상태를 나타내는 문자열 반환
	}

} // ThreeDimShape 클래스 끝
