package volume;

import java.util.Scanner;
public class Volume {
	public static void main(String args[]) {
		System.out.println("상자의 크기는 정수이며 100*100*100을 넘지 않는다.");
		Scanner input = new Scanner(System.in);
		byte l;
		byte w;
		byte h;
		int v;
		System.out.print("상자의 길이 : ");
		l = input.nextByte();
		System.out.print("상자의 너비 : ");
		w = input.nextByte();
		System.out.print("상자의 높이 : ");
		h = input.nextByte();
		v = l*w*h;
		System.out.print("상자의 부피 : " + v);
	}

}
