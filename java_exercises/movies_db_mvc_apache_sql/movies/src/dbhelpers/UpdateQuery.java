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
public class UpdateQuery {
	
	public Connection connection;
	
	public UpdateQuery (String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void doUpdate(Movie movie){
		String query = "update film set title=?, description=?, release_year=? where film_id=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, movie.getTitle());
			ps.setString(2, movie.getDescription());
			ps.setInt(3, movie.getRelease_year());
			ps.setInt(4, movie.getfilm_id());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
