package histogram;

import java.util.Scanner;

public class Histogram {
	public static void main(String args[]) {
		int[] in = new int[10];
		// �Է¹��� ������ ������ ũ�� 10�� �迭�� ����
		int i;
		int x;
		int x1=0, x2=0, x3=0,x4=0,x5=0,x6=0,x7=0,x8=0,x9=0,x10=0;
		// �������� ���ԵǴ� ������ ������ ������ �������� ���� ����
		Scanner input = new Scanner(System.in);
		System.out.print("1~100 ������ ������ 10�� �Է��Ͻÿ� : ");
		// �Է� �ȳ�����
		for(i = 0; i<10;i++) {
			in[i] = input.nextInt();
			// ������ �Է¹ް� �迭 in[i]�� ����
			x = (in[i]-1)/10;
			// �Է¹��� �������� 1�� �� ���� 10���� ���� ������ ������ ��.
			if (x==0) // �Է¹��� ������ 1~10�̶��
				++x1; // x1�� ���� ������Ų��.
			else if (x==1)
				++x2;
			else if (x==2)
				++x3;
			else if (x==3)
				++x4;
			else if (x==4)
				++x5;
			else if (x==5)
				++x6;
			else if (x==6)
				++x7;
			else if (x==7)
				++x8;
			else if (x==8)
				++x9;
			else if (x==9)
				++x10;
			else
				break;
		
		}	
		System.out.print(" 1 -  10 : ");
		for(int y=1;y<=x1;y++) {
			System.out.print("*");
		}
		// �ø� x1�� Ƚ����ŭ *�� ����Ѵ�.
		System.out.println("");
		System.out.print("11 -  20 : ");
		for(int y=1;y<=x2;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("21 -  30 : ");
		for(int y=1;y<=x3;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("31 -  40 : ");
		for(int y=1;y<=x4;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("41 -  50 : ");
		for(int y=1;y<=x5;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("51 -  60 : ");
		for(int y=1;y<=x6;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("61 -  70 : ");
		for(int y=1;y<=x7;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("71 -  80 : ");
		for(int y=1;y<=x8;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("81 -  90 : ");
		for(int y=1;y<=x9;y++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("91 - 100 : ");
		for(int y=1;y<=x10;y++) {
			System.out.print("*");
		}
		System.out.println("");
	}

}
