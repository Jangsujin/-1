package human;

public class Human {
	private String name;
	private int age;
	// private, protected, public ���� ��� ����
	
	public Human(String name, int age) {
		this.name = name; // �Է¹��� name�� �ʵ� name�� ����.
						  // �ʵ� name���� ��Ÿ���� ���� this ���
		this.age = age;
		System.out.println("Human ������");
		// Human �����ڿ� Student �����ڵ��� � ������ ȣ��Ǵ��� �˾ƺ��� ���� ����
	}
	public String toString() {
		return "Human (\""+name+"\", "+age+"��)";
		// ��ü�� ���� ���¸� ��Ÿ���� ���ڿ� ��ȯ
	}
	public String getName() {
		return name;
		// name ��ȯ
	}
	public int getAge() {
		return age;
		// age ��ȯ
	}
	public void setName(String a) {
		name = a;
		// name�� �Է¹��� a�� ��.
	}
	public void setAge(int b) {
		age = b;
		// age�� �Է¹��� b�� ��.
	}
	public String getProfession() {
		return "";
		// �ƹ��͵� ��ȯ���� ����.
	}
	
	public static void main(String args[]) {
		Human x1 = new Human("����", 18); // ��ü�� �����Ͽ� �� �Է�
		Human x2 = new Human("����", 21);
		Human x3 = new Human("���", 50);
		System.out.println(x1); // toString return�� ���
		System.out.println(x2);
		System.out.println(x3);
	}

}

