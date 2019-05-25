package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Poet extends Book {
	// Book 클래스를 상속받은 Poet 클래스 시작
	public Poet(int number, String title, String author) {
		// parameter가 3개인 Poet 생성자 시작
		super(number,title,author); // 수퍼클래스 생성자
	} // Poet 생성자 끝
	
	@Override // 재정의함을 표시
	public void getLateFees(int x) {
		// parameter를 1개 가지는 getLateFees 메소드 시작
		System.out.println("book2(Poet)  "+x+"일 연체 : "+x*200);
		// 입력받은 x를 연체일로 하여 연체료를 계산하고 출력
	} // getLateFees 메소드 끝
	
	public String toString() {
		return "Poet  "+super.toString();
		// 수퍼클래스의 toString()메소드를 이용하여 출력
	}

} // Poet 클래스 끝
