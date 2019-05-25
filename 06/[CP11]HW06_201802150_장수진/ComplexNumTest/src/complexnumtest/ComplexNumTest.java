package complexnumtest;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW06
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

import java.util.Scanner; // Scanner 클래스를 포함한다.

// ComplexNum 클래스를 만든다.
class ComplexNum{ 
	double real; // 실수 값을 저장할 변수 real을 선언한다.
	double imag; // 허수 값을 저장할 변수 imag을 선언한다.
	
	// add 메소드를 시작한다.
	void add(ComplexNum C){
		System.out.print("복소수 1 + 복소수 2 = "); // 복소수1과 복소수2를 더한 값을 출력한다.
		System.out.print(real+C.real+" + "); // 실수 부분을 계산한다.
		System.out.println(imag+C.imag+"i"); // 허수 부분을 계산한다.
		
	} // add 메소드가 끝이난다.
	// sub 메소드를 시작한다.
	void sub(ComplexNum C) {
		System.out.print("복소수 1 - 복소수 2 = "); // 복소수1과 복소수2를 뺀 값을 출력한다.
		System.out.print(real-C.real+" + "); // 실수 부분을 계산한다.
		System.out.println(imag-C.imag+"i"); // 허수 부분을 계산한다.
	} // sub 메소드가 끝이난다.
	// mul 메소드를 시작한다.
	void mul(ComplexNum C) {
		System.out.print("복소수 1 * 복소수 2 = "); // 복소수1과 복소수2를 곱한 값을 출력한다.
		System.out.print(real*C.real-imag*C.imag+" + "); // 실수 부분을 계산한다.
		System.out.println(real*C.imag+C.real*imag+"i"); // 허수 부분을 계산한다.
	} // mul 메소드가 끝이난다.
	// div 메소드를 시작한다.
	void div(ComplexNum C) {
		if(C.real==0&&C.imag==0) // 만약 복소수2의 실수부분과 허수부분이 0이라면
			System.out.println("복소수 2가 0이므로 나눗셈을 수행할 수 없습니다."); // 이 문장을 출력한다.
		else { // 만약 위의 조건을 만족하지 못한다면
			System.out.print("복소수 1 / 복소수 2 = "); // 복소수1과 복소수2를 나눈 값을 출력한다.
			System.out.print((real*C.real+imag*C.imag)/(C.real*C.real+C.imag*C.imag)+" + "); // 실수 부분을 계산한다.
			System.out.println((imag*C.real-real*C.imag)/(C.real*C.real+C.imag*C.imag)+"i"); // 허수 부분을 계산한다.
		}
		
		
	} // div 메소드가 끝이난다.

} //ComplexNum 클래스가 끝이난다.


public class ComplexNumTest {
	// 메인 메소드를 시작한다.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // 사용자로부터 값을 입력받을 수 있도록 스캐너를 생성한다.
		ComplexNum x = new ComplexNum(); // ComplexNum으로부터 객체 x를 만든다.
		ComplexNum y = new ComplexNum(); // ComplexNum으로부터 객체 y를 만든다.
		
		System.out.print("복소수 1의 실수값과 허수값을 입력하시오 : "); // 복소수1의 실수값과 허수값을 입력받기 위한 안내문자를 출력한다.
		x.real = input.nextDouble(); // 객체 x의 실수부분을 입력받는다.
		x.imag = input.nextDouble(); // 객체 x의 허수부분을 입력받는다.
		System.out.println(""); // 줄바꿈을 한다.
		System.out.print("복소수 2의 실수값과 허수값을 입력하시오 : "); // 복소수2의 실수값과 허수값을 입력받기 위한 안내문자를 출력한다.
		y.real = input.nextDouble(); // 객체 y의 실수부분을 입력받는다.
		y.imag = input.nextDouble(); // 객체 y의 허수부분을 입력받는다.
		System.out.println("복소수 1 : "+x.real+" + "+x.imag+"i"); // 복소수1을 알려준다.
		System.out.println("복소수 2 : "+y.real+" + "+y.imag+"i"); // 복소수2를 알려준다.
		
		x.add(y); // ComplexNum 클래스의 add메소드를 실행한다. (ComplexNum 타입인 y를 C대신 사용한다.)
		x.sub(y); // ComplexNum 클래스의 sub메소드를 실행한다.
		x.mul(y); // ComplexNum 클래스의 mul메소드를 실행한다.
		x.div(y); // ComplexNum 클래스의 div메소드를 실행한다.
		
	} // 메인 메소드가 끝이난다.

} // ComplexNumTest class가 끝이난다.
