package mile2kilometer;
/**
 * 
 * ��ǻ�����α׷��� 1 (11) HM01
 * �й� : 201802150
 * �̸� : �� �� �� 
 *
 */
import java.util.Scanner; //Scanner Ŭ������ �����Ѵ�.
public class Mile2Kilometer {
	//���� �޼ҵ忡������ ������ ���۵ȴ�.
	public static void main(String args[]) {
		
		double mile; //���� �� ������ ���� ������ �����Ѵ�.
		double kilo; //ų�ι��ͷ� ����� ���� �����ϱ� ���� ������ �����Ѵ�.
		
		Scanner input = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� Scanner�� �����Ѵ�.
		System.out.print("������ �Է��Ͻÿ� : "); //�Է� �ȳ��� ����Ѵ�.
		mile = input.nextDouble(); //���� ���� �Է¹޴´�.
		kilo = mile * 1.609; //�Է¹��� ���� ���� ų�ι��ͷ� �ٲٱ� ���� ����ϰ�, �̸� kilo ������ �����Ѵ�.
		System.out.println(mile + " ������ " + kilo + " ų�ι����Դϴ�."); //���� ���� ų�ι��� ���� ����Ѵ�.
	} //���� �޼ҵ尡 ���̳���.
} //Mile2Kilometer Ŭ������ ���̳���.
