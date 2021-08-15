<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Library Add a Film</title>
</head>
<body>
<h1>Movie Library Add a Film</h1>

<form name=addForm action=addFilm method=get>

<label>
Film title:
</label>
<input type=text name=title value="" />
<br/>
<label>
Description:
</label>
<input type=text name=description value="" />
<br/>

<label>
Release Year:
</label>
<input type=text name=release_year value="" />
<br/>

<input type=submit name=submit value="Add the Movie" />


</form>


</body>
</html>