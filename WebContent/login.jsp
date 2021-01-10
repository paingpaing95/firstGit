<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<label>${message}</label>
<div class="container my-5">
	<div class="row">
                <div class="col-12 col-md-6 offset-md-3 shadow">
                	 <form action="LoginServlet" class="form" id="form" method="post">
                        <h4 class="text-center my-4 mb-5 text-info">Student Info</h4>
                         <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" name="name" id="name">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password">
                        </div>
                        <div class="form-group">
                            <label for="role">Role</label><br>
                            <select name="role" id="role" class="form_control">
							  <option value="normaluser">NormalUser</option>
							  <option value="admin">Admin</option>
							</select>
                        </div>
                        <div class="row">
                         <div class="form-group col">
                            <input type="submit" class="btn btn-outline-primary" value="Login" />
                           	
                        </div>
                        <div class="form-group col">
                        	<a href="./register.jsp"><button type="button" class="">Sign Up</a>
                        </div>
                        </div>
                        <div >
                     </form>
                </div>
    </div>
</div>
</body>
</html>