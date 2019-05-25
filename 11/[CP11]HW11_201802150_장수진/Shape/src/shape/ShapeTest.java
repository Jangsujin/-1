package shape;

/********************************
 * 
 * ��ǻ�� ���α׷��� 1 (11) HW11
 * �й� : 201802150
 * �̸� : �� �� ��
 * 
 ********************************/

public class ShapeTest {
	// ShapeTest Ŭ���� ����
	private  static Shape arrayOfShape[];
	// Shape�� �迭 arrayOfShape[] ����
	public static void main(String args[]) {
		// ���� �޼ҵ� ����
		init();
		print();
		
	} // ���� �޼ҵ� ��
	
	public static void init() {
		// init �޼ҵ� ����
		arrayOfShape = new Shape[6]; // �迭�� ũ�� 6
		arrayOfShape[0] = new Ellipse(1,6,2,1);
		// 0��°�� Ellipse ��ü �����ϰ� �ʱⰪ�� �� �� ����
		arrayOfShape[1] = new Rectangle(6,8,5,10);
		// 1��°�� Rectangle ��ü �����ϰ� �ʱⰪ�� �� �� ����
		arrayOfShape[2] = new Triangle(3,4,5,10);
		// 2��°�� Triangle ��ü �����ϰ� �ʱⰪ�� �� �� ����
		arrayOfShape[3] = new Sphere(3,4,1,2);
		// 3��°�� Sphere ��ü �����ϰ� �ʱⰪ�� �� �� ����
		arrayOfShape[4] = new Cube(1,1,2,5,3,4);
		// 4��°�� Cube ��ü �����ϰ� �ʱⰪ�� �� �� ����
		arrayOfShape[5] = new Cylinder(6,2,3,1,1);
		// 5��°�� Cylinder ��ü �����ϰ� �ʱⰪ�� �� �� ����
		
	} // init �޼ҵ� ��
	
	public static void print() {
		// print �޼ҵ� ����
		for(int i = 0;i < arrayOfShape.length;i++) {
			// �迭�� ���̸�ŭ �ݺ�
			System.out.println(arrayOfShape[i]);
			// �迭�� i��°�� ����Ǿ� �ִ� ��ü�� toString() �޼ҵ� ���
			// (toString �޼ҵ�� ��ü.toString()���� �ʰ�, ��ü�� �ᵵ ����� �� �ִ�.)
		}
	} // print �޼ҵ� ��

} // ShapeTest Ŭ���� ��
