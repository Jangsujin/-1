package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class ScienceFiction extends Book {
	// Book Ŭ������ ��ӹ��� ScienceFiction Ŭ���� ����
	public ScienceFiction(int number, String title, String author) {
		// parameter�� 3���� ScienceFiction ������ ����
		super(number, title, author); // ����Ŭ���� ������
	} // ScienceFiction ������ ��
	
	@Override // ���������� ǥ��
	public void getLateFees(int x) {
		// parameter�� 1�� ������ getLateFees �޼ҵ� ����
		System.out.println("book3(SF)    "+x+"�� ��ü : "+x*600);
		// �Է¹��� x�� ��ü�Ϸ� �Ͽ� ��ü�Ḧ ����ϰ� ���
	} // getLateFees �޼ҵ� ��
	
	public String toString() {
		return "SF    "+super.toString();
		// ����Ŭ������ toString()�޼ҵ带 �̿��Ͽ� ���
	}

} // ScienceFiction Ŭ���� ��
