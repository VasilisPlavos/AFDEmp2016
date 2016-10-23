
class Book {
	private String title;
	private Author author;
	private final String isbn;
	private int physical_copies;
	private int available_copies;
	private int times_rented;
	
	public void rentPhysicalCopy(){
		if (this.available_copies > 0){
			this.available_copies--;
			this.times_rented++;
			System.out.println("success");
		}
		else System.out.println("not success");
	}
	
	public boolean isAvailable(){
		if (this.available_copies > 0){
			return true;
		}else return false;
	}
	
	public boolean hasAuthor(String author){
		if (this.author.getName().equals(author)){
			return true;
		}else return false;
	}
	
	public Book(String title, Author author, String isbn, int physical_copies, int available_copies, int times_rented) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.physical_copies = physical_copies;
	this.available_copies = available_copies;
	this.times_rented = times_rented;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn="
				+ isbn + ", physical_copies=" + physical_copies
				+ ", available_copies=" + available_copies + ", times_rented="
				+ times_rented + author.toString() + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPhysical_copies() {
		return physical_copies;
	}
	public void setPhysical_copies(int physical_copies) {
		this.physical_copies = physical_copies;
	}
	public int getAvailable_copies() {
		return available_copies;
	}
	public void setAvailable_copies(int available_copies) {
		this.available_copies = available_copies;
	}
	public int getTimes_rented() {
		return times_rented;
	}
	public void setTimes_rented(int times_rented) {
		this.times_rented = times_rented;
	}
	public String getIsbn() {
		return isbn;
	}
	
	
	
	
	
	
	
}