<html>

<head>
<title>Flight Result</title>

</head>
<body>
<%
List<Flight> listOfFlight =()request.getAttribute("listofsearchedflight");

%>

<%
 for(Flight flight :listOfFlight)
 {

 %>

 <h1>The Flight Number is :<%=flight.getFlightNo() %></h1>
 <h1>The Flight Source is :<%=flight.getSource() %></h1>
 <h1>The Flight Destination is :<%=flight.getDestination() %></h1>

 <%
 }
 %>
</body>

</html>