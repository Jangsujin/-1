package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Book {
	// Book Ŭ���� ����
	private String title; // ������ ������ ���� ����
	private String author; // ���ڸ� ������ ���� ����
	private int page; // ������ ���� ������ ���� ����
	
	public Book(String title, int page, String author) {
		// parameter�� 3���� ������
		this.title = title; // �Է¹��� title�� �ʵ� title�� ����
		this.page = page; // �Է¹��� page�� �ʵ� page�� ����
		this.author = author; // �Է¹��� author�� �ʵ� author�� ����
		
	} // ������ ���� ��
	
	public String getTitle() {
		// title ������
		return title; // title�� ��ȯ
	}
	public String getAuthor() {
		// author ������
		return author; // author�� ��ȯ
	}
	public int getPage() {
		// page ������
		return page; // page�� ��ȯ
	}
	public void setTitle(String a) {
		// title ������
		title = a; // �Է¹��� a�� title�� ����
	}
	public void setAuthor(String b) {
		// author ������
		author = b; // �Է¹��� b�� author�� ����
	}
	public void setPage(int c) {
		// page ������
		page = c; // �Է¹��� c�� page�� ����
	}

} // Book Ŭ���� ��
