<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %><!-- prefix for form:formtags -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- here we will use spring related tags to create the form not html tags so use taglib directory -->
	<form:form method="post" commandName="user"><!-- commandName to set a model object -->
		<table>
			<tr>
				<td>user name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>password:</td>
				<td><form:password path="password" /></td>
				<!-- instead of name attribute in html use path attribute -->
			</tr>

			<tr>
				<td>gender:</td>
				<td><form:radiobutton path="gender" value="M" label="M" /> <form:radiobutton
						path="gender" value="F" label="F" /></td>
			</tr>

			<tr>
				<td>country:</td>
				<td><form:select path="country" > 
				<form:option value="0" label="select" /> 
						<form:option value="1" label="India" /> 
						<form:option value="2" label="USA" /> 
						<form:option value="3" label="UK" /> 
					</form:select>
					</td>
				<!-- instead of name attribute in html use path attribute -->
			</tr>
			<tr>
			<td>about you:</td>
			<td><form:textarea path="aboutYou"/></td>
			</tr>
			<tr><td>community:</td>
			<td><form:checkbox path="community" value="Spring" label="Spring"/>
			<form:checkbox path="community" value="Hibernate" label="Hibernate"/>
			<form:checkbox path="community" value="Struts" label="Struts"/>
			</td>
			</tr>
			<tr><td></td>
			<td><form:checkbox path="mailingList" label="will you like to join our mailingList?"/></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit"></td></tr>
		</table>
		</form:form>
</body>
</html>