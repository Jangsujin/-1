package movie;

// Movie Ŭ���� ����
public class Movie {
	String title; // ���� ���� ����
	String direc; // ���� ���� ����
	String pro; // ���ۻ� ���� ����
	
	// parameter���� ������
	public Movie() {
		title = "The Holiday"; // ���� ������ �� ����
		direc = "Nancy Meyers"; // ���� ������ �� ����
		pro = "Columbia Pictures"; // ���ۻ� ������ �� ����
		System.out.println("m1(no parameter) : "+title+" / "+direc+" / "+pro); // ���
	}
	// parameter���� ������ ��
	// parameter�� 3���� ������
	public Movie (String a, String b, String c) {
		title = a; // �Է¹��� a�� ���� ������ ����
		direc = b; // �Է¹��� b�� ���� ������ ����
		pro = c; // �Է¹��� c�� ���ۻ� ������ ����
		System.out.println("m2(3 parameters) : "+title+" / "+direc+" / "+pro); // ���
	}
	// parameter�� 3���� ������ ��

} // Movie Ŭ���� ��
