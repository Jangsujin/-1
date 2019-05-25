package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Book {
	// Book 클래스 시작
	private String title; // 제목을 저장할 변수 선언
	private String author; // 저자를 저장할 변수 선언
	private int page; // 페이지 수를 저장할 변수 선언
	
	public Book(String title, int page, String author) {
		// parameter가 3개인 생성자
		this.title = title; // 입력받은 title을 필드 title에 저장
		this.page = page; // 입력받은 page를 필드 page에 저장
		this.author = author; // 입력받은 author를 필드 author에 저장
		
	} // 생성자 정의 끝
	
	public String getTitle() {
		// title 접근자
		return title; // title을 반환
	}
	public String getAuthor() {
		// author 접근자
		return author; // author을 반환
	}
	public int getPage() {
		// page 접근자
		return page; // page를 반환
	}
	public void setTitle(String a) {
		// title 설정자
		title = a; // 입력받은 a를 title에 저장
	}
	public void setAuthor(String b) {
		// author 설정자
		author = b; // 입력받은 b를 author에 저장
	}
	public void setPage(int c) {
		// page 설정자
		page = c; // 입력받은 c를 page에 저장
	}

} // Book 클래스 끝
