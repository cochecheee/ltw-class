<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- include taglib and create var named URL -->
<%@ include file="/commons/taglib.jsp"%>
<c:url value="/" var="URL"></c:url>

<!DOCTYPE html>
<html lang="en">


<!-- Head BEGIN -->
<head>
<meta charset="utf-8">
<title>Metronic Shop UI</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<meta content="Metronic Shop UI description" name="description">
<meta content="Metronic Shop UI keywords" name="keywords">
<meta content="keenthemes" name="author">

<meta property="og:site_name" content="-CUSTOMER VALUE-">
<meta property="og:title" content="-CUSTOMER VALUE-">
<meta property="og:description" content="-CUSTOMER VALUE-">
<meta property="og:type" content="website">
<meta property="og:image" content="-CUSTOMER VALUE-">
<!-- link to image for socio -->
<meta property="og:url" content="-CUSTOMER VALUE-">

<link rel="shortcut icon" href="favicon.ico">

<!-- Fonts START -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all"
	rel="stylesheet" type="text/css">
<!--- fonts for slider on the index page -->
<!-- Fonts END -->

<!-- Global styles START -->
<link
	href="${URL}assets/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${URL}assets/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Global styles END -->

<!-- Page level plugin styles START -->
<link
	href="${URL}assets/global/plugins/fancybox/source/jquery.fancybox.css"
	rel="stylesheet">
<link
	href="${URL}assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css"
	rel="stylesheet">
<link
	href="${URL}assets/global/plugins/slider-layer-slider/css/layerslider.css"
	rel="stylesheet">

<link href="${URL}assets/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css">
<!-- Page level plugin styles END -->

<!-- Theme styles START -->
<link href="${URL}assets/global/css/components.css" rel="stylesheet">
<link href="${URL}assets/frontend/layout/css/style.css" rel="stylesheet">
<link href="${URL}assets/frontend/pages/css/style-shop.css"
	rel="stylesheet" type="text/css">
<link href="${URL}assets/frontend/pages/css/style-layer-slider.css"
	rel="stylesheet">
<link href="${URL}assets/frontend/layout/css/style-responsive.css"
	rel="stylesheet">
<link href="${URL}assets/frontend/layout/css/themes/red.css"
	rel="stylesheet" id="style-color">
<link href="${URL}assets/frontend/layout/css/custom.css"
	rel="stylesheet">
<!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="ecommerce">
	<!-- BEGIN STYLE CUSTOMIZER -->
	<div class="color-panel hidden-sm">
		<div class="color-mode-icons icon-color"></div>
		<div class="color-mode-icons icon-color-close"></div>
		<div class="color-mode">
			<p>THEME COLOR</p>
			<ul class="inline">
				<li class="color-red current color-default" data-style="red"></li>
				<li class="color-blue" data-style="blue"></li>
				<li class="color-green" data-style="green"></li>
				<li class="color-orange" data-style="orange"></li>
				<li class="color-gray" data-style="gray"></li>
				<li class="color-turquoise" data-style="turquoise"></li>
			</ul>
		</div>
	</div>
	<!-- END BEGIN STYLE CUSTOMIZER -->

	<!-- BEGIN TOP BAR -->
	<div class="pre-header">
		<div class="container">
			<div class="row">
				<!-- BEGIN TOP BAR LEFT PART -->
				<div class="col-md-6 col-sm-6 additional-shop-info">
					<ul class="list-unstyled list-inline">
						<li><i class="fa fa-phone"></i><span>+1 456 6717</span></li>
						<!-- BEGIN CURRENCIES -->
						<li class="shop-currencies"><a href="javascript:void(0);">€</a>
							<a href="javascript:void(0);">£</a> <a href="javascript:void(0);"
							class="current">$</a></li>
						<!-- END CURRENCIES -->
						<!-- BEGIN LANGS -->
						<li class="langs-block"><a href="javascript:void(0);"
							class="current">English </a>
							<div class="langs-block-others-wrapper">
								<div class="langs-block-others">
									<a href="javascript:void(0);">French</a> <a
										href="javascript:void(0);">Germany</a> <a
										href="javascript:void(0);">Turkish</a>
								</div>
							</div></li>
						<!-- END LANGS -->
					</ul>
				</div>
				<!-- END TOP BAR LEFT PART -->
				<!-- BEGIN TOP BAR MENU -->
				<div class="col-md-6 col-sm-6 additional-nav">
					<ul class="list-unstyled list-inline pull-right">
						<li><a href="shop-account.html">My Account</a></li>
						<li><a href="shop-wishlist.html">My Wishlist</a></li>
						<li><a href="shop-checkout.html">Checkout</a></li>
						<li><a href="/ex02/login">Log In</a></li>
						<li><a href="/ex02/register">Register</li>
					</ul>
				</div>
				<!-- END TOP BAR MENU -->
			</div>
		</div>
	</div>
	<!-- END TOP BAR -->




	<div class="main">
		<div class="container">
			<sitemesh:write property="body" />
		</div>
	</div>

	<!-- BEGIN BRANDS -->
	<%@ include file="/commons/web/brands.jsp"%>
	<!-- END BRANDS -->

	<!-- BEGIN STEPS -->
	<%@ include file="/commons/web/steps.jsp"%>
	<!-- END STEPS -->

	<!-- BEGIN PRE-FOOTER -->
	<div class="pre-footer">
		<div class="container">
			<div class="row">
				<!-- BEGIN BOTTOM ABOUT BLOCK -->
				<div class="col-md-3 col-sm-6 pre-footer-col">
					<h2>About us</h2>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
						sed diam sit nonummy nibh euismod tincidunt ut laoreet dolore
						magna aliquarm erat sit volutpat. Nostrud exerci tation
						ullamcorper suscipit lobortis nisl aliquip commodo consequat.</p>
					<p>Duis autem vel eum iriure dolor vulputate velit esse
						molestie at dolore.</p>
				</div>
				<!-- END BOTTOM ABOUT BLOCK -->
				<!-- BEGIN BOTTOM INFO BLOCK -->
				<div class="col-md-3 col-sm-6 pre-footer-col">
					<h2>Information</h2>
					<ul class="list-unstyled">
						<li><i class="fa fa-angle-right"></i> <a href="#">Delivery
								Information</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="#">Customer
								Service</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="#">Order
								Tracking</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="#">Shipping
								&amp; Returns</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="contacts.html">Contact
								Us</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="#">Careers</a></li>
						<li><i class="fa fa-angle-right"></i> <a href="#">Payment
								Methods</a></li>
					</ul>
				</div>
				<!-- END INFO BLOCK -->

				<!-- BEGIN TWITTER BLOCK -->
				<div class="col-md-3 col-sm-6 pre-footer-col">
					<h2 class="margin-bottom-0">Latest Tweets</h2>
					<a class="twitter-timeline" href="https://twitter.com/twitterapi"
						data-tweet-limit="2" data-theme="dark" data-link-color="#57C8EB"
						data-widget-id="455411516829736961"
						data-chrome="noheader nofooter noscrollbar noborders transparent">Loading
						tweets by @keenthemes...</a>
				</div>
				<!-- END TWITTER BLOCK -->

				<!-- BEGIN BOTTOM CONTACTS -->
				<div class="col-md-3 col-sm-6 pre-footer-col">
					<h2>Our Contacts</h2>
					<address class="margin-bottom-40">
						35, Lorem Lis Street, Park Ave<br> California, US<br>
						Phone: 300 323 3456<br> Fax: 300 323 1456<br> Email: <a
							href="mailto:info@metronic.com">info@metronic.com</a><br>
						Skype: <a href="skype:metronic">metronic</a>
					</address>
				</div>
				<!-- END BOTTOM CONTACTS -->
			</div>
			<hr>
			<div class="row">
				<!-- BEGIN SOCIAL ICONS -->
				<div class="col-md-6 col-sm-6">
					<ul class="social-icons">
						<li><a class="rss" data-original-title="rss" href="#"></a></li>
						<li><a class="facebook" data-original-title="facebook"
							href="#"></a></li>
						<li><a class="twitter" data-original-title="twitter" href="#"></a></li>
						<li><a class="googleplus" data-original-title="googleplus"
							href="#"></a></li>
						<li><a class="linkedin" data-original-title="linkedin"
							href="#"></a></li>
						<li><a class="youtube" data-original-title="youtube" href="#"></a></li>
						<li><a class="vimeo" data-original-title="vimeo" href="#"></a></li>
						<li><a class="skype" data-original-title="skype" href="#"></a></li>
					</ul>
				</div>
				<!-- END SOCIAL ICONS -->
				<!-- BEGIN NEWLETTER -->
				<div class="col-md-6 col-sm-6">
					<div class="pre-footer-subscribe-box pull-right">
						<h2>Newsletter</h2>
						<form action="#">
							<div class="input-group">
								<input type="text" placeholder="youremail@mail.com"
									class="form-control"> <span class="input-group-btn">
									<button class="btn btn-primary" type="submit">Subscribe</button>
								</span>
							</div>
						</form>
					</div>
				</div>
				<!-- END NEWLETTER -->
			</div>
		</div>
	</div>
	<!-- END PRE-FOOTER -->

	<!-- BEGIN FOOTER -->
	<%@ include file="/commons/web/footer.jsp"%>
	<!-- END FOOTER -->



	<!-- Load javascripts at bottom, this will reduce page load time -->
	<!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
	<!--[if lt IE 9]>
    <script src="${URL}assets/global/plugins/respond.min.js"></script>  
    <![endif]-->
	<script src="${URL}assets/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="${URL}assets/global/plugins/jquery-migrate.min.js"
		type="text/javascript"></script>
	<script src="${URL}assets/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="${URL}assets/frontend/layout/scripts/back-to-top.js"
		type="text/javascript"></script>
	<script
		src="${URL}assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
	<script
		src="${URL}assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"
		type="text/javascript"></script>
	<!-- pop up -->
	<script
		src="${URL}assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.min.js"
		type="text/javascript"></script>
	<!-- slider for products -->
	<script src='${URL}assets/global/plugins/zoom/jquery.zoom.min.js'
		type="text/javascript"></script>
	<!-- product zoom -->
	<script
		src="${URL}assets/global/plugins/bootstrap-touchspin/bootstrap.touchspin.js"
		type="text/javascript"></script>
	<!-- pop up -->
	<script src="${URL}assets/global/plugins/uniform/jquery.uniform.min.js"
		type="text/javascript"></script>
	<!-- Quantity -->

	<!-- BEGIN LayerSlider -->
	<script
		src="${URL}assets/global/plugins/slider-layer-slider/js/greensock.js"
		type="text/javascript"></script>
	<!-- External libraries: GreenSock -->
	<script
		src="${URL}assets/global/plugins/slider-layer-slider/js/layerslider.transitions.js"
		type="text/javascript"></script>
	<!-- LayerSlider script files -->
	<script
		src="${URL}assets/global/plugins/slider-layer-slider/js/layerslider.kreaturamedia.jquery.js"
		type="text/javascript"></script>
	<!-- LayerSlider script files -->
	<script src="${URL}assets/frontend/pages/scripts/layerslider-init.js"
		type="text/javascript"></script>
	<!-- END LayerSlider -->

	<script src="${URL}assets/frontend/layout/scripts/layout.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		jQuery(document).ready(function() {
			Layout.init();
			Layout.initOWL();
			LayersliderInit.initLayerSlider();
			Layout.initImageZoom();
			Layout.initTouchspin();
			Layout.initTwitter();
			Layout.initUniform();
			
			Layout.initFixHeaderWithPreHeader();
			Layout.initNavScrolling();
		});
	</script>
	<!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>