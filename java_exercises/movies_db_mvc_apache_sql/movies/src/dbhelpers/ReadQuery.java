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
public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public ReadQuery (String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		//set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "select * from film";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				Movie movie = new Movie();
				movie.setfilm_id(this.results.getInt("film_id"));
				movie.setTitle(this.results.getString("title"));
				movie.setDescription(this.results.getString("description"));
				movie.setRelease_year(this.results.getInt("release_year"));
				
				table += "<tr>";
				table += "<td>";
				table += movie.getTitle();				
				table += "</td>";
				table += "<td>";
				table += movie.getDescription();			
				table += "</td>";
				table += "<td>";
				table += movie.getRelease_year();				
				table += "</td>";
				table += "<td>";
					table += "<a href=update?film_id=" + movie.getfilm_id() + ">update</a>"
					+ " <a href=delete?film_id=" + movie.getfilm_id() + ">delete</a>";				
				table += "</td>";		
				table += "</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}

}
