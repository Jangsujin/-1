package employee;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW07
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

// Employee 클래스를 시작한다.
class Employee {
	String name; // name 변수를 선언한다.
	String num; // num 변수를 선언한다.
	int salary; // salary 변수를 선언한다.
	
	// 접근자 메소드 getName를 시작한다.
	public String getName() {
		return name; // name을 반환한다.
	}
	// 메소드 getName가 끝이난다.
	// 설정자 메소드 setName를 시작한다.
	public void setName(String na) {
		name = na; // name을 na로 한다.
	}
	// 메소드 setName가 끝이난다.
	// 접근자 메소드 getNum을 시작한다.
	public String getNum() {
		return num; // num을 반환한다.
	}
	// 메소드 getNum이 끝이난다.
	// 설정자 메소드 setNum을 시작한다.
	public void setNum(String n) {
		num = n; // num을 n으로한다.
	}
	// 메소드 setNum이 끝이난다.
	// 접근자 메소드 getSalary를 시작한다.
	public int getSalary() {
		return salary; // salary를 반환한다.
	}
	// 메소드 getSalary가 끝이난다.
	// 설정자 메소드 setSalary를 시작한다.
	public void setSalary(int s) {
		salary = s; // salary를 s로 한다.
	}
	// 메소드 setSalary가 끝이난다.
} // 클래스 Employee가 끝이난다.

public class EmployeeTest {
	// 메인 메소드를 시작한다.
	public static void main(String args[]) {
		Employee x = new Employee(); // Employee 클래스로부터 객체 x를 생성한다.
		x.setName("홍길동"); // name 값을 할당한다.
		x.setNum("010-1111-1111"); // num 값을 할당한다.
		x.setSalary(3000); // salary 값을 할당한다.
		
		System.out.println("직원 이름 : "+x.getName()); // 이름을 출력한다.
 		System.out.println("전화 번호 : "+x.getNum()); // 전화번호를 출력한다.
		System.out.println("연봉 : "+x.getSalary()); // 연봉을 출력한다.
	
	} // 메인 메소드가 끝이난다.

} // EmployeeTest 클래스가 끝이난다.
