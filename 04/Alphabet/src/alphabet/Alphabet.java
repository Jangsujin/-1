package alphabet;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]) {
		String alpha;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �ϳ��� �Է��Ͻÿ� : ");
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
			System.out.println("�����Դϴ�.");
			break;
			default:
				System.out.println("�����Դϴ�.");
			
		}
	}

}
