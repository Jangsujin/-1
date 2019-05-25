package bankaccount;

// BankAccount 클래스 시작
public class BankAccount {
	String name; // 이름 변수 생성
	String num; // 계좌번호 변수 생성
	int balance; // 잔액 변수 생성
	double interest; // 이자율  변수 생성
	
	// parameter없는 생성자
	public BankAccount() {
		name = "홍길동"; // 이름 변수에 값 저장
		num = "12-345-6-7890"; // 계좌번호 변수에 값 저장
		balance = 300000; // 잔액 변수에 값 저장
		interest = 2.20; // 이자율 변수에 값 저장
		System.out.print("b1(no parameter) : "+name+" / "+num+" / "+balance+" / "); // 출력
		System.out.printf("%.2f",interest); // 소수점 둘째자리까지 이자율 출력
		System.out.println(""); // 줄 바꿈
	}
	// parameter없는 생성자 끝
	// parameter가 4개인 생성자
	public BankAccount(String a, String b, int c, double d) {
		name = a; // 입력받은 a를 이름 변수에 저장
		num = b; // 입력받은 b를  계좌번호 변수에 저장
		balance = c; // 입력받은 c를 잔액 변수에 저장
		interest = d; // 입력받은 d를 이자율 변수에 저장
		System.out.print("b2(4 parameters) : "+name+" / "+num+" / "+balance+" / "); // 출력
		System.out.printf("%.2f",interest); // 소수점 둘째자리까지 이자율 출력
		System.out.println(""); // 줄 바꿈
	}
	// parameter가 4개인 생성자 끝
} // BankAccount 클래스 끝
