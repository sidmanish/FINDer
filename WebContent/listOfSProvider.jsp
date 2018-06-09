<%@ include file="include/headerS.jsp" %>
	
	<%List<ServiceProvider> l = (List<ServiceProvider>)request.getAttribute("serviceProviderList");%>		
	<div class="container">
  <h2>All ServicesProviders</h2>
  <p>All Listed ServiceProviders are here</p>            
  <table class="table">
    <thead>
      <tr>
        <th> Name</th>
        <th>Mobile</th>
        <th> AdharNo </th>
         <th>ServiceId  </th>
          <th> Address </th>
           <th> LocationId </th>
      </tr>
    </thead>
    <tbody>
    <%for(ServiceProvider s:l){ %>
      <tr>
        <td><%= s.getName()%></td>
       <td><%= s.getMobile() %></td>
       <td><%= s.getAdharNo() %></td>
        <td><%= s.getServiceId() %></td>
         <td><%= s.getAddress() %></td>
         <td><%= s.getLocationId() %></td>
      </tr>
      <%} %>
    </tbody>
  </table>
</div>
	<%@ include file="include/footerS.jsp" %>
	
	
	