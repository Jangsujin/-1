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
		System.out.print("문자열을 입력하시오 : ");
		x.text = input.nextLine();
		System.out.print("입력한 문자열의 역순 : ");
		x.rever();
	}

}
