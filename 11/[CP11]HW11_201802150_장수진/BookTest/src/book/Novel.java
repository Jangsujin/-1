package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Novel extends Book {
	// Book Ŭ������ ��ӹ��� Novel Ŭ���� ����
	public Novel(int number, String title, String author) {
		// parameter�� 3���� Novel ������ ����
		super(number, title, author); // ����Ŭ���� ������
	} // Novel ������ ��
	
	@Override // ���������� ǥ��
	public void getLateFees(int x) {
		// parameter�� 1�� ������ getLateFees �޼ҵ� ����
		System.out.println("book1(Novel) "+x+"�� ��ü : "+x*300);
		// �Է¹��� x�� ��ü�Ϸ� �Ͽ� ��ü�Ḧ ����ϰ� ���
	} // getLateFees �޼ҵ� ��
	
	public String toString() {
		return "Novel "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}
	


} // Novel Ŭ���� ��
