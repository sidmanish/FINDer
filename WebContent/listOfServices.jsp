 
	<%@ include file="include/headerS.jsp" %>
	
	<%List<Services> l = (List<Services>)request.getAttribute("serviceList");%>		
	<div class="container">
  <h2>All Services</h2>
  <p>All Listed Services are here</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Service Name</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
    <%for(Services s:l){ %>
      <tr>
        <td><%= s.getServiceName()%></td>
        <td><%=s.getDescription() %></td>
      </tr>
      <%} %>
    </tbody>
  </table>
</div>
<%@ include file="include/footerS.jsp" %>	
	
	