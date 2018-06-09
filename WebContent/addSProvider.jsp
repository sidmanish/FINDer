 <%@ include file="include/headerS.jsp" %>
	<!-- Start Login -->
		<div class="form">
      
    
      
        
        <div id="services">   
          <h1>AddServiceProviders</h1>
          
          <form action="SaveServiceProvider" method="post">
            <div class="field-wrap">
           
             <span class="req">*</span>
             <% List<Services>l=(List<Services>)request.getAttribute("serviceList"); %>
             <select name="service_id">
             <option> Select Services</option>
             <% for(Services s:l){ %>
             <option value="<%= s.getId()%>"><%= s.getServiceName()%></option>
             
             
             
             <%} %>
             </select>
             </div>   
          
          
            <div class="field-wrap">
           
             <span class="req">*</span>
             <% List<Location>l1=(List<Location>)request.getAttribute("locationList"); %>
             <select name="location_id">
             <option> Select Locations</option>
             <% for(Location s1:l1){ %>
             <option value ="<%= s1.getId()%>"><%=s1.getLocationName()%></option>
             
             
             
             <%} %>
             </select>
             </div>
          
            <div class="field-wrap">
           
             <span class="req">*</span>
            Name :<input type="text" name="name" required />
          </div>
          
          <div class="field-wrap">
            
             <span class="req">*</span>
            Mobile :<input type="text" name="mobile" required />
             
          </div>
          <div class="field-wrap">
            
             <span class="req">*</span>
            AdharNo :<input type="text" name="adhar_no" required />
             
          </div>
           
          <div class="field-wrap">
            
             <span class="req">*</span>
            Address:<input type="text" name="address" required />
             
          </div>
         
          
        
          
          <button class="button button-block"/>Submit</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form --></main>
	
<%@include file="include/footerS.jsp" %>	
	
	
	
	
	
	
	