<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Movie" %>
    <% Movie movie = (Movie) request.getAttribute("movie"); %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update a Movie</title>
</head>
<body>
<h1>Update a Movie</h1>

<form name=updateForm action=updateMovie method=get>

<label>
Movie ID:
</label>
<input type=text name=film_id value="<%= movie.getfilm_id() %>" />
<br/>

<label>
Film title:
</label>
<input type=text name=title value="<%= movie.getTitle() %>" />
<br/>
<label>
Description:
</label>
<input type=text name=description value="<%= movie.getDescription() %>" />
<br/>

<label>
Release Year:
</label>
<input type=text name=release_year value="<%= movie.getRelease_year() %>" />
<br/>

<input type=submit name=submit value="Update the Movie" />


</form>

</body>
</html>