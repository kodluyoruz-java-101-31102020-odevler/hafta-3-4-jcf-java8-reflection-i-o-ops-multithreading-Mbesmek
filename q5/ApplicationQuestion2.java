package q5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import q2.Book;

public class ApplicationQuestion2 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Suç ve Ceza", "A", 2000, 800, 45));
		books.add(new Book("Dönüşüm", "B", 2010, 250, 45.5));
		books.add(new Book("Sefiller", "C", 2016, 5000, 30));
		books.add(new Book("Sherlock Holmes", "D", 2020, 250, 20));
		books.add(new Book("Geleceği Keşfedenler", "E", 2020, 440, 50));
		books.add(new Book("Java Book", "Penguen Yayınevi", 2019, 500, 50));
		books.add(new Book("Python Book", "Panda Yayınevi", 2019, 250, 45.5));
		books.add(new Book("C# Book", "Elma Yayınevi", 2020, 660, 70));
		books.add(new Book("Ruby Book", "Beyaz Balina Yayınevi", 2019, 450, 28));
		books.add(new Book("Go Book", "Kanarya Yayınevi", 2017, 120, 80));

	

		List<Book> sortedBook = books.stream().filter(book -> (book.getPageCount() > 325))
                .collect(Collectors.toList());

		for (Book book:sortedBook) {
			System.out.println(book);
		}
	}

}
