package average;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW08
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

class Average{ // Average 클래스 시작
	int x;
	// 두 인수를 입력받아 평균을 계산할 메소드 생성
	public void getAverage(int a, int b) {
		x = (a+b)/2; // 평균계산
		System.out.println("두 인수("+a+", "+b+")의 평균 : "+x); // 평균 출력
	} // 메소드 끝
	// 세 인수를 입력받아 평균을 계산할 메소드 생성
	public void getAverage(int a, int b, int c) {
		x = (a+b+c)/3; // 평균계산
		System.out.println("세 인수("+a+", "+b+", "+c+")의 평균 : "+x); // 평균출력
	} // 메소드 끝
} // Average 클래스 끝

public class AverageTest {
	// 메인 메소드 시작
	public static void main(String args[]) {
		Average x = new Average(); // Average 클래스 객체 생성
		x.getAverage(10, 20); // 두 개의 인수를 넣어서 메소드 실행
		x.getAverage(10,20,30); // 세 개의 인수를 넣어서 메소드 실행
	} // 메인 메소드 끝

} // AverageTest 클래스 끝
