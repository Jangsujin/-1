package human;

public class Student extends Human {
	private String major;
	public Student(String name, int age, String major) {
		super(name, age); // 수퍼클래스 생성자
		this.major = major;
		System.out.println("Student 생성자");
	}
	public String toString() {
		return super.toString()+" Student (\""+major+"\")";
		// 수퍼 클래스 toString() 메소드 사용하면서 객체의 현재 상태를 나타내는 문자열 반환.
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getProfession() {
		return major;
		// getProfession() 메소드 재정의
	}
	
	public static void main(String args[]) {
		Student y1 = new Student("명진",21,"컴퓨터");
		Student y2 = new Student("미현",22,"경영");
		Student y3 = new Student("용준",24,"경제");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
	}

}
