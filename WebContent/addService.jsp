<%@ include file="include/headerS.jsp" %>
	<!-- Start Login -->
		<div class="form">
      
    
      
        
        <div id="services">   
          <h1>AddServices</h1>
          
          <form action="SaveServiceServlet" method="post">
          
            <div class="field-wrap">
            <label>
              ServiceName<span class="req">*</span>
            </label>
            <input type="text" name="serviceName" required />
          </div>
          
          <div class="field-wrap">
            <label>
              Description<span class="req">*</span>
            </label>
            <textarea rows="5" cols="7" name="description"></textarea>
          </div>
          
        
          
          <button class="button button-block"/>Submit</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form --></main>
	
<%@ include file="include/footerS.jsp" %>