package charcount;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW06
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

import java.util.Scanner; // Scanner Ŭ������ �����Ѵ�.

// charcount Ŭ������ �����.
class charcount{
	String str; // ���ڿ��� ������ ���� str�� �����Ѵ�.
	int con=0; // ������ ������ ������ ���� con�� �����Ѵ�.
	int vo=0; // ������ ������ ������ ���� vo�� �����Ѵ�.
	int in; // for���� ����� ���� in�� �����Ѵ�.
	int s; // ���ڿ��� ������ ������ ���� s�� �����Ѵ�.
	String y; // ��� ���ڸ� �ҹ��ڷ� ���� ���ڿ��� ������ ���� y�� �����Ѵ�. 
	
	// consonant �޼ҵ带 �����Ѵ�.
	void consonant(){
		s = str.length(); // str�� ���̸� s�� �����Ѵ�.
		y = str.toLowerCase(); // str�� ��� ���ڸ� �ҹ��ڷ� �ٲ㼭 y�� �����Ѵ�.

		// in�� �ʱⰪ�� 0���� �����ϰ�, in�� ���ڿ��� ���̺��� ���� ������ �ݺ��ϴ� for���� �����Ѵ�.
		for(in=0;in<s;in++) {
			switch(y.charAt(in)) {
			// y�� in��° ���ڰ� ������ ���
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vo++; // ������ ������ 1�� ������Ų��.
				break;
			// y�� in��° ���ڰ� ������ ���
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				con++; // ������ ������ 1�� ������Ų��.
				break;
			default:
			// ������ ������ �ƴ� ��� �׳� ������.	
				break;			
			}	
		}
		System.out.println("���� : "+con+"��"); // ������ ������ ����Ѵ�.
		System.out.println("���� : "+vo+"��"); // ������ ������ ����Ѵ�.
	} // consonant �޼ҵ尡 ���̳���.		
} // charcount Ŭ������ ���̳���.

public class CharCountTest {
	// ���θ޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
		charcount x = new charcount(); // charcount�κ��� ��ü x�� �����.
		Scanner input = new Scanner(System.in); // ����ڷκ��� ���� �Է¹ޱ� ���ؼ� ��ĳ�ʸ� �����Ѵ�.
		System.out.print("���ڿ� : "); // ���ڿ��� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		x.str = input.nextLine(); // ���ڿ��� �Է¹޴´�. (���ڿ��̱� ������ nextLine()�� ����.)
				
		x.consonant(); // charcount Ŭ������ consonant �޼ҵ带 �����Ѵ�.
	} // ���θ޼ҵ尡 ���̳���.
} // CharCountTest class�� ���̳���.
