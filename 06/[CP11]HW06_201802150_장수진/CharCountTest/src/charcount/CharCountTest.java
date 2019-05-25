package charcount;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW06
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

import java.util.Scanner; // Scanner 클래스를 포함한다.

// charcount 클래스를 만든다.
class charcount{
	String str; // 문자열을 저장할 변수 str을 선언한다.
	int con=0; // 자음의 개수를 저장할 변수 con을 선언한다.
	int vo=0; // 모음의 개수를 저장할 변수 vo를 선언한다.
	int in; // for문에 사용할 변수 in을 선언한다.
	int s; // 문자열의 개수를 저장할 변수 s를 선언한다.
	String y; // 모든 문자를 소문자로 만든 문자열을 저장할 변수 y를 선언한다. 
	
	// consonant 메소드를 시작한다.
	void consonant(){
		s = str.length(); // str의 길이를 s에 저장한다.
		y = str.toLowerCase(); // str의 모든 문자를 소문자로 바꿔서 y에 저장한다.

		// in의 초기값을 0으로 설정하고, in이 문자열의 길이보다 작을 때까지 반복하는 for문을 시작한다.
		for(in=0;in<s;in++) {
			switch(y.charAt(in)) {
			// y의 in번째 문자가 모음인 경우
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vo++; // 모음의 개수를 1개 증가시킨다.
				break;
			// y의 in번째 문자가 자음인 경우
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				con++; // 자음의 개수를 1개 증가시킨다.
				break;
			default:
			// 자음도 모음도 아닌 경우 그냥 나간다.	
				break;			
			}	
		}
		System.out.println("자음 : "+con+"개"); // 자음의 개수를 출력한다.
		System.out.println("모음 : "+vo+"개"); // 모음의 개수를 출력한다.
	} // consonant 메소드가 끝이난다.		
} // charcount 클래스가 끝이난다.

public class CharCountTest {
	// 메인메소드를 시작한다.
	public static void main(String args[]) {
		charcount x = new charcount(); // charcount로부터 객체 x를 만든다.
		Scanner input = new Scanner(System.in); // 사용자로부터 값을 입력받기 위해서 스캐너를 생성한다.
		System.out.print("문자열 : "); // 문자열을 입력받기 위한 안내문자를 출력한다.
		x.str = input.nextLine(); // 문자열을 입력받는다. (문자열이기 때문에 nextLine()을 쓴다.)
				
		x.consonant(); // charcount 클래스의 consonant 메소드를 실행한다.
	} // 메인메소드가 끝이난다.
} // CharCountTest class가 끝이난다.
