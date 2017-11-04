<%@page import="com.test.mvc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%  List<Student> students =(List<Student>)request.getAttribute("students"); %>
		
		<table>
			<tr>
				<th>姓名</th>
				<th>年龄</th>
				<th>邮箱</th>
			</tr>
			<%
				for(Student student : students){
				
			
			%>	
				<tr>
					<td><%=student.getName()%></td>
					<td><%=student.getAge()%></td>
					<td><%=student.getEmill()%></td>
				</tr>
			<%
				}
			 %>
		</table>
			
		
		
</body>
</html>