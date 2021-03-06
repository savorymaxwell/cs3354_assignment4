package lms;


/**
 * A book in the collection
 * @author Jill Seaman
 */
public class Book extends Resource {
	
	private String isbn;       // international standard book number
	private String author;     // author(s) of the book

	/**
	 * construct book from parameters
	 * @param resourceID
	 * @param title
	 * @param isbn
	 * @param author
	 */
	public Book(int resourceID, String title, String isbn, String author) {
		super(resourceID, title);
		this.isbn = isbn;
		this.author = author;
	}

	@Override
	public Day calculateNewDueDate(Day startDay, Member member) {
		return member.calculateNewBookDueDate(startDay);
	}
}
