package sort;

public class Main {
	public static void main(String[] args) {

		SelectionSort sorter = new SelectionSort();

		//Sort by String
		String[] text = { "BC", "AD", "DE","AAA","DQ","CQQQQ" };
		sorter.sort(text, new StringComparator());
		for (String word : text)
			System.out.println(word);
		System.out.println("==========================");
		//Sort by Integer
		Integer[] number = { 8, 4, 6, 2, 9, 10, 1, 13 };
		sorter.sort(number, new IntegerComparator());
		for (Integer integer : number)
			System.out.println(integer);
		System.out.println("==========================");
		//Sort by Object
		Book book1 = new Book("Josh","Kingdom Heart");
		Book book2 = new Book("Anna","Twillight Meridean");
		Book book3 = new Book("Joey","Harry Potter");
		Book book4 = new Book("Colonel","Light horizontal");
		Book book5 = new Book("Chrona","Thai Study");
		Book book6 = new Book("Colonel","Kitchen house");
		Book[] books = {book1,book2,book3,book4,book5,book6};
		sorter.sort(books, new BookComparator());
		for (Book book : books) {
			System.out.println(book);
		}
		
	}
}
