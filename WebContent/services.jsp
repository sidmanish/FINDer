<%@include file="include/header.jsp" %>
	<!-- Start Page Header area -->
	<div id="mu-page-header">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="mu-page-header-area">
						<h1 class="mu-page-header-title">services</h1>
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
					    <li class="breadcrumb-item active" aria-current="page">Services</li>
					  </ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- End Breadcrumb -->
	<%List<Services> serviceList =(List<Services>)request.getAttribute("serviceList"); %>
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
										<h2>Our exclusive services</h2>
										<p>All services  are listed here.</p>
									</div>
								</div>
							</div>
							<!-- Start Service Content -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-service-content">
										<div class="row">
										<%for(Services service : serviceList) {%>
											<!-- Start single service -->
											<div class="col-md-4">
												<div class="mu-single-service">
													<div class="mu-single-service-icon"><i class="fa fa-male " aria-hidden="true"></i></div>
													<div class="mu-single-service-content">
													<a href="FindServiceProviderByIdServlet?id=<%= service.getId()%>">
														<h3><%=service.getServiceName() %></h3></a>
														<p><%=service.getDescription() %></p>
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

		<<!-- Start Counter -->
		<section id="mu-counter">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-counter-area">

							<div class="mu-counter-block">
								<div class="row">

									

									<!-- Start Single Counter -->
									<div class="col-md-3 col-sm-6">
										<div class="mu-single-counter">
											<span class="fa fa-user"></span>
											<div class="mu-single-counter-content">
												<div class="counter-value" data-count="156">0</div>
												<h5 class="mu-counter-name">Customers</h5>
											</div>
										</div>
									</div>
									<!-- / Single Counter -->

									<!-- Start Single Counter -->
									<div class="col-md-3 col-sm-6">
										<div class="mu-single-counter">
											<span class="fa fa-male"></span>
											<div class="mu-single-counter-content">
												<div class="counter-value" data-count="50">0</div>
												<h5 class="mu-counter-name">Providers</h5>
											</div>
										</div>
									</div>
									<!-- / Single Counter -->

									<!-- Start Single Counter -->
									<div class="col-md-3 col-sm-6">
										<div class="mu-single-counter">
											<span class="fa fa-suitcase"></span>
											<div class="mu-single-counter-content">
												<div class="counter-value" data-count="9">0</div>
												<h5 class="mu-counter-name">Services</h5>
											</div>
										</div>
									</div>
									<!-- / Single Counter -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Counter -->
		<!-- Start Clients -->
		<div id="mu-clients">
			<div class="container">
				<div class="row">
					<div class="col-md-8">
						<div class="mu-clients-area">

							

						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Clients -->
		


		<!-- Start Customer Testimonials -->
		<section id="mu-testimonials">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-testimonials-area">
							<h2>What Our Customer Says</h2>

							<div class="mu-testimonials-block">
								<ul class="mu-testimonial-slide">

									<li>
										<img class="mu-rt-img" src="assets/images/ajeet.png" alt="img">
										<p>The services are too good ,I had no time to wash and dryclean my clothes so I contacted one of the service providers and he finished all my work on time.thanks to FINDer</p>
										<h5 class="mu-rt-name">Ajeet Singh</h5>
										
									</li>

									<li>
										<img class="mu-rt-img" src="assets/images/Shruti.png" alt="img">
										<p>I will give 5 star rating to FINDer ,I am working woman so i had no time in morning to care my 1 year baby,I hired a babysitter from finder,she was very caring. Thanks to FINDer</p>
										<h5 class="mu-rt-name">Shruti Tyagi</h5>
										
									</li>

									<li>
										<img class="mu-rt-img" src="assets/images/sundaram.png" alt="img">
										<p>I had no time to cook ,and I don't like outside foods,so I searched maids a lot but did not find one,Then I got to know about FINDer,now I eat very delicious food.Thanks to FINDer </p>
										<h5 class="mu-rt-name">Sundaram Chaurasiya</h5>
										
									</li>

								</ul>
							</div>

						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Customer Testimonials -->
		<!-- Start Clients -->
		<div id="mu-clients">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-clients-area">

							

						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Clients -->

		
	</main>
	
	<!-- End main content -->	
			
	<%@include file="include/footer.jsp"%>