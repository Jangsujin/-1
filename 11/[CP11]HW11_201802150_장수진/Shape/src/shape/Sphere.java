package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Sphere extends ThreeDimShape {
	// ThreeDimShape 클래스를 상속받은 Sphere 클래스 시작
	double radius; // 반지름을 저장할 변수 선언
	public Sphere(double x, double y, double z, double radius){
		// parameter가 4개인 Sphere 생성자 시작
		super(x,y,z); // 수퍼클래스 생성자
		this.radius = radius; // 입력받은 radius를 필드 radius에 저장
	} // Sphere 생성자 끝
	
	@Override // 재정의함을 표시
	public double getVolume() {
		// volume 접근자
		return 4*(3.14*radius*radius*radius)/3; // 구의 부피를 계산하여 return
	}
	
	@Override // 재정의함을 표시
	public String toString() {
		return "Sphere    "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}

} // Sphere 클래스 끝
