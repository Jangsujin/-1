package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class BookTest {
	// BookTest 클래스 시작
	public static void main(String args[]) {
		// 메인 메소드 시작
		Book b1 = new Book("b0", 100, "author0");
		// Book 클래스의 생성자로부터 객체 b1을 만들고 초기화
		Magazine m1 = new Magazine("m1", 200, "author1");
		// Magazine 클래스의 생성자로부터 객체 m1을 만들고 초기화
		Magazine m2 = new Magazine("m2", 333, "author2");
		// Magazine 클래스의 생성자로부터 m2를 만들고 초기화
		
		System.out.println("title : " + b1.getTitle());
		// b1의 title 출력
		System.out.println("page : "+b1.getPage());
		// b1의 page 출력
		System.out.println("author : "+b1.getAuthor());
		// b1의 author 출력
		System.out.println("");
		m1.setDate("2018.05.22");
		// m1의 설정자로 date 값을 할당한다.
		System.out.println("title : " + m1.getTitle());
		// m1의 title 출력
		System.out.println("page : "+m1.getPage());
		// m1의 page 출력
		System.out.println("author : "+m1.getAuthor());
		// m1의 author 출력
		System.out.println("date : "+m1.getDate());
		// m1의 date 출력
		System.out.println("");
		m2.setDate("2018.05.29");
		// m2의 설정자로 date 값을 할당한다.
		System.out.println("title : " + m2.getTitle());
		// m2의 title 출력
		System.out.println("page : "+m2.getPage());
		// m2의 page 출력
		System.out.println("author : "+m2.getAuthor());
		// m2의 author 출력
		System.out.println("date : "+m2.getDate());
		// m2의 date 출력
		
	}

}
