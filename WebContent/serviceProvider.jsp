<%@include file="include/header.jsp"%>
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
					    <li class="breadcrumb-item"><a href="#">Home</a></li>
					    <li class="breadcrumb-item active" aria-current="page">Service Providers</li>
					  </ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- End Breadcrumb -->


<% List<ServiceProvider> serviceproviderList=(List<ServiceProvider>)request.getAttribute("serviceProviderList"); %>
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
									<h2><%=request.getAttribute("serviceName")%></h2>	
										<p>All services providers  are listed here.</p>
																			
									</div>
								</div>
							</div>
							<!-- Start Service Content -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-service-content">
										<div class="row">
										<%for(ServiceProvider serviceProvider : serviceproviderList) {%>
											<!-- Start single service -->
											<div class="col-md-4">
												<div class="mu-single-service">
													<div class="mu-single-service-icon"><i class="fa fa-bolt " aria-hidden="true"></i></div>
													<div class="mu-single-service-content">
													
														<h3><%=serviceProvider.getName() %></h3>
														<p>Contact No:<%=serviceProvider.getMobile() %></p>
														<p>Aadhar No:<%=serviceProvider.getAdharNo()%></p>
														<p>Address:<%=serviceProvider.getAddress() %></p>
														<p>Location:<%=serviceProvider.getLocationId() %></p>
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
										
									




<%@include file="include/footer.jsp"%>