package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Magazine extends Book {
	// Book Ŭ�����κ��� ��ӹ��� Magazine Ŭ���� ����
	private String date; // ��¥�� ������ ���� ����
	
	public Magazine(String title, int page, String author) {
		// parameter�� 3���� ������
		super(title,page,author);
		// superclass ������
	}
	public String getDate() {
		// date ������
		return date; // date�� ��ȯ
	}
	public void setDate(String a) {
		// date ������
		date = a; // �Է¹��� a�� date�� ����
	}

} // Magazine Ŭ���� ��
