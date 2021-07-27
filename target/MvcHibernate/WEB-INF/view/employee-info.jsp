<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<form:form action = "saveEmployee" modelAttribute="employee">

    Name <form:input path = "name"/>
    <br><br>
    Surname <form:input path = "surname"/>
    <br><br>
    Department <form:input path = "department"/>
    <br><br>
    Salary <form:input path = "salary"/>
    <br><br>

   <input type = "submit" value = "Ok">
</form:form>
</body>
</html>
