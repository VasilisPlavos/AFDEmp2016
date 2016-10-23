
public class Librarian {
	private Library library;
	
	public void findMeBooksFromAuthor(String author_name){
		this.library.printBookFromAuthor(author_name);
	}
	
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	
	public void findMeBook(String book_title){
		this.library.printBookDetails(book_title);
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Librarian(Library library) {
		this.library = library;
	}
	
	
	
}
