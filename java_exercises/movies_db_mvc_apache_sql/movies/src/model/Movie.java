/**
 * 
 */
package model;

/**
 * @author AthPC
 *
 */
public class Movie {
	private int film_id;
	private String title;
	private String description;
	private int release_year;
	
	
	/**
	 * default constructor
	 */
	public Movie() {
		this.film_id = 1;
		this.title = "no title";
		this.description = "no description";
		this.release_year = 0;
	}
	
	/**
	 * @param film_id
	 * @param title
	 * @param description
	 * @param release_year
	 */
	public Movie(int film_id, String title, String description, int release_year) {
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
	}
	
	

	public int getfilm_id() {
		return film_id;
	}

	public void setfilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year="
				+ release_year + "]";
	}
	
	
	
	

}
