package circle;

class Circle {
	int r;
	int cx, cy;
	
	public double getArea() {
		return r*r*3.14;
	}
	public void setArea(int a) {
		r = a;
	}
	public int getR() {
		return r;
	}
	public int getCx() {
		return cx;
	}
	public void setCx(int b) {
		cx = b;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int c) {
		cy = c;
	}
}
public class CircleTest {
	public static void main(String args[]) {
		Circle x = new Circle();
		
		x.setArea(5);
		x.setCx(5);
		x.setCy(5);
		
		System.out.println("원의 반지름 : " + x.getR());
		System.out.println("원의 중심의 x좌표 : " + x.getCx());
		System.out.println("원의 중심의 y좌표 : " + x.getCy());
		System.out.println("원의 넓이 : "+x.getArea());
	}

}
