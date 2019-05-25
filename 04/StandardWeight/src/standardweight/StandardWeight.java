package standardweight;

import java.util.Scanner;

public class StandardWeight {
	public static void main(String args[]) {
		int hei;
		int wei;
		double stan;
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		hei = input.nextInt();
		System.out.print("체중을 입력하시오 : ");
		wei = input.nextInt();
		stan = (hei-100)*0.9;
		if(wei>stan) 
		System.out.println("과체중입니다.");
		else if(wei==stan)
			System.out.println("표준체중입니다.");
		else if(wei<stan)
			System.out.println("저체중입니다.");
		
	}

}
