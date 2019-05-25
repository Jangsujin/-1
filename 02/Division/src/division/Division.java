package division;

import java.util.Scanner;

public class Division {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int x;
		int y;
		System.out.print("정수를 입력하시요 : ");
		num1 = input.nextInt();
		System.out.print("정수를 입력하시요 : ");
		num2 = input.nextInt();
		x = (num1>=num2) ? num1 : num2;
		y = (num1>=num2) ? num2 : num1;
		System.out.println(x + "을" + y + "으로 나눈 몫은" + x/y + "이고 나머지는" + x%y + "입니다.");
		
		
	}
	
	

}
