package employee;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW07
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

// Employee Ŭ������ �����Ѵ�.
class Employee {
	String name; // name ������ �����Ѵ�.
	String num; // num ������ �����Ѵ�.
	int salary; // salary ������ �����Ѵ�.
	
	// ������ �޼ҵ� getName�� �����Ѵ�.
	public String getName() {
		return name; // name�� ��ȯ�Ѵ�.
	}
	// �޼ҵ� getName�� ���̳���.
	// ������ �޼ҵ� setName�� �����Ѵ�.
	public void setName(String na) {
		name = na; // name�� na�� �Ѵ�.
	}
	// �޼ҵ� setName�� ���̳���.
	// ������ �޼ҵ� getNum�� �����Ѵ�.
	public String getNum() {
		return num; // num�� ��ȯ�Ѵ�.
	}
	// �޼ҵ� getNum�� ���̳���.
	// ������ �޼ҵ� setNum�� �����Ѵ�.
	public void setNum(String n) {
		num = n; // num�� n�����Ѵ�.
	}
	// �޼ҵ� setNum�� ���̳���.
	// ������ �޼ҵ� getSalary�� �����Ѵ�.
	public int getSalary() {
		return salary; // salary�� ��ȯ�Ѵ�.
	}
	// �޼ҵ� getSalary�� ���̳���.
	// ������ �޼ҵ� setSalary�� �����Ѵ�.
	public void setSalary(int s) {
		salary = s; // salary�� s�� �Ѵ�.
	}
	// �޼ҵ� setSalary�� ���̳���.
} // Ŭ���� Employee�� ���̳���.

public class EmployeeTest {
	// ���� �޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
		Employee x = new Employee(); // Employee Ŭ�����κ��� ��ü x�� �����Ѵ�.
		x.setName("ȫ�浿"); // name ���� �Ҵ��Ѵ�.
		x.setNum("010-1111-1111"); // num ���� �Ҵ��Ѵ�.
		x.setSalary(3000); // salary ���� �Ҵ��Ѵ�.
		
		System.out.println("���� �̸� : "+x.getName()); // �̸��� ����Ѵ�.
 		System.out.println("��ȭ ��ȣ : "+x.getNum()); // ��ȭ��ȣ�� ����Ѵ�.
		System.out.println("���� : "+x.getSalary()); // ������ ����Ѵ�.
	
	} // ���� �޼ҵ尡 ���̳���.

} // EmployeeTest Ŭ������ ���̳���.
