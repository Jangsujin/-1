package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Cube extends ThreeDimShape {
	// ThreeDimShape 클래스를 상속받은 Cube 클래스 시작
	double width; // 가로를 저장할 변수 선언
	double length; // 세로를 저장할 변수 선언
	double height; // 높이를 저장할 변수 선언
	public Cube(double x, double y, double z, double width, double length, double height) {
		// parameter가 6개인 Cube 생성자 시작
		super(x,y,z); // 수퍼클래스 생성자
		this.width = width; // 입력받은 width를 필드 width에 저장
		this.length = length; // 입력받은 length를 필드 length에 저장
		this.height = height; // 입력받은 height를 필드 height에 저장
	} // Cube 생성자 끝
	
	@Override // 재정의함을 표시
	public double getVolume() {
		// volume 접근자
		return width*length*height; // 직육면체의 부피를 계산하여 return
	}
	
	@Override // 재정의함을 표시
	public String toString() {
		return "Cube      "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}

} // Cube 클래스 끝
