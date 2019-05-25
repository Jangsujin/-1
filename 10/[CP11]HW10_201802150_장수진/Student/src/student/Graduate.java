package student;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Graduate extends Student {
	// Student Ŭ�����κ��� ��ӹ��� Graduate Ŭ���� ����
	private String type; // TA Ÿ���� ������ ���� ����
	private double scholarship; // ���б� ������ ������ ���� ����
	
	public Graduate(String name, int number, String major, double grade, int credit) {
		// parameter�� 5���� ������
		super(name, number, major, grade, credit); // superclass ������
	}
	
	public String getType() {
		// type ������
		return type; // type�� ��ȯ
	}
	public double getScholar() {
		// scholarship ������
		return scholarship; // scholarship�� ��ȯ
	}
	public void setType(String a) {
		// type ������
		type = a; // �Է¹��� a�� type�� ����
	}
	public void setScholar(double b) {
		// scholarship ������
		scholarship = b; // �Է¹��� scholarship�� ����
	}

} // Graduate Ŭ���� ��
