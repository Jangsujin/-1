package student;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class UnderGraduate extends Student {
	// Student로 부터 상속받은 UnderGraduate 클래스 시작
	private String club; // 동아리를 저장할 변수 선언
	
	public UnderGraduate(String name, int number, String major, double grade, int credit) {
		// parameter가 5개인 생성자
		super(name,number,major,grade,credit); // superclass 생성자
	} // 생성자 정의 끝
	
	public String getClub() {
		// club 접근자
		return club; // club을 반환
	}
	public void setClub(String a) {
		// club 설정자
		club = a; // 입력받은 a를 club에 저장
	}
	
} // UnderGraduate 클래스 끝
