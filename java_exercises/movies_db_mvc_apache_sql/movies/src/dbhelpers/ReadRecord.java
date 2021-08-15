/**
 * 
 */
package dbhelpers;

import java.sql.*;

import model.Movie;

/**
 * @author AthPC
 *
 */
public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Movie movie = new Movie();
	private int film_id;
	
	public ReadRecord(String dbName, String uname, String pwd, int film_id){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.film_id = film_id;
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.connection = DriverManager.getConnection(url, uname, pwd);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	
	public void doRead(){
		String query = "select * from film where film_id = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, this.film_id);
			this.results = ps.executeQuery();
			this.results.next();
			movie.setfilm_id(this.results.getInt(1));
			movie.setDescription(this.results.getString("description"));
			movie.setTitle(this.results.getString("title"));
			movie.setRelease_year(this.results.getInt("release_year"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Movie getMovie(){
		return this.movie;
		}
	

}
