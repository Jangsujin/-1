package book;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class BookTest {
	// BookTest Ŭ���� ����
	public static void main(String args[]) {
		// ���� �޼ҵ� ����
		Book b1 = new Book("b0", 100, "author0");
		// Book Ŭ������ �����ڷκ��� ��ü b1�� ����� �ʱ�ȭ
		Magazine m1 = new Magazine("m1", 200, "author1");
		// Magazine Ŭ������ �����ڷκ��� ��ü m1�� ����� �ʱ�ȭ
		Magazine m2 = new Magazine("m2", 333, "author2");
		// Magazine Ŭ������ �����ڷκ��� m2�� ����� �ʱ�ȭ
		
		System.out.println("title : " + b1.getTitle());
		// b1�� title ���
		System.out.println("page : "+b1.getPage());
		// b1�� page ���
		System.out.println("author : "+b1.getAuthor());
		// b1�� author ���
		System.out.println("");
		m1.setDate("2018.05.22");
		// m1�� �����ڷ� date ���� �Ҵ��Ѵ�.
		System.out.println("title : " + m1.getTitle());
		// m1�� title ���
		System.out.println("page : "+m1.getPage());
		// m1�� page ���
		System.out.println("author : "+m1.getAuthor());
		// m1�� author ���
		System.out.println("date : "+m1.getDate());
		// m1�� date ���
		System.out.println("");
		m2.setDate("2018.05.29");
		// m2�� �����ڷ� date ���� �Ҵ��Ѵ�.
		System.out.println("title : " + m2.getTitle());
		// m2�� title ���
		System.out.println("page : "+m2.getPage());
		// m2�� page ���
		System.out.println("author : "+m2.getAuthor());
		// m2�� author ���
		System.out.println("date : "+m2.getDate());
		// m2�� date ���
		
	}

}
