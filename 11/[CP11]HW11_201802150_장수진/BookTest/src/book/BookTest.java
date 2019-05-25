package book;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class BookTest {
	// BookTest 클래스 시작
	public static void main(String args[]) {
		// 메인 메소드 시작
		Book book1 = new Novel(1,"Novel1","author1");
		// Book 클래스 참조변수 book1으로 Novel객체를 참조하며 초기값을 준다.
		Book book2 = new Poet(2,"Poet1","author2");
		// Book 클래스 참조변수 book2로 Poet객체를 참조하며 초기값을 준다.
		Book book3 = new ScienceFiction(3,"SF1","author3");
		// Book 클래스 참조변수 book3로 ScienceFiction객체를 참조하며 초기값을 준다.
		Book book4 = new ScienceFiction(3,"SF1","author3");
		// Book 클래스 참조변수 book4로 ScienceFiction객체를 참조하며 초기값을 준다.
		
		System.out.println("book1 : "+book1); // book1의 toString()을 출력
		System.out.println("book2 : "+book2); // book2의 toString()을 출력
		System.out.println("book3 : "+book3); // book3의 toString()을 출력
		System.out.println("book4 : "+book4); // book4의 toString()을 출력
		book1.getLateFees(4); // book1의 메소드에 4를 초기값으로 준다. 
		book2.getLateFees(5); // book2의 메소드에 5를 초기값으로 준다.
		book3.getLateFees(3); // book3의 메소드에 3을 초기값으로 준다.
		System.out.print("book4 == book3 ? : ");
		if(book4.equals(book3)==true)
			// book4와 book3의 관리번호가 같다면
			System.out.println("true"); // true 출력
		else System.out.println("false"); // 아니면 false 출력
		System.out.print("book4 == book1 ? : ");
		if(book4.equals(book1)==true)
			// book4와 book1의 관리번호가 같다면
			System.out.println("true"); // true 출력
		else System.out.println("false"); // 아니면 false 출력
	} // 메인 메소드 끝

} // BookTest 클래스 끝
