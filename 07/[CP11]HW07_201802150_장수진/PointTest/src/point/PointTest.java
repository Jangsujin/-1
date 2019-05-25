package point;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW07
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

// 클래스 Point를 만든다.
class Point{
	int px, py; // px와 py 변수 선언을 한다.
	
	// 설정자 메소드 setX를 시작한다.(x와 y를 int형으로 해서 설정할 것이다.)
	public void setX(int x, int y) {
		px = x; // px를 x로 한다.
		py = y; // py를 y로 한다.
	}
	// 메소드 setX가 끝이난다.
	// 메소드 print를 시작한다.
	void print() {
		System.out.println("점의 좌표(x,y)는 " + "("+px+","+py+") 입니다."); // 설정한 px와 py를 출력한다.
	}
	// 메소드 print가 끝이난다.
} // 클래스 Point가 끝이난다.


public class PointTest {
	// 메인 메소드를 시작한다.
	public static void main(String args[]) {
		Point x = new Point(); // Point 클래스로부터 객체 x를 만든다.
		x.setX(10,20); // 값을 할당한다.
		x.print(); // 출력한다.
		
	} // 메인 메소드가 끝이난다.
} // PointTest 클래스가 끝이난다.
