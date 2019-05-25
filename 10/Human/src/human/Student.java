package human;

public class Student extends Human {
	private String major;
	public Student(String name, int age, String major) {
		super(name, age); // ����Ŭ���� ������
		this.major = major;
		System.out.println("Student ������");
	}
	public String toString() {
		return super.toString()+" Student (\""+major+"\")";
		// ���� Ŭ���� toString() �޼ҵ� ����ϸ鼭 ��ü�� ���� ���¸� ��Ÿ���� ���ڿ� ��ȯ.
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getProfession() {
		return major;
		// getProfession() �޼ҵ� ������
	}
	
	public static void main(String args[]) {
		Student y1 = new Student("����",21,"��ǻ��");
		Student y2 = new Student("����",22,"�濵");
		Student y3 = new Student("����",24,"����");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
	}

}
