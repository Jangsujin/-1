package volume;

import java.util.Scanner;
public class Volume {
	public static void main(String args[]) {
		System.out.println("������ ũ��� �����̸� 100*100*100�� ���� �ʴ´�.");
		Scanner input = new Scanner(System.in);
		byte l;
		byte w;
		byte h;
		int v;
		System.out.print("������ ���� : ");
		l = input.nextByte();
		System.out.print("������ �ʺ� : ");
		w = input.nextByte();
		System.out.print("������ ���� : ");
		h = input.nextByte();
		v = l*w*h;
		System.out.print("������ ���� : " + v);
	}

}
