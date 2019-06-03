<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.app.controller.AdvancedSearchController"%>
<%@page import="org.app.beans.Livre"%>
<%@ page import ="java.util.List"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rechercher</title>
	<meta charset="utf-8">
	<title>e-biblio</title>
	<link rel="stylesheet" href="css/recherche/bootstrap.min.css">
	<link rel="stylesheet" href="css/home/font-awesome.min.css">
	<link rel="stylesheet" href="css/home/animate.min.css">
	<link rel="stylesheet" href="css/home/default.css">
	<link rel="stylesheet" href="css/home/style.css">
	<link rel="stylesheet" href="css/recherche/style.css">
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,300,500' rel='stylesheet' type='text/css'>
</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">

<!-- navigation section -->
<section class="navbar navbar-fixed-top custom-navbar" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand"  style="font-size:18px;color:#ffffff">E-bilbio</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="espace_public.jsp" style="font-size:18px;color:#ffffff">HOME</a></li>
				<li><a href="recherche.jsp" style="font-size:18px;color:#ffffff">RECHERCHE</a></li>
				<li><a href="news.jsp" style="font-size:18px;color:#ffffff">NEWS</a></li>
				<li><a href="register.jsp" style="font-size:18px;color:#ffffff">INSCRIPTION</a></li>
			</ul>
		</div>
	</div>
</section>
<!-- home section -->
<section id="home">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<p style = "font-size:50px">Rechercher</p><br><br><br>
				<p style = "font-size:15px">Entrez livre à chercher avec les options suivantes :</p>
                </div>
				<hr>
				<%String msg = (String)session.getAttribute("msg");%><%out.println(msg);%>
				<div class="search">
				<form id="searchthis"  method="post" action="AdvancedSearchController" style="display:inline;">
				<input id="namanyay-search-box" name="motderecherche" size="40" type="text" placeholder="Search..." required/>
				<input type="radio" name="radios" value="cherchertitre"><label>Titre</label>
				<input type="radio" name="radios" value="chercherauteur"><label>Auteur</label>
				<input type="radio" name="radios" value="cherchertheme"><label>Theme</label>
				<input type="radio" name="radios" value="cherchelangue"><label>Langue</label>
				<input id="namanyay-search-btn" value="Search" type="submit"/>
				</form>
				</div>
			</div>
		</div>
	</div>		
</section>
<div style="margin-left:500px;margin-right:500px;font-size:17px;">
<br><br>
<% List<Livre> list = (List<Livre>)session.getAttribute("listbook");
                     for (Livre u : list) {%>
                   <%=u.toString()%>
                   <br><hr>
                 <%}%>
</div>
<div class="container">
<div class="row">
</div>
</div>

<!-- footer section -->
<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<p>Copyright © Yassine HAMZAOUI | Meryem RIK | SIM | 2017-2018</p>
				<hr>
			</div>
		</div>
	</div>
</footer>
<script src="css/espace_public/js/jquery.js"></script>
<script src="css/espace_public/js/bootstrap.min.js"></script>
<script src="css/espace_public/js/smoothscroll.js"></script>
<script src="css/espace_public/js/isotope.js"></script>
<script src="css/espace_public/js/imagesloaded.min.js"></script>
<script src="css/espace_public/js/nivo-lightbox.min.js"></script>
<script src="css/espace_public/js/jquery.backstretch.min.js"></script>
<script src="css/espace_public/js/wow.min.js"></script>
<script src="css/espace_public/js/custom.js"></script>
</body>
</html>