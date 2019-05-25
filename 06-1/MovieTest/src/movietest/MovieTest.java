package movietest;

class Movie{
	String title;
	double rating;
	String director;
	int year;
	
	void print() {
		System.out.println("영화 제목 : "+title);
		System.out.println("평점 : " + rating);
		System.out.println("감독 : " + director);
		System.out.println("발표 연도 : " + year);
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
