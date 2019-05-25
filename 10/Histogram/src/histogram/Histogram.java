package histogram;

import java.util.Scanner;

public class Histogram {
	public static void main(String args[]) {
		int[] in = new int[10];
		// 입력받은 정수를 저장할 크기 10의 배열을 선언
		int i;
		int x;
		int x1=0, x2=0, x3=0,x4=0,x5=0,x6=0,x7=0,x8=0,x9=0,x10=0;
		// 범위마다 포함되는 정수의 개수를 저장할 변수들을 각각 선언
		Scanner input = new Scanner(System.in);
		System.out.print("1~100 사이의 정수를 10개 입력하시오 : ");
		// 입력 안내문자
		for(i = 0; i<10;i++) {
			in[i] = input.nextInt();
			// 정수를 입력받고 배열 in[i]에 저장
			x = (in[i]-1)/10;
			// 입력받은 정수에서 1을 뺀 값을 10으로 나눠 수식을 간단히 함.
			if (x==0) // 입력받은 정수가 1~10이라면
				++x1; // x1의 값을 증가시킨다.
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
		// 늘린 x1의 횟수만큼 *을 출력한다.
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
