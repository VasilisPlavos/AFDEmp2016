import java.util.Arrays;

public class Library {
	private Book[] books;
	
	public Library(Book[] books) {
		this.books = books;
	}


	public void printAvailableBooks(){
		for (int i = 0; i < this.books.length; ++i){
			if (this.books[i].isAvailable()){
				System.out.println(this.books[i].toString());
			}			 
		}		
	}
	
	public void printBookDetails(String given_title){
		for (int i = 0; i < this.books.length; ++i){
			if (this.books[i].getTitle().equals(given_title)){
				System.out.println(this.books[i].toString());
			}else System.out.println("printBookDetails error");
		}
	}
	
	public void printBookFromAuthor(String given_name){
		for (int i = 0; i < this.books.length; i++){
			if (this.books[i].hasAuthor(given_name)){
				System.out.println(this.books[i].toString());
			}
		}
	}
	
	
	//g&s'ers
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}


	@Override
	public String toString() {
		return "Library [books=" + Arrays.toString(books) + "]";
	}
	
	
	
}
