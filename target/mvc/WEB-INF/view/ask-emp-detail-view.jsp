<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>


<body>

<h3>Hello, dear employee. Please fill the form below:</h3>
<br/>
<br/>

<form:form action="show-emp-details" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br/>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br/>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br />
    Department <form:select path="department">

    <form:options items="${employee.departments}"/>

   </form:select>
    <br />
    Car: <form:radiobuttons path="car" items="${employee.cars}"/>
    <br />
    Foreign Language (s):
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br />
    Phone Number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br />
    <input type="submit" value="OK">




</form:form>
</body>

</html>