package moneybox;

import java.util.Scanner;
public class MoneyBox {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int sum;
		System.out.print("500원 짜리 동전의 개수 : ");
		a = input.nextInt();
		System.out.print("100원 짜리 동전의 개수 : ");
		b = input.nextInt();
		System.out.print("50원 짜리 동전의 개수 : ");
		c = input.nextInt();
		System.out.print("10원 짜리 동전의 개수 : ");
		d = input.nextInt();
		sum = 500*a + 100*b + 50*c + 10*d;
		System.out.print("돈의 액수 : " + sum + "원");
		
	}

}
