<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<!-- modelAttribute must match theModel.addAttribute("student", new Student()); in controller -->
	<form:form action="processForm" modelAttribute="student">
	
	<!-- Spring calls getter -->
	First Name: <form:input path="firstName"/>
	<br><br>
	
	<!-- Spring calls getter -->
	Last Name: <form:input path="lastName"/>
	<br><br>
	
	Country:	
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>		
	</form:select>
		
	<br><br>
	
	<!-- STEP 1 -->
	Favorite Language:
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	Python <form:radiobutton path="favoriteLanguage" value="Python"/>
	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	
	<br><br>
	
	<!-- Spring calls setter -->
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>

</html>