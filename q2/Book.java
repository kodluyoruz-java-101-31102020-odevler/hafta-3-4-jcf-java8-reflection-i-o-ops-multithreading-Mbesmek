package q2;

public class Book implements Comparable<Book> {
private String name;
	
	private String publisher;
	
	private int publishYear;
	
	private int pageCount;
	
	private double price;
	
	public Book(String name, String publisher, int publishYear, int pageCount, double price) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pageCount = pageCount;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Book book) {
		return this.getName().compareTo(book.getName());
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();		
		builder.append(this.getName());
		builder.append("--");
		builder.append(this.getPublisher());
		builder.append("--");
		builder.append(this.getPublishYear());
		builder.append("--");
		builder.append(this.getPageCount());
		builder.append("--");
		builder.append(this.getPrice());
		
		return builder.toString();
	}
}
