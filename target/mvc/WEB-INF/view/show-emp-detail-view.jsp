<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sergiu
  Date: 04/05/2021
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Details</title>
</head>
<body>

First Name: ${employee.name}<br /><br />
Last Name: ${employee.surname}<br /><br />
Salary: ${employee.salary}<br /><br />
Department: ${employee.department}<br /><br />
Car: ${employee.car}<br /><br />
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>

    </c:forEach>


</ul><br/> <br />
Phone Number: ${employee.phoneNumber}

</body>
</html>
