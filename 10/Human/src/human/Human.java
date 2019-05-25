package human;

public class Human {
	private String name;
	private int age;
	// private, protected, public 전부 사용 가능
	
	public Human(String name, int age) {
		this.name = name; // 입력받은 name을 필드 name에 저장.
						  // 필드 name임을 나타내기 위해 this 사용
		this.age = age;
		System.out.println("Human 생성자");
		// Human 생성자와 Student 생성자들이 어떤 순서로 호출되는지 알아보기 위한 문장
	}
	public String toString() {
		return "Human (\""+name+"\", "+age+"세)";
		// 객체의 현재 상태를 나타내는 문자열 반환
	}
	public String getName() {
		return name;
		// name 반환
	}
	public int getAge() {
		return age;
		// age 반환
	}
	public void setName(String a) {
		name = a;
		// name를 입력받은 a로 함.
	}
	public void setAge(int b) {
		age = b;
		// age를 입력받은 b로 함.
	}
	public String getProfession() {
		return "";
		// 아무것도 반환하지 않음.
	}
	
	public static void main(String args[]) {
		Human x1 = new Human("춘향", 18); // 객체를 생성하여 값 입력
		Human x2 = new Human("몽룡", 21);
		Human x3 = new Human("사또", 50);
		System.out.println(x1); // toString return값 출력
		System.out.println(x2);
		System.out.println(x3);
	}

}

