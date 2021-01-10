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
<div class="container my-5">
	<div class="row">
                <div class="col-12 col-md-6 offset-md-3 shadow">
                	 <form action="RegisterServlet" id="form" method="post">
                        <h4 class="text-center my-4 mb-5 text-info">Register</h4>
                         <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" name="username" id="username">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password" required>
                        </div>
                        <div class="form-group">
                             <label for="confirmpassword">Confirm Password</label>
                            <input type="password" class="form-control" name="confirmpassword" id="confirmpassword" required>
                        </div>
                        <div class="form-group">
                         	<input type="submit" value="Sign Up" class="btn btn-outline-success" onclick="return Validate();" />
                        </div>
                        
                     </form>
                </div>
    </div>
</div>

<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirmpassword").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>
</body>
</html>