package movietest;

class Movie{
	String title;
	double rating;
	String director;
	int year;
	
	void print() {
		System.out.println("��ȭ ���� : "+title);
		System.out.println("���� : " + rating);
		System.out.println("���� : " + director);
		System.out.println("��ǥ ���� : " + year);
	}
}

public class MovieTest {
	public static void main(String args[]) {
		Movie x = new Movie();
		x.title = "The Holiday";
		x.rating = 8.64;
		x.director = "Nancy Meyers";
		x.year = 2006;		
		x.print();
	}

}
