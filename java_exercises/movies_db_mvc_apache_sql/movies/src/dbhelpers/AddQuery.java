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
public class AddQuery {
	
	public Connection connection;
	
	public AddQuery (String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void doAdd(Movie movie){
		String query = "insert into film (title, description, release_year) values (?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, movie.getTitle());
			ps.setString(2, movie.getDescription());
			ps.setInt(3, movie.getRelease_year());
			
			ps.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
