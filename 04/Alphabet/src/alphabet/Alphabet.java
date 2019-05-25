package alphabet;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]) {
		String alpha;
		Scanner input = new Scanner(System.in);
		System.out.print("영문자 하나를 입력하시오 : ");
		alpha = input.next();
		
		switch(alpha) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("모음입니다.");
			break;
			default:
				System.out.println("자음입니다.");
			
		}
	}

}
