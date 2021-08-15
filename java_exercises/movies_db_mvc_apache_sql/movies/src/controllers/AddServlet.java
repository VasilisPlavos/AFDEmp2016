package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.AddQuery;
import model.Movie;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "Controller for adding a new film to the database", urlPatterns = { "/addFilm" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the data
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int release_year = Integer.parseInt(request.getParameter("release_year"));
			
		// set up movie object
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setDescription(description);
		movie.setRelease_year(release_year);		
		
		// set up an addQuery object
		AddQuery aq = new AddQuery("sakil", "root", "1111");
		
		// pass the film to addQuery to add to the database
		aq.doAdd(movie);
		
		// pass execution control to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);		
		
		
	}

}
