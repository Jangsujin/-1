package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class BookTest {
	// BookTest Ŭ���� ����
	public static void main(String args[]) {
		// ���� �޼ҵ� ����
		Book book1 = new Novel(1,"Novel1","author1");
		// Book Ŭ���� �������� book1���� Novel��ü�� �����ϸ� �ʱⰪ�� �ش�.
		Book book2 = new Poet(2,"Poet1","author2");
		// Book Ŭ���� �������� book2�� Poet��ü�� �����ϸ� �ʱⰪ�� �ش�.
		Book book3 = new ScienceFiction(3,"SF1","author3");
		// Book Ŭ���� �������� book3�� ScienceFiction��ü�� �����ϸ� �ʱⰪ�� �ش�.
		Book book4 = new ScienceFiction(3,"SF1","author3");
		// Book Ŭ���� �������� book4�� ScienceFiction��ü�� �����ϸ� �ʱⰪ�� �ش�.
		
		System.out.println("book1 : "+book1); // book1�� toString()�� ���
		System.out.println("book2 : "+book2); // book2�� toString()�� ���
		System.out.println("book3 : "+book3); // book3�� toString()�� ���
		System.out.println("book4 : "+book4); // book4�� toString()�� ���
		book1.getLateFees(4); // book1�� �޼ҵ忡 4�� �ʱⰪ���� �ش�. 
		book2.getLateFees(5); // book2�� �޼ҵ忡 5�� �ʱⰪ���� �ش�.
		book3.getLateFees(3); // book3�� �޼ҵ忡 3�� �ʱⰪ���� �ش�.
		System.out.print("book4 == book3 ? : ");
		if(book4.equals(book3)==true)
			// book4�� book3�� ������ȣ�� ���ٸ�
			System.out.println("true"); // true ���
		else System.out.println("false"); // �ƴϸ� false ���
		System.out.print("book4 == book1 ? : ");
		if(book4.equals(book1)==true)
			// book4�� book1�� ������ȣ�� ���ٸ�
			System.out.println("true"); // true ���
		else System.out.println("false"); // �ƴϸ� false ���
	} // ���� �޼ҵ� ��

} // BookTest Ŭ���� ��
