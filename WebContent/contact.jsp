<%@include file="include/header.jsp" %>

<!-- Start Page Header area -->
	<div id="mu-page-header">
		<div class="container">
		
			<div class="row">
				<div class="col-md-12">
					<div class="mu-page-header-area">
						<h1 class="mu-page-header-title">Contact us</h1>
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
					    <li class="breadcrumb-item active" aria-current="page">Contact Us</li>
					  </ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- End Breadcrumb -->

	
	<!-- Start main content -->
	<main>
		<!-- Start Contact -->
		<section id="mu-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-contact-area">
							<!-- Title -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-title">
										<h2>Say Hello!</h2>
										<p>Searching any other specific services or wants to provide feedback,we will happy to hear you .</p>
									</div>
								</div>
							</div>
								<!-- Start Contact Content -->
							<div class="mu-contact-content">
								<div class="row">

									<div class="col-md-12">
										<div class="mu-contact-form-area">
											<div id="form-messages"></div>
											<form  method="post" action="SaveContact" class="mu-contact-form">

												<div class="form-group">  
													<span class="fa fa-user mu-contact-icon"></span>              
													<input type="text" class="form-control" placeholder="Name" id="name" name="name" required>
												</div>

												<div class="form-group">  
													<span class="fa fa-envelope mu-contact-icon"></span>              
													<input type="email" class="form-control" placeholder="Enter Email" id="email" name="email" required>
												</div>    

												<div class="form-group"> 
													<span class="fa fa-folder-open-o mu-contact-icon"></span>                
													<input type="text" class="form-control" placeholder="Your Subject" id="subject" name="subject" required>
												</div>

												<div class="form-group">
													<span class="fa fa-pencil-square-o mu-contact-icon"></span> 
													<textarea class="form-control" placeholder="Message" id="message" name="message" required></textarea>
												</div>
												<input type="submit" class="mu-send-msg-btn"><span></span>
								        	</form>
										</div>
									</div>

								</div>
							</div>
							<!-- End Contact Content -->
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Contact -->

		

	</main>
	
	<!-- End main content -->	
	<%@include file="include/footer.jsp" %>		
			