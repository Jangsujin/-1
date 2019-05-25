package book;

class Book {
	private String title;
	private String author;
	
	public String getX(){
		return title;
	}
	public void setX(String c ){
		title = c;
	}
	public String getY() {
		return author;
	}
	public void setY(String b) {
		author = b;
	}
	
		
	}

public class BookTest {
	public static void main(String args[]) {
		Book x = new Book();
		x.setX("Power Java");
		x.setY("Cheon");
		System.out.println("Title : "+ x.getX());
		System.out.println("Author : "+ x.getY());
	}

}
