package mile2kilometer;
/**
 * 
 * 컴퓨터프로그래밍 1 (11) HM01
 * 학번 : 201802150
 * 이름 : 장 수 진 
 *
 */
import java.util.Scanner; //Scanner 클래스를 포함한다.
public class Mile2Kilometer {
	//메인 메소드에서부터 실행이 시작된다.
	public static void main(String args[]) {
		
		double mile; //마일 값 저장을 위해 변수를 선언한다.
		double kilo; //킬로미터로 계산한 값을 저장하기 위해 변수를 선언한다.
		
		Scanner input = new Scanner(System.in); //사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		System.out.print("마일을 입력하시오 : "); //입력 안내를 출력한다.
		mile = input.nextDouble(); //마일 값을 입력받는다.
		kilo = mile * 1.609; //입력받은 마일 값을 킬로미터로 바꾸기 위해 계산하고, 이를 kilo 변수에 저장한다.
		System.out.println(mile + " 마일은 " + kilo + " 킬로미터입니다."); //마일 값과 킬로미터 값을 출력한다.
	} //메인 메소드가 끝이난다.
} //Mile2Kilometer 클래스가 끝이난다.
