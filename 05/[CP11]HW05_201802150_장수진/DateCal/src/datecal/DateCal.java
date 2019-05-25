package datecal;

/*
 * 
 * 컴퓨터 프로그래밍1 (11) HW05
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 */

import java.util.Scanner; // Scanner 클래스를 포함한다.

public class DateCal {
	// 메인 메소드를 시작한다.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		
		int year; // 입력받을 연도를 저장하기 위해 변수를 선언한다.
		int month; // 입력받을 월을 저장하기 위해 변수를 선언한다.
		int day; // 입력받을 일을 저장하기 위해 변수를 선언한다.
		long calday; // 입력받은 연도에서 1900을 뺀 값의 총 일 수를 저장하기 위해 변수를 선언한다.(값이 클 것으로 예상되어 long을 사용한다.)
		int countly; // 윤년의 횟수를 저장하기 위해 변수를 선언한다.
		long realday; // 입력받은 연도에서 1900을 뺀 값의 총 일 수와 윤년일 때 더해지는 날을 계산하고 저장하기 위해 변수를 선언한다.
		long x=0; // 입력받은 월을 일 수로 저장하기 위해서 변수를 선언한다. 
		long w; // 일 수를 7로 나누고, 나머지를 이용하여 요일을 계산하는데, 이 때 이 나머지를 저장할 변수를 선언한다.
		
		System.out.print("연도를 입력하시오 : "); // 연도를 입력받기 위한 안내문자를 출력한다.
		year = input.nextInt(); // 연도를 입력받는다.
		System.out.print("월을 입력하시오 : "); // 월을 입력받기 위한 안내문자를 출력한다.
		month = input.nextInt(); // 월을 입력받는다.
		System.out.print("일을 입력하시오 : "); // 일을 입력받기 위한 안내문자를 출력한다.
		day = input.nextInt(); // 일을 입력받는다.
		calday = (year-1900)*365; // 연도의 일 수를 계산한다.
		countly=(year-1900)/4; // 윤년의 횟수를 계산한다.
		realday = calday + (long)countly; // 연도의 일 수와 윤년의 횟수를 더한다. (countly의 자료형이 int이므로 이를 long으로 형변환하여 계산한다.)
		System.out.print(year+"년 "+month+"월 "+day+"일은 "); // '몇 년 몇 월 몇일은'을 출력한다.
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			// 윤년일 경우
			switch(month) {
			case 1:
				realday = realday-1;
				break;
			case 2:
				realday = realday-1;
				break;
			} // 입력받은 월이 1월과 2월일 경우에는 윤일을 지나지 않기 때문에 윤년의 횟수를 1회 줄이기 위해 -1을 한다.
			switch(month) {
			case 1:
				x=0;
				break;
			case 2:
				x = 31;
				break;
			case 3:
				x = 31+28;
				break;
			case 4:
				x = 31*2+28;
				break;
			case 5:
				x = 31*2+28+30;
				break;
			case 6:
				x = 31*3+28+30;
				break;
			case 7:
				x = 31*3+28+30*2;
				break;
			case 8:
				x = 31*4+28+30*2;
				break;
			case 9:
				x = 31*5+28+30*2;
				break;
			case 10:
				x = 31*5+28+30*3;
				break;
			case 11:
				x = 31*6+28+30*3;
				break;
			case 12:
				x = 31*6+28+30*4;
				break;
			} // 입력받은 달-1달 까지의 일 수를 구해 변수 x에 저장한다.
			w = (realday + x + (long)day)%7; // 요일을 계산하기 위해 (연의 일 수 + 달의 일 수 + 일)을 7로 나누어 나머지를 계산한다.
			switch((int)w) {
			case 0:
				System.out.println("일요일입니다."); // 나머지가 0일 경우 일요일이 나온다.
				break;
			case 1:
				System.out.println("월요일입니다."); // 나머지가 1일 경우 월요일이 나온다.
				break;
			case 2:
				System.out.println("화요일입니다."); // 나머지가 2일 경우 화요일이 나온다.
				break;
			case 3:
				System.out.println("수요일입니다."); // 나머지가 3일 경우 수요일이 나온다.
				break;
			case 4:
				System.out.println("목요일입니다."); // 나머지가 4일 경우 목요일이 나온다.
				break;
			case 5:
				System.out.println("금요일입니다."); // 나머지가 5일 경우 금요일이 나온다.
				break;
			case 6:
				System.out.println("토요일입니다."); // 나머지가 6일 경우 토요일이 나온다.
				break;
			} // 요일을 출력하기 위한 switch문이 끝이난다.
			} // 윤년일 경우를 계산한 if문이 끝이난다.
		else {
			// 윤년이 아닐 경우
			switch(month) {
			case 1:
				x=0;
				break;
			case 2:
				x = 31;
				break;
			case 3:
				x = 31+28;
				break;
			case 4:
				x = 31*2+28;
				break;
			case 5:
				x = 31*2+28+30;
				break;
			case 6:
				x = 31*3+28+30;
				break;
			case 7:
				x = 31*3+28+30*2;
				break;
			case 8:
				x = 31*4+28+30*2;
				break;
			case 9:
				x = 31*5+28+30*2;
				break;
			case 10:
				x = 31*5+28+30*3;
				break;
			case 11:
				x = 31*6+28+30*3;
				break;
			case 12:
				x = 31*6+28+30*4;
				break;
			} // 입력받은 달-1달 까지의 일 수를 구해 변수 x에 저장한다.
			w = (realday + x + (long)day)%7; // 요일을 계산하기 위해 (연의 일 수 + 달의 일 수 + 일)을 7로 나누어 나머지를 계산한다.
			switch((int)w) {
			case 0:
				System.out.println("일요일입니다."); // 나머지가 0일 경우 일요일이 나온다.
				break;
			case 1:
				System.out.println("월요일입니다."); // 나머지가 1일 경우 월요일이 나온다.
				break;
			case 2:
				System.out.println("화요일입니다."); // 나머지가 2일 경우 화요일이 나온다.
				break;
			case 3:
				System.out.println("수요일입니다."); // 나머지가 3일 경우 수요일이 나온다.
				break;
			case 4:
				System.out.println("목요일입니다."); // 나머지가 4일 경우 목요일이 나온다.
				break;
			case 5:
				System.out.println("금요일입니다."); // 나머지가 5일 경우 금요일이 나온다.
				break;
			case 6:
				System.out.println("토요일입니다."); // 나머지가 6일 경우 토요일이 나온다.
				break;
			} // 요일을 출력하기 위한 switch문이 끝이난다.
		} // 윤년이 아닐 경우를 계산한 else문이 끝이난다.
	
	} // 메인메소드가 끝이난다.

} // DateCal class가 끝이난다.
