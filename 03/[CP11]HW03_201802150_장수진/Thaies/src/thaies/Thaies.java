package thaies;

/*
 * 
 * 컴퓨터프로그래밍 1 (11) HW03
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 */
import java.util.Scanner; // Scanner 클래스를 포함한다.
public class Thaies { 
	// 메인 메소드를 시작한다.
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받을 수 있도록 스캐너를 생성한다.
	double ac; // 삼각형 ABC의 변 AC 값을 저장하기 위해 변수를 선언한다.
	double ae; // 삼각형 ADE의 변 AE 값을 저장하기 위해 변수를 선언한다.
	double bc; // 삼각형 ABC의 변 BC 값을 저장하기 위해 변수를 선언한다.
	double de; // 삼각형 ADE의 변 DE 값을 저장하기 위해 변수를 선언한다.
	
	System.out.print("AC : "); // 변 AC값을 입력받기 위한 안내문자를 출력한다.
	ac = input.nextDouble(); // 변 AC값을 입력받는다.
	System.out.print("AE : "); // 변 AE값을 입력받기 위한 안내문자를 출력한다.
	ae = input.nextDouble(); // 변 AE값을 입력받는다.
	System.out.print("BC : "); // 변 BC값을 입력받기 위한 안내문자를 출력한다.
	bc = input.nextDouble(); // 변 BC값을 입력받는다.
	de = ae*bc/ac; // 비례식 계산 : 내항의 곱 = 외항의 곱, 비례식 계산을 통해 변 DE의 값을 계산한다.
	System.out.print("DE : "); // 계산한 변 DE의 값을 출력하기 전 안내문자를 출력한다.
	System.out.printf("%.6f", de); // 변 DE의 값을 소숫점 6자리 까지 출력한다. 
	
	} // 메인 메소드가 끝이난다.
	

} // Thaies class가 끝이난다.
