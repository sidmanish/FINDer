<%@include file="include/header.jsp" %>
	<!-- Start Page Header area -->
	<div id="mu-page-header">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="mu-page-header-area">
						<h1 class="mu-page-header-title">service Providers</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Page Header area -->

	<!-- Start Breadcrumb -->
	<div id="mu-breadcrumb">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<nav aria-label="breadcrumb" role="navigation">
					  <ol class="breadcrumb mu-breadcrumb">
					    <li class="breadcrumb-item active"><a href="index.jsp">Home</a></li>
					    <li class="breadcrumb-item active" aria-current="page">Service Providers</li>
					    <li class="breadcrumb-item active"><a href="ServiceProviderDropdownServlet">Search Service Providers</a></li>
					  </ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- End Breadcrumb -->
	<%List<ServiceProvider> l = (List<ServiceProvider>) request.getAttribute("serviceProviderList"); %>
	
	<%List<Location> locationList = (List<Location>) request.getAttribute("locationList");%>

	<!-- Start main content -->
	<main>
		
		<!-- Start Services -->
		<section id="mu-service">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-service-area">
							<!-- Title -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-title">
										<h2>Our exclusive service Providers</h2>
										<p>All service Providers according to your location are listed here.</p>
									</div>
								</div>
							</div>
							<!-- Start Service Content -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-service-content">
										<div class="row">
										<%for (ServiceProvider s : l) {%>											<!-- Start single service -->
											<div class="col-md-4">
												<div class="mu-single-service">
													<div class="mu-single-service-icon"><i class="fa fa-male " aria-hidden="true"></i></div>
													<div class="mu-single-service-content">
													
														<h3><%=s.getName() %></h3>
														<%-- <%for (Services services : serviceList) {
							if (services.getId() == s.getServiceId()) {
				%>
				<p> <%=services.getServiceName()%></p>
				<%
					}
						}
				%>
													 --%>	
														<p>Mobile --    <%=s.getMobile()%></p>
														<p>Adhar No --     <%=s.getAdharNo()%></p>
														
														
					

					<p>Address--<%=s.getAddress()%></p>
						<%for (Location loc : locationList) {
							if (loc.getId() == s.getLocationId()) {
				%>
				<p>Location --<%=loc.getLocationName()%></p>
				<%
					}
						}
				%>
					
												
													</div>
												</div>
											</div>
											<!-- End single service -->
											<%} %>
										</div>
									</div>
								</div>
							</div>
							<!-- End Service Content -->
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Services -->

<%@ include file="include/footer.jsp"%>