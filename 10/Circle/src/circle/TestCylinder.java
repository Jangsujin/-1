package circle;

public class TestCylinder {
	public static void main(String args[]) {
		Cylinder obj1 = new Cylinder();
		// parameter�� ���� �����ڷ� ��ü ����
		Cylinder obj2 = new Cylinder(5.0,3.0);
		// parameter�� 2���� �����ڷ� ��ü ����
		
		System.out.println("obj1�� �ظ��� ������ : "+obj1.getRadius()+", �ظ��� ���� : "+obj1.getArea()+", ���� : "+obj1.getHeight()+", ���� : "+obj1.getVolume());
		// obj1�� �Ӽ��� �����ڸ� ���� ���
		System.out.println("obj2�� �ظ��� ������ : "+obj2.getRadius()+", �ظ��� ���� : "+obj2.getArea()+", ���� : "+obj2.getHeight()+", ���� : "+obj2.getVolume());
		// obj2�� �Ӽ��� �����ڸ� ���� ���

	}

}
