<%@ include file="include/header.jsp"%>
<!-- Start Login -->
<div class="container" style="margin-top:50px; margin-bottom:50px;">
	<div class="row" style="display:block;" style="margin-top:50px;">
		<div class="col-offset-lg-3 col-lg-6" style="margin-left:30%;">
			<div class="form">

				<div id="services" style="margin-top:150px;">
					<h1>Search Service Providers</h1>

					<form action="FindServiceProviderByServiceLocationId" method="post">
						<div class="field-wrap">

							<span class="req">Select Service</span>
							<% List<Services>l=(List<Services>)request.getAttribute("serviceList"); %>
							<select name="service_id" class="form-control">
								<option> Select Services</option>
								<% for(Services s:l){ %>
								<option value="<%= s.getId()%>"><%= s.getServiceName()%></option>



								<%} %>
							</select>
						</div>
						<br>

						<div class="field-wrap">

							<span class="req">Select Location	</span>
							<% List<Location>l1=(List<Location>)request.getAttribute("locationList"); %>
							<select name="location_id" class="form-control">
								<option> Select Locations</option>
								<% for(Location s1:l1){ %>
								<option value="<%= s1.getId()%>"><%=s1.getLocationName()%></option>



								<%} %>
							</select>
						</div>
<br>

						<button class="button button-block btn btn-primary" />
						Search
						</button>

					</form>

				</div>

			</div>
		</div>
	</div>
</div>
<!-- tab-content -->





<%@ include file="include/footer.jsp"%>
