package shape;
import java.util.*;

interface Movable {
	void move(int dx, int dy);
}

class Shape implements Movable{
	protected int x, y;
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
}
class Rectangle extends Shape {
	public void move(int dx, int dy) {
		super.move(dx, dy);
		System.out.println("Rectangle move("+dx+","+dy+")");	
	}
}
class Triangle extends Shape {
	public void move(int dx, int dy) {
		super.move(dx, dy);
		System.out.println("Triangle move("+dx+","+dy+")");
	}
}
class Circle extends Shape {
	public void move(int dx, int dy) {
		super.move(dx, dy);
		System.out.println("Circle move("+dx+","+dy+")");
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String args[]) {
		init();
		moveAll();
	}
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
	}
	public static void moveAll() {
		Random r = new Random();
		
		for (int i = 0; i<arrayOfShapes.length; i++) {
			int x = r.nextInt(50);
			int y = r.nextInt(50);
			arrayOfShapes[i].move(x,y);
		}
	}

}
