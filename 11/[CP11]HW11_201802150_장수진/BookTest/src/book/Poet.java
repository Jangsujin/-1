package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class Poet extends Book {
	// Book Ŭ������ ��ӹ��� Poet Ŭ���� ����
	public Poet(int number, String title, String author) {
		// parameter�� 3���� Poet ������ ����
		super(number,title,author); // ����Ŭ���� ������
	} // Poet ������ ��
	
	@Override // ���������� ǥ��
	public void getLateFees(int x) {
		// parameter�� 1�� ������ getLateFees �޼ҵ� ����
		System.out.println("book2(Poet)  "+x+"�� ��ü : "+x*200);
		// �Է¹��� x�� ��ü�Ϸ� �Ͽ� ��ü�Ḧ ����ϰ� ���
	} // getLateFees �޼ҵ� ��
	
	public String toString() {
		return "Poet  "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // Poet Ŭ���� ��
