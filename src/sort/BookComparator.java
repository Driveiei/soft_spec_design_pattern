package sort;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if(book1.getPublisher().length() < book2.getPublisher().length()) {
			return -1;
		} else if (book1.getPublisher().length() > book2.getPublisher().length()) {
			return 1;
		} else return book1.getNameOfBook().compareTo(book2.getNameOfBook());
	}

}
