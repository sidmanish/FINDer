<%@ include file="include/headerS.jsp" %>
	
	<%List<Location> l = (List<Location>)request.getAttribute("locationList");%>		
	<div class="container">
  <h2>All Locations</h2>
  <p>All Listed Locations are here</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Service Name</th>
        
      </tr>
    </thead>
    <tbody>
    <%for(Location s:l){ %>
      <tr>
        <td><%=s.getLocationName()%></td>
        </tr>
      <%} %>
    </tbody>
  </table>
</div>
<%@ include file="include/footerS.jsp" %>
	