<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Cocktails!</title>

<!-- Bootstrap core CSS -->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/css/modern-business.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>

<body>

	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">It's Cocktails.</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="about.html">About</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="services.html">Services</a>
					</li>
					<li class="nav-item active"><a class="nav-link"
						href="contact.html">Contact</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownPortfolio" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> Portfolio </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownPortfolio">
							<a class="dropdown-item" href="portfolio-1-col.html">1 Column
								Portfolio</a> <a class="dropdown-item" href="portfolio-2-col.html">2
								Column Portfolio</a> <a class="dropdown-item"
								href="portfolio-3-col.html">3 Column Portfolio</a> <a
								class="dropdown-item" href="portfolio-4-col.html">4 Column
								Portfolio</a> <a class="dropdown-item" href="portfolio-item.html">Single
								Portfolio Item</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Blog </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
							<a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
							<a class="dropdown-item" href="blog-post.html">Blog Post</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Other Pages </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="full-width.html">Full Width
								Page</a> <a class="dropdown-item" href="sidebar.html">Sidebar
								Page</a> <a class="dropdown-item" href="faq.html">FAQ</a> <a
								class="dropdown-item" href="404.html">404</a> <a
								class="dropdown-item" href="pricing.html">Pricing Table</a>
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<h2 class="mt-4 mb-3">
			Sign-In
			<!--       <small></small> -->
		</h2>

		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="index.html">Home</a></li>
			<li class="breadcrumb-item active">Sign-In</li>
		</ol>

		<!-- Contact Form -->
		<!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
		<div class="row">
			<div class="col-lg-8 mb-4">
				<!--         <h3></h3> -->
				<form name="member" id="signInForm" novalidate role="form"
					action="/member/signIn" method="post">
					<div class="control-group form-group">
						<div class="controls">
							<label>ID</label> <input type="text"
								class="form-control" name="member_id" required
								data-validation-required-message="Please enter your ID.">
							<!--               <p class="help-block">dfdfdfdf</p> -->
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>PASSWORD</label> <input type="password"
								class="form-control" name="member_pass" required
								data-validation-required-message="Please enter your phone PASSWORD.">
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>ACCOUNT NAME</label> <input type="text"
								class="form-control" name="name" required
								data-validation-required-message="Please enter your ACCOUNT NAME.">
						</div>
					</div>
					<div id="success"></div>
					<!-- For success/fail messages -->
					<button type="submit" class="btn btn-primary"
						id="sendMessageButton">CREATE ACCOUNT</button>
					<button type="reset" class="btn btn-primary" id="sendMessageButton">RESET
						FORM</button>
				</form>
			</div>

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">&copy; 2020. ISh all rights
				reserved.</p>
		</div>
		<!-- /.container -->
	</footer>

   <!-- Bootstrap core JavaScript -->
	  <script src="/resources/vendor/jquery/jquery.min.js"></script>
	  <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script> 


</body>

</html>
