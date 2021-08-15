/**
 * 
 */
package dbhelpers;
import java.sql.*;


/**
 * @author AthPC
 *
 */
public class DeleteQuery {
	private Connection connection;
	
	public DeleteQuery(String dbName, String uname, String pwd){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doDelete(int film_id){
		// set up a String to hold our query
		String query = "delete from film where film_id = ?";
		
		//create a preparedstatement using out query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			//fill in the preparedstatement
			ps.setInt(1, film_id);
			
			//execute the query
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
