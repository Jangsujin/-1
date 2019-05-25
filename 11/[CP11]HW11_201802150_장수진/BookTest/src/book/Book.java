package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Book {
	// Book 클래스 시작
	int number; // 관리번호를 저장할 변수 선언
	String title; // 제목을 저장할 변수 선언
	String author; // 저자를 저장할 변수 선언
	
	public Book(int number, String title, String author) {
		// parameter가 3개인 Book 생성자 시작
		this.number = number; // 입력받은 number를 필드 number에 저장
		this.title = title; // 입력받은 title을 필드 title에 저장
		this.author = author; // 입력받은 author를 필드 author에 저장
		
	} // Book 생성자 끝
	
	public int getNumber() {
		// number 접근자
		return number; // number 반환
	}
	public void setNumber(int a) {
		// number 생성자
		number = a; // 입력받은 a를 number에 저장
	}
	public String getTitle() {
		// title 접근자
		return title; // title 반환
	}
	public void setTitle(String b) {
		// title 생성자
		title = b; // 입력받은 b를 title에 저장
	}
	public String getAuthor() {
		// author 접근자
		return author; // author 반환
	}
	public void setAuthor(String c) {
		// author 생성자
		author = c; // 입력받은 c를 author에 저장
	}
	
	@Override // 재정의함을 표시 (Object 클래스의 것 재정의)
	public boolean equals(Object obj) {
		// equals 메소드 시작
		Book other = (Book) obj;
		// obj를 형변환하여 Book 참조변수로 바꾼다.
		if (number == other.number)
			// 두 개의 객체의 number가 같다면
			return true; // true를 반환
		else return false; // 아니면 false를 반환
	} // equals 메소드 끝
	
	public void getLateFees(int x) {
		// parameter를 1개 가지는 getLateFees 메소드 시작
		System.out.println(""); // 아무것도 출력하지 않는다.(재정의할 것)
	} // getLateFees 메소드 끝
	
	public String toString() {
		return "[number="+getNumber()+", title="+getTitle()+", author="+getAuthor()+"]";
		// 객체의 현재 상태를 나타내는 문자열 반환
	}

} // Book 클래스 끝
