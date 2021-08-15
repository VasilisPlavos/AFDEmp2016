package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.UpdateQuery;
import model.Movie;

/**
 * Servlet implementation class UpdateMovieServlet
 */
@WebServlet(description = "Controller which starts the actual film update to the database", urlPatterns = { "/updateMovie" })
public class UpdateMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the form data and set up a movie object
		int film_id = Integer.parseInt(request.getParameter("film_id"));
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int release_year = Integer.parseInt(request.getParameter("release_year"));
		
		Movie movie = new Movie();
		movie.setfilm_id(film_id);
		movie.setDescription(description);
		movie.setTitle(title);
		movie.setRelease_year(release_year);
		
		
		// create an updateQuery object and use it to update the film
		UpdateQuery uq = new UpdateQuery("sakil", "root", "1111");
		uq.doUpdate(movie);	
		
		// pass control on to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
