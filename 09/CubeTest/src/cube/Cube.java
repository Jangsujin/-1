package cube;

public class Cube {
	private double side;
	public double getSide() {
		return side;
	}
	public double getVolume() {
		return side*side*side;
	}
	public Cube() {
		side = 0;
		System.out.println("ù ��° ������(side = "+side+") : volume = "+getVolume());
	}
	public Cube(double c) {
		side = c;
		System.out.println("�� ��° ������(side = "+side+") : volume = "+getVolume());
	}

}