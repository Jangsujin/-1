package complexnumtest;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW06
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

import java.util.Scanner; // Scanner Ŭ������ �����Ѵ�.

// ComplexNum Ŭ������ �����.
class ComplexNum{ 
	double real; // �Ǽ� ���� ������ ���� real�� �����Ѵ�.
	double imag; // ��� ���� ������ ���� imag�� �����Ѵ�.
	
	// add �޼ҵ带 �����Ѵ�.
	void add(ComplexNum C){
		System.out.print("���Ҽ� 1 + ���Ҽ� 2 = "); // ���Ҽ�1�� ���Ҽ�2�� ���� ���� ����Ѵ�.
		System.out.print(real+C.real+" + "); // �Ǽ� �κ��� ����Ѵ�.
		System.out.println(imag+C.imag+"i"); // ��� �κ��� ����Ѵ�.
		
	} // add �޼ҵ尡 ���̳���.
	// sub �޼ҵ带 �����Ѵ�.
	void sub(ComplexNum C) {
		System.out.print("���Ҽ� 1 - ���Ҽ� 2 = "); // ���Ҽ�1�� ���Ҽ�2�� �� ���� ����Ѵ�.
		System.out.print(real-C.real+" + "); // �Ǽ� �κ��� ����Ѵ�.
		System.out.println(imag-C.imag+"i"); // ��� �κ��� ����Ѵ�.
	} // sub �޼ҵ尡 ���̳���.
	// mul �޼ҵ带 �����Ѵ�.
	void mul(ComplexNum C) {
		System.out.print("���Ҽ� 1 * ���Ҽ� 2 = "); // ���Ҽ�1�� ���Ҽ�2�� ���� ���� ����Ѵ�.
		System.out.print(real*C.real-imag*C.imag+" + "); // �Ǽ� �κ��� ����Ѵ�.
		System.out.println(real*C.imag+C.real*imag+"i"); // ��� �κ��� ����Ѵ�.
	} // mul �޼ҵ尡 ���̳���.
	// div �޼ҵ带 �����Ѵ�.
	void div(ComplexNum C) {
		if(C.real==0&&C.imag==0) // ���� ���Ҽ�2�� �Ǽ��κа� ����κ��� 0�̶��
			System.out.println("���Ҽ� 2�� 0�̹Ƿ� �������� ������ �� �����ϴ�."); // �� ������ ����Ѵ�.
		else { // ���� ���� ������ �������� ���Ѵٸ�
			System.out.print("���Ҽ� 1 / ���Ҽ� 2 = "); // ���Ҽ�1�� ���Ҽ�2�� ���� ���� ����Ѵ�.
			System.out.print((real*C.real+imag*C.imag)/(C.real*C.real+C.imag*C.imag)+" + "); // �Ǽ� �κ��� ����Ѵ�.
			System.out.println((imag*C.real-real*C.imag)/(C.real*C.real+C.imag*C.imag)+"i"); // ��� �κ��� ����Ѵ�.
		}
		
		
	} // div �޼ҵ尡 ���̳���.

} //ComplexNum Ŭ������ ���̳���.


public class ComplexNumTest {
	// ���� �޼ҵ带 �����Ѵ�.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // ����ڷκ��� ���� �Է¹��� �� �ֵ��� ��ĳ�ʸ� �����Ѵ�.
		ComplexNum x = new ComplexNum(); // ComplexNum���κ��� ��ü x�� �����.
		ComplexNum y = new ComplexNum(); // ComplexNum���κ��� ��ü y�� �����.
		
		System.out.print("���Ҽ� 1�� �Ǽ����� ������� �Է��Ͻÿ� : "); // ���Ҽ�1�� �Ǽ����� ������� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		x.real = input.nextDouble(); // ��ü x�� �Ǽ��κ��� �Է¹޴´�.
		x.imag = input.nextDouble(); // ��ü x�� ����κ��� �Է¹޴´�.
		System.out.println(""); // �ٹٲ��� �Ѵ�.
		System.out.print("���Ҽ� 2�� �Ǽ����� ������� �Է��Ͻÿ� : "); // ���Ҽ�2�� �Ǽ����� ������� �Է¹ޱ� ���� �ȳ����ڸ� ����Ѵ�.
		y.real = input.nextDouble(); // ��ü y�� �Ǽ��κ��� �Է¹޴´�.
		y.imag = input.nextDouble(); // ��ü y�� ����κ��� �Է¹޴´�.
		System.out.println("���Ҽ� 1 : "+x.real+" + "+x.imag+"i"); // ���Ҽ�1�� �˷��ش�.
		System.out.println("���Ҽ� 2 : "+y.real+" + "+y.imag+"i"); // ���Ҽ�2�� �˷��ش�.
		
		x.add(y); // ComplexNum Ŭ������ add�޼ҵ带 �����Ѵ�. (ComplexNum Ÿ���� y�� C��� ����Ѵ�.)
		x.sub(y); // ComplexNum Ŭ������ sub�޼ҵ带 �����Ѵ�.
		x.mul(y); // ComplexNum Ŭ������ mul�޼ҵ带 �����Ѵ�.
		x.div(y); // ComplexNum Ŭ������ div�޼ҵ带 �����Ѵ�.
		
	} // ���� �޼ҵ尡 ���̳���.

} // ComplexNumTest class�� ���̳���.
