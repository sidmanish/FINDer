<%@include file="include/header.jsp"%>
<!-- Start Page Header area -->

<style>
.loginDesign{
font-weight:bold;
font-size:20px;margin-top:10px;
}
</style>
<div id="mu-page-header">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="mu-page-header-area">
					<h1 class="mu-page-header-title">Admin Login</h1>
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
						<li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
						<li class="breadcrumb-item active" aria-current="page">Admin
							Login</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
</div>
<!-- End Breadcrumb -->


<!-- Start main content -->
<!-- <div class="container-fluid">
	<div class="row">
	
	
	</div>
	</div> -->
<main> <!-- Start Login -->
<div class="form">



	<div class="container">
		<div class="row" style="display: block !important;">
			<div class="col-lg-offset-3 col-lg-6"
				style="margin-left: 30%; margin-bottom: 30px;">
				<div id="login" style="margin-top:525px;">
					<h1>Welcome Back!</h1>

					<form action="SaveLogin" method="post">
						<div class="container">
							<div class="row clearfix loginDesign">

								<div class="col-lg-3 col-md-3">
									<label class="loginDesign"> UserName<span class="req">*</span>
								</div>
								<div class="col-lg-9 col-md-9">
									</label> <input class="form-control" type="text" name="username" required autocomplete="off" />
								</div>
							</div>
							<div class="row clearfix loginDesign" >	
								<div class="col-lg-3 col-md-3">
									<label class="loginDesign"> Password<span class="req">*</span>
								</div>
								<div class="col-lg-9 col-md-9">
									</label> <input class="form-control" type="password" name="password" required
								autocomplete="off" />
								</div>
								

							</div>
						</div>
						
							
							
						

						<p class="forgot">
							<a href="#">Forgot Password?</a>
						</p>

						<button class="button button-block btn btn-primary" />
						Login
						</button>

					</form>

				</div>
			</div>
		</div>
	</div>



</div>
<!-- tab-content -->

</div>
<!-- /form --></main>

<!-- End main content -->




<%@include file="include/footer.jsp"%>