package q2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;





public class Application {

	public static void main(String[] args) {
		
		Set<Book> books = new TreeSet<Book>();
		books.add(new Book("Suç ve Ceza", "A", 2000, 800, 45));
		books.add(new Book("Dönüşüm", "B", 2010, 250, 45.5));
		books.add(new Book("Sefiller", "C", 2016, 5000, 30));
		books.add(new Book("Sherlock Holmes", "D", 2020, 250, 20));
		books.add(new Book("Geleceği Keşfedenler", "E", 2020, 440, 50));
		
		
		for (Book book:books) {
			System.out.println(book);
		}
		
		
	}

}
