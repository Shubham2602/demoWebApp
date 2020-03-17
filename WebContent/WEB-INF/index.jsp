<%@page import="VO.User"%>
<!DOCTYPE html>
<html>
<head>
<title>My App</title>
<link  href = "app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<%@include file="_header.jsp"%>
	<%--  <%User user = (User) request.getAttribute("uuser");%> --%>
	<div class=${app["_formCssClass"]["_name"]}>
		<h2>Welcome '<%-- <%=user.get_name()%> --%>${user._name}'</h2>
	</div>
	<div>
		Your mail id is :<%-- <%=user.get_email()%> --%> ${user._email}
	</div>
</body>
</html>