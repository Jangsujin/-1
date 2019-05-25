package plane;

public class Plane {
	private String pro;
	private String model;
	private int max;
	private static int planes = 0;
	
	public String getPro() {
		return pro;
	}
	public void setPro(String a) {
		pro = a;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String b) {
		model = b;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int c) {
		max = c;
	}
	
	public Plane() {
		pro = "AIRBUS";
		model = "A380";
		max = 555;
		++planes;
	}
	public Plane(String a, String b, int c) {
		pro = a;
		model = b;
		max = c;
		++planes;
	}
	public static int getPlanes() {
		return planes;
	}
}
