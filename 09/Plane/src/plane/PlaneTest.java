package plane;

public class PlaneTest {
	public static void main(String args[]) {
		Plane x = new Plane();
		Plane y = new Plane("AIRBUS", "A380", 555);
		Plane z = new Plane("BOEING", "B787", 250);
		
		System.out.println("p1 : " +x.getPro()+" "+x.getModel()+" "+x.getMax());
		System.out.println("p2 : "+y.getPro()+" "+y.getModel()+" "+y.getMax());
		y.setPro("AIRBUS");
		y.setModel("A330");
		y.setMax(296);
		System.out.println("p2 : "+y.getPro()+" "+y.getModel()+" "+y.getMax());
		System.out.println("p3 : "+z.getPro()+" "+z.getModel()+" "+z.getMax());
		int c = Plane.getPlanes();
		System.out.println("积己等 厚青扁 荐 : "+c);
	}

}
