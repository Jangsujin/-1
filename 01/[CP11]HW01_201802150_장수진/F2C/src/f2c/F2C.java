package f2c;

/**
 * 
 * 컴퓨터프로그래밍1 (11) HW01
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 */

import java.util.Scanner; //Scanner 클래스를 포함한다.
public class F2C {
	//메인 메소드부터 실행이 시작된다.
	public static void main (String args[]) {
		
		double F; //화씨온도를 저장하기 위해서 변수를 선언한다.
		double C; //섭씨온도로 계산하여 저장하기 위해서 변수를 선언한다.
		
		Scanner input = new Scanner(System.in); //사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		System.out.print("화씨 온도를 입력하시오 : "); //입력안내를 출력한다.
		F = input.nextDouble(); //화씨온도를 입력받는다.
		C = 5*(F-32)/9; //입력받은 화씨온도를 섭씨온도로 바꾸기 위해 계산하고, 이를 C 변수에 저장한다.
		System.out.println(F + " 화씨 온도는 " + C + " 섭씨 온도입니다."); //화씨온도와 섭씨온도를 출력한다.
		
	} //메인 메소드가 끝이난다.
} //F2C 클래스가 끝이난다.
