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
		System.out.println("�簢���� ���� : " + area);
		System.out.println("�簢���� �ѷ� : " + perimeter);
	}
}
public class RectangleTest {
	public static void main(String args[]) {
		Rectangle x = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("���ο� ���� ���� �Է��Ͻÿ� : ");
		x.w = input.nextInt();
		x.h = input.nextInt();
		x.print();
	}
}
