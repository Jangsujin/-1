package student;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW10
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class StudentTest {
	// StudentTest Ŭ���� ����
	public static void main(String args[]) {
		// ���� �޼ҵ� ����
		Student s1 = new Student("s1", 201800000, "cse",4.0,130);
		// Student Ŭ������ �����ڷκ��� ��ü s1�� ����� �ʱ�ȭ
		UnderGraduate u1 = new UnderGraduate("u1",201801234,"cse",3.8,150);
		// UnderGraduate Ŭ������ �����ڷκ��� ��ü u1�� ����� �ʱ�ȭ
		u1.setClub("argos");
		// u1�� �����ڷ� club�� ���� �Ҵ�
		Graduate g1 = new Graduate("g1",201850000,"cse",4.3,90);
		// Graduate Ŭ������ �����ڷκ��� ��ü g1�� ����� �ʱ�ȭ
		g1.setType("ETA");
		// g1�� �����ڷ� type�� ���� �Ҵ�
		g1.setScholar(0.8);
		// g1�� �����ڷ� scholarship�� ���� �Ҵ�
		Graduate g2 = new Graduate("g2",201860000,"cse",4.2,60);
		// Graduate Ŭ������ �����ڷκ��� ��ü g2�� ����� �ʱ�ȭ
		g2.setType("LTA");
		// g2�� �����ڷ� type�� ���� �Ҵ�
		g2.setScholar(0.6);
		// g2�� �����ڷ� scholarship�� ���� �Ҵ�
		
		System.out.println("name : "+s1.getName());
		// s1�� name ���
		System.out.println("number : "+s1.getNumber());
		// s1�� number ���
		System.out.println("major : "+s1.getMajor());
		// s1�� major ���
		System.out.println("grade : "+s1.getGrade());
		// s1�� grade ���
		System.out.println("credit : "+s1.getCredit());
		// s1�� credit ���
		System.out.println("");
		System.out.println("name : "+u1.getName());
		// u1�� name ���
		System.out.println("number : "+u1.getNumber());
		// u1�� number ���
		System.out.println("major : "+u1.getMajor());
		// u1�� major ���
		System.out.println("grade : "+u1.getGrade());
		// u1�� grade ���
		System.out.println("credit : "+u1.getCredit());
		// u1�� credit ���
		System.out.println("club : " + u1.getClub());
		// u1�� club ���
		System.out.println("");
		System.out.println("name : "+g1.getName());
		// g1�� name ���
		System.out.println("number : "+g1.getNumber());
		// g1�� number ���
		System.out.println("major : "+g1.getMajor());
		// g1�� major ���
		System.out.println("grade : "+g1.getGrade());
		// g1�� grade ���
		System.out.println("credit : "+g1.getCredit());
		// g1�� credit ���
		System.out.println("type of ta : "+g1.getType());
		// g1�� type ���
		System.out.println("scholarship rate : "+g1.getScholar());
		// g1�� scholarship ���
		System.out.println("");
		System.out.println("name : "+g2.getName());
		// g2�� name ���
		System.out.println("number : "+g2.getNumber());
		// g2�� number ���
		System.out.println("major : "+g2.getMajor());
		// g2�� major ���
		System.out.println("grade : "+g2.getGrade());
		// g2�� grade ���
		System.out.println("credit : "+g2.getCredit());
		// g2�� credit ���
		System.out.println("type of ta : "+g2.getType());
		// g2�� type ���
		System.out.println("scholarship rate : "+g2.getScholar());
		// g2�� scholarship ���
		
	} // ���� �޼ҵ� ��

} // StudentTest Ŭ���� ��
