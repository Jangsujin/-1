package person;

interface Comparable{
	int compareTo(Object other);
}

public class Person implements Comparable {
	String name;
	double height;
	private static Person[] array;
	
	public Person(String name, double height){
		this.name = name;
		this.height = height;
	}
	
	public static void main(String args[]) {
		getMaximum();
		
	}
	public int compareTo(Object otherobject){
		Person other = (Person) otherobject;
		if (this.height > other.height) return 1;
		else if (this.height < other.height) return -1;
		else return 0;
	}
	
	public static void getMaximum() {
		String y = null;
		double z=0;
		array = new Person[5];
		array[0] = new Person("p1", 156.0);
		array[1] = new Person("p2", 162.0);
		array[2] = new Person("p3", 178.0);
		array[3] = new Person("p4", 183.0);
		array[4] = new Person("p5", 166.0);
		
		for(int i = 0; i<array.length-1;i++) {
			if(array[i].compareTo(array[i+1])>0) {
				Person temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
				/*
				y = array[i+1].name;
				array[i+1].name = array[i].name;
				array[i].name = y;
				z = array[i+1].height;
				array[i+1].height = array[i].height;
				array[i].height = z;
				 */
			}
			else
				continue;
		}
		System.out.println("name = "+array[4].name+", height = "+array[4].height);
		
	}
	

}
