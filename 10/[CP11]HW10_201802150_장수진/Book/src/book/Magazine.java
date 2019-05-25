package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Magazine extends Book {
	// Book 클래스로부터 상속받은 Magazine 클래스 시작
	private String date; // 날짜를 저장할 변수 선언
	
	public Magazine(String title, int page, String author) {
		// parameter가 3개인 생성자
		super(title,page,author);
		// superclass 생성자
	}
	public String getDate() {
		// date 접근자
		return date; // date를 반환
	}
	public void setDate(String a) {
		// date 설정자
		date = a; // 입력받은 a를 date에 저장
	}

} // Magazine 클래스 끝
