package student;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class Student {
	// Student 클래스 시작
	private String name; // 이름을 저장할 변수 선언
	private int number; // 학번을 저장할 변수 선언
	private String major; // 소속학과를 저장할 변수 선언
	private double grade; // 학점을 저장할 변수 선언
	private int credit; // 이수 학점을 저장할 변수 선언
	
	public Student(String name, int number, String major, double grade, int credit) {
		// parameter가 5개인 생성자
		this.name = name; // 입력받은 name을 필드 name에 저장
		this.number = number; // 입력받은 number를 필드 number에 저장
		this.major = major; // 입력받은 major를 필드 major에 저장
		this.grade = grade; // 입력받은 grade를 필드 grade에 저장
		this.credit = credit; // 입력받은 credit을 필드 credit에 저장
	} // 생성자 정의 끝
	
	public String getName() {
		// name 접근자
		return name; // name를 반환
	}
	public int getNumber() {
		// number 접근자
		return number; // number를 반환
	}
	public String getMajor() {
		// major 접근자
		return major; // major를 반환
	}
	public double getGrade() {
		// grade 접근자
		return grade; // grade를 반환
	}
	public int getCredit() {
		// credit 접근자
		return credit; // credit을 반환
	}
} // Student 클래스 끝
