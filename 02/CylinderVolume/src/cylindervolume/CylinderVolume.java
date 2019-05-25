package cylindervolume;

/*
 * 
 * 컴퓨터프로그래밍 1 (11) HW02
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 */

import java.util.Scanner; //Scanner class를 포함한다.
public class CylinderVolume {
	//메인 메소드부터 실행한다.
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		
		int r; // 원기둥 밑면의 반지름 값을 저장하기 위해 변수를 선언한다.
		int h; // 원기둥 높이 값을 저장하기 위해 변수를 선언한다. 
		double V; // 원기둥 부피 값을 저장하기 위해 변수를 선언한다.
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오 : "); // 원기둥 밑면의 반지름 값 입력안내를 출력한다.
		r = input.nextInt(); // 원기둥 밑면의 반지름 값을 입력받는다.
		System.out.print("원기둥의 높이를 입력하시오 : "); // 원기둥 높이 값 입력안내를 출력한다.
		h = input.nextInt(); // 원기둥 높이 값을 입력받는다.
		V = r*r*3.141592*h; // 원기둥 부피 값을 계산한다.
		System.out.println("원기둥의 부피는" + V +"입니다."); // 계산한 원기둥 부피 값을 문장으로 출력한다.
	} // 메인 메소드가 끝이난다.

} // CylinderVolume class가 끝이난다.
