package textreverse;
import java.util.Scanner;

class Reverse{
	String text;
	int i;
	int s;
	char a;
	
	void rever(){
		s = text.length();
		for(i=s-1;i>=0;i--) {
			a = text.charAt(i);
			System.out.print(a);
		}

		
	}
	}

public class TextReverse {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Reverse x = new Reverse();
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		x.text = input.nextLine();
		System.out.print("�Է��� ���ڿ��� ���� : ");
		x.rever();
	}

}
