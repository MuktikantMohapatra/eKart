<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="registerUser" method="post">
  <pre>
     Name :<input type="text" name="name" />
     Email:<input type="email" name="email" />
     Phone:<input type="text" name="phone" />
     DOB  :<input type="date" name="dob" />
     <input type="radio" name="gender" value="MALE" > MALE
     <input type="radio" name="gender" value="FEMALE" > FEMALE
     <button type="submit" >Register User</button>
  </pre>
  </form>
</body>
</html>