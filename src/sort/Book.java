package sort;

public class Book {
	private String publisher;
	private String nameOfBook;

	public Book(String publisher, String nameOfBook) {
		this.publisher = publisher;
		this.nameOfBook = nameOfBook;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public String getNameOfBook() {
		return nameOfBook;
	}
	
	public String toString() {
		return publisher + ", " + nameOfBook ;
	}
}