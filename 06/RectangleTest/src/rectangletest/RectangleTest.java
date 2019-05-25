package rectangletest;

import java.util.Scanner;

class Rectangle {
	int w;
	int h;
	int area;
	int perimeter;

	void print() {
		area = w*h;
		perimeter = 2*(w+h);
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + perimeter);
	}
}
public class RectangleTest {
	public static void main(String args[]) {
		Rectangle x = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("가로와 세로 값을 입력하시오 : ");
		x.w = input.nextInt();
		x.h = input.nextInt();
		x.print();
	}
}
