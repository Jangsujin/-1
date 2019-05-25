package hexa;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

import java.util.Scanner;

public class Hexa2bin {
	// Hexa2bin 클래스 시작
	public static void main(String args[]) {
		// 메인 메소드 시작
		String str; // 문자열을 저장할 변수 선언
		char num; // 문자를 저장할 변수 선언
		String [] hexa2bin = {"0000", "0001", "0010","0011",
							 "0100", "0101", "0110", "0111",
							 "1000", "1001", "1010", "1011",
							 "1100", "1101", "1110", "1111"};
		// 16진수 0부터 f에 해당되는 배열 hexa2bin 정의
		Scanner in = new Scanner(System.in);
		System.out.print("16진수 문자열을 입력하시오 : ");
		// 문자열 입력 안내 출력
		str = in.nextLine();
		// 문자열 입력받음
		System.out.print("\""+str+"\"에 대한 이진수는 ");
		for(int i = 0; i<str.length();i++) {
			// 문자열의 길이만큼 반복
			num = str.charAt(i);
			// 입력받은 문자열의 i번째 문자를 num에 저장
			if(num=='0') // num이 0이라면
				System.out.print(hexa2bin[0]+" ");
			// 배열 hexa2bin의 0번째 문자열 출력
			else if(num=='1') // num이 1이라면
				System.out.print(hexa2bin[1]+" ");
			// 배열 hexa2bin의 1번째 문자열 출력
			else if(num=='2') // num이 2라면
				System.out.print(hexa2bin[2]+" ");
			// 배열 hexa2bin의 2번째 문자열 출력
			else if(num=='3') // num이 3이라면
				System.out.print(hexa2bin[3]+" ");
			// 배열 hexa2bin의 3번째 문자열 출력
			else if(num=='4') // num이 4라면
				System.out.print(hexa2bin[4]+" ");
			// 배열 hexa2bin의 4번째 문자열 출력
			else if(num=='5') // num이 5라면
				System.out.print(hexa2bin[5]+" ");
			// 배열 hexa2bin의 5번째 문자열 출력
			else if(num=='6') // num이 6이라면
				System.out.print(hexa2bin[6]+" ");
			// 배열 hexa2bin의 6번째 문자열 출력
			else if(num=='7') // num이 7이라면
				System.out.print(hexa2bin[7]+" ");
			// 배열 hexa2bin의 7번째 문자열 출력
			else if(num=='8') // num이 8이라면
				System.out.print(hexa2bin[8]+" ");
			// 배열 hexa2bin의 8번째 문자열 출력
			else if(num=='9') // num이 9라면
				System.out.print(hexa2bin[9]+" ");
			// 배열 hexa2bin의 9번째 문자열 출력
			else if(num=='a') // num이 a라면
				System.out.print(hexa2bin[10]+" ");
			// 배열 hexa2bin의 10번째 문자열 출력
			else if(num=='b') // num이 b라면
				System.out.print(hexa2bin[11]+" ");
			// 배열 hexa2bin의 11번째 문자열 출력
			else if(num=='c') // num이 c라면
				System.out.print(hexa2bin[12]+" ");
			// 배열 hexa2bin의 12번째 문자열 출력
			else if(num=='d') // num이 d라면
				System.out.print(hexa2bin[13]+" ");
			// 배열 hexa2bin의 13번째 문자열 출력
			else if(num=='e') // num이 e라면
				System.out.print(hexa2bin[14]+" ");
			// 배열 hexa2bin의 14번째 문자열 출력
			else if(num=='f') // num이 f라면
				System.out.print(hexa2bin[15]+" ");
			// 배열 hexa2bin의 15번째 문자열 출력
			else
				break;
			// 위의 경우에 해당하지 않는다면 반복문을 빠져나간다.
		} // 반복문 끝
		System.out.println("입니다."); // 문장을 완성	
	} // 메인 메소드 끝

} // Hexa2bin 클래스 끝
