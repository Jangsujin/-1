package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Book {
	// Book Ŭ���� ����
	int number; // ������ȣ�� ������ ���� ����
	String title; // ������ ������ ���� ����
	String author; // ���ڸ� ������ ���� ����
	
	public Book(int number, String title, String author) {
		// parameter�� 3���� Book ������ ����
		this.number = number; // �Է¹��� number�� �ʵ� number�� ����
		this.title = title; // �Է¹��� title�� �ʵ� title�� ����
		this.author = author; // �Է¹��� author�� �ʵ� author�� ����
		
	} // Book ������ ��
	
	public int getNumber() {
		// number ������
		return number; // number ��ȯ
	}
	public void setNumber(int a) {
		// number ������
		number = a; // �Է¹��� a�� number�� ����
	}
	public String getTitle() {
		// title ������
		return title; // title ��ȯ
	}
	public void setTitle(String b) {
		// title ������
		title = b; // �Է¹��� b�� title�� ����
	}
	public String getAuthor() {
		// author ������
		return author; // author ��ȯ
	}
	public void setAuthor(String c) {
		// author ������
		author = c; // �Է¹��� c�� author�� ����
	}
	
	@Override // ���������� ǥ�� (Object Ŭ������ �� ������)
	public boolean equals(Object obj) {
		// equals �޼ҵ� ����
		Book other = (Book) obj;
		// obj�� ����ȯ�Ͽ� Book ���������� �ٲ۴�.
		if (number == other.number)
			// �� ���� ��ü�� number�� ���ٸ�
			return true; // true�� ��ȯ
		else return false; // �ƴϸ� false�� ��ȯ
	} // equals �޼ҵ� ��
	
	public void getLateFees(int x) {
		// parameter�� 1�� ������ getLateFees �޼ҵ� ����
		System.out.println(""); // �ƹ��͵� ������� �ʴ´�.(�������� ��)
	} // getLateFees �޼ҵ� ��
	
	public String toString() {
		return "[number="+getNumber()+", title="+getTitle()+", author="+getAuthor()+"]";
		// ��ü�� ���� ���¸� ��Ÿ���� ���ڿ� ��ȯ
	}

} // Book Ŭ���� ��
