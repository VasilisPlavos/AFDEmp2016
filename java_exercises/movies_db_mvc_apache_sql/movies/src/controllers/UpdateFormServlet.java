package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.ReadRecord;
import model.Movie;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet(description = "This will get a movie and use the data to fill in table for updating the record", urlPatterns = { "/update" })
public class UpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFormServlet() {
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
		// get the movieID
		int film_id = Integer.parseInt(request.getParameter("film_id"));
		
		// create ReadRecord class
		ReadRecord rr = new ReadRecord("sakil", "root", "1111", film_id);
		
		// Use ReadRecord to get the movie data
		rr.doRead();
		Movie movie = rr.getMovie();
		
		
		// pass Film and control to the updateForm.jsp
		request.setAttribute("movie", movie);
		String url = "/updateForm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
