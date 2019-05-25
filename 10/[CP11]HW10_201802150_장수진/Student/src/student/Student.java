package student;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Student {
	// Student Ŭ���� ����
	private String name; // �̸��� ������ ���� ����
	private int number; // �й��� ������ ���� ����
	private String major; // �Ҽ��а��� ������ ���� ����
	private double grade; // ������ ������ ���� ����
	private int credit; // �̼� ������ ������ ���� ����
	
	public Student(String name, int number, String major, double grade, int credit) {
		// parameter�� 5���� ������
		this.name = name; // �Է¹��� name�� �ʵ� name�� ����
		this.number = number; // �Է¹��� number�� �ʵ� number�� ����
		this.major = major; // �Է¹��� major�� �ʵ� major�� ����
		this.grade = grade; // �Է¹��� grade�� �ʵ� grade�� ����
		this.credit = credit; // �Է¹��� credit�� �ʵ� credit�� ����
	} // ������ ���� ��
	
	public String getName() {
		// name ������
		return name; // name�� ��ȯ
	}
	public int getNumber() {
		// number ������
		return number; // number�� ��ȯ
	}
	public String getMajor() {
		// major ������
		return major; // major�� ��ȯ
	}
	public double getGrade() {
		// grade ������
		return grade; // grade�� ��ȯ
	}
	public int getCredit() {
		// credit ������
		return credit; // credit�� ��ȯ
	}
} // Student Ŭ���� ��
