package minnum;

import java.util.Scanner;

public class MinNum {
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오 : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a>b) {
			x = (b>c) ? c : b;
		System.out.println("가장 작은 값은 "+x+"입니다.");
		}
		else if(a<b) {
			x = (a>c) ? c : a;
			System.out.println("가장 작은 값은 "+x+"입니다.");
		}
	
	
	}
}
