package bankaccount;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW09
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

// BankAccountTest 클래스 시작
public class BankAccountTest {
	// 메인 메소드 시작
	public static void main(String args[]) {
		BankAccount x = new BankAccount(); // parameter가 없는 생성자로부터 객체 생성하고 초기화
		BankAccount y = new BankAccount("김철수","111-22-3-4444",500000,1.70); // parameter가 4개인 생성자로부터 객체 생성하고 초기값을 준다.
	}
	// 메인 메소드 끝

}
// BankAccountTest 클래스 끝
