<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	<title>Customer Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>

<body>

<i>* means required field.</i>

<br><br>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name*: <form:input path="lastName"/>
		<!-- Display error message -->
		<form:errors path="lastName" cssClass="error"/>
		
		<br><br>
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>

</html>