package student;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class UnderGraduate extends Student {
	// Student�� ���� ��ӹ��� UnderGraduate Ŭ���� ����
	private String club; // ���Ƹ��� ������ ���� ����
	
	public UnderGraduate(String name, int number, String major, double grade, int credit) {
		// parameter�� 5���� ������
		super(name,number,major,grade,credit); // superclass ������
	} // ������ ���� ��
	
	public String getClub() {
		// club ������
		return club; // club�� ��ȯ
	}
	public void setClub(String a) {
		// club ������
		club = a; // �Է¹��� a�� club�� ����
	}
	
} // UnderGraduate Ŭ���� ��
