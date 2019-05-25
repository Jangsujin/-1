package student;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Graduate extends Student {
	// Student 클래스로부터 상속받은 Graduate 클래스 시작
	private String type; // TA 타입을 저장할 변수 선언
	private double scholarship; // 장학금 비율을 저장할 변수 선언
	
	public Graduate(String name, int number, String major, double grade, int credit) {
		// parameter가 5개인 생성자
		super(name, number, major, grade, credit); // superclass 생성자
	}
	
	public String getType() {
		// type 접근자
		return type; // type을 반환
	}
	public double getScholar() {
		// scholarship 접근자
		return scholarship; // scholarship을 반환
	}
	public void setType(String a) {
		// type 설정자
		type = a; // 입력받은 a를 type에 저장
	}
	public void setScholar(double b) {
		// scholarship 설정자
		scholarship = b; // 입력받은 scholarship에 저장
	}

} // Graduate 클래스 끝
