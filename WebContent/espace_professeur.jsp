<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.app.controller.LoginController"%>
<%@page import="org.app.beans.User"%>
<%@page import="org.app.beans.Professeur"%>
<%@page import="org.app.service.ProfesseurService"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Espace Professeur</title>
    <!-- Bootstrap core CSS -->
    <link href="css/espace_etudiant/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="css/espace_etudiant/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="css/espace_etudiant/assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="css/espace_etudiant/assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="css/espace_etudiant/assets/lineicons/style.css">    
    <!-- Custom styles for this template -->
    <link href="css/espace_etudiant/assets/css/style.css" rel="stylesheet">
    <link href="css/espace_etudiant/assets/css/style-responsive.css" rel="stylesheet">
    <script src="css/espace_etudiant/assets/js/chart-master/Chart.js"></script>
  </head>
  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="espace_etudiant.jsp" class="logo"><b>Espace Professeur</b></a>
            <!--logo end-->
                    <!-- settings end -->
                  
                <!--  notification end -->
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="logout.jsp">Logout</a></li>
            	</ul>
            </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="css/espace_etudiant/assets/img/ui-sam.png" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">
					<%
             	    User newuser = (User) session.getAttribute("user");
    				String email = newuser.getEmailUser();
    				ProfesseurService e = new ProfesseurService();
    				Professeur e1 = e.findByEmail(email);
            		%>
					<%out.println(e1.getNomProfesseur());%>
					<%out.println(e1.getPrenomProfesseur());%>	
					</h5>
              	  	
                  <li class="mt">
                      <a class="active" href="espace_professeur.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>Acceuil</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-th"></i>
                          <span>Livre</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="espace_professeur/rechercher.jsp">Rechercher</a></li>
                          <li><a  href="espace_professeur/listelivres.jsp">Liste Des Livres</a></li>
                          <li><a  href="espace_professeur/ajouterlivres.jsp">Ajouter Des Livres</a></li>
						  <li><a  href="espace_professeur/upload.jsp">Uploader</a></li>
						  <li><a  href="espace_professeur/download.jsp">Download</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Profil</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="espace_professeur/afficherprofil.jsp">Afficher Informations</a></li>
                          <li><a  href="espace_professeur/modifierprofil.jsp">Modifier Informations</a></li>
                      </ul>
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="col-lg-12">
                  <div class="form-panel" style="font-size:50px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				  &nbsp;&nbsp;&nbsp;&nbsp;Welcome&nbsp;&nbsp;Prof&nbsp;&nbsp;<%out.println(e1.getNomProfesseur());%>&nbsp;<%out.println(e1.getPrenomProfesseur());%></div></div>
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  <div class="col-lg-3 ds">
                    <!--COMPLETED ACTIONS DONUTS CHART-->
						<h3>Calendrier</h3>
                        <!-- CALENDAR-->
                        <div id="calendar" class="mb">
                            <div class="panel green-panel no-margin">
                                <div class="panel-body">
                                    <div id="date-popover" class="popover top" style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                        <div class="arrow"></div>
                                        <h3 class="popover-title" style="disadding: none;"></h3>
                                        <div id="date-popover-content" class="popover-content"></div>
                                    </div>
                                    <div id="my-calendar"></div>
                                </div>
                            </div>
                        </div><!-- / calendar -->
                      
                  </div><!-- /col-lg-3 -->
              </div>
          </section>
		  
      </section>
      <!--main content end-->
      <!--footer start-->
	  <br>
      <footer class="site-footer">
          <div class="text-center">
              2018 - Yassine Hamzaoui - Meryem Rik | SIM
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="css/espace_etudiant/assets/js/jquery.js"></script>
    <script src="css/espace_etudiant/assets/js/jquery-1.8.3.min.js"></script>
    <script src="css/espace_etudiant/assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="css/espace_etudiant/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="css/espace_etudiant/assets/js/jquery.scrollTo.min.js"></script>
    <script src="css/espace_etudiant/assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="css/espace_etudiant/assets/js/jquery.sparkline.js"></script>
    <!--common script for all pages-->
    <script src="css/espace_etudiant/assets/js/common-scripts.js"></script>
    <script type="text/javascript" src="css/espace_etudiant/assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="css/espace_etudiant/assets/js/gritter-conf.js"></script>
    <!--script for this page-->
    <script src="css/espace_etudiant/assets/js/sparkline-chart.js"></script>    
	<script src="css/espace_etudiant/assets/js/zabuto_calendar.js"></script>	
	
	<script type="text/javascript">
        $(document).ready(function () {
        var unique_id = $.gritter.add({
            // (string | mandatory) the heading of the notification
            title: 'Welcome to e-bilbio',
            // (string | mandatory) the text inside the notification
            text: 'Welcome to your profile',
            // (string | optional) the image to display on the left
            image: 'css/espace_etudiant/assets/img/ui-sam.png',
            // (bool | optional) if you want it to fade out on its own or just sit there
            sticky: true,
            // (int | optional) the time you want it to be alive for before fading out
            time: '',
            // (string | optional) the class name you want to apply to that specific message
            class_name: 'my-sticky-class'
        });

        return false;
        });
	</script>
	
	<script type="application/javascript">
        $(document).ready(function () {
            $("#date-popover").popover({html: true, trigger: "manual"});
            $("#date-popover").hide();
            $("#date-popover").click(function (e) {
                $(this).hide();
            });
        
            $("#my-calendar").zabuto_calendar({
                action: function () {
                    return myDateFunction(this.id, false);
                },
                action_nav: function () {
                    return myNavFunction(this.id);
                },
                ajax: {
                    url: "show_data.php?action=1",
                    modal: true
                },
                legend: [
                    {type: "text", label: "Special event", badge: "00"},
                    {type: "block", label: "Regular event", }
                ]
            });
        });
        
        
        function myNavFunction(id) {
            $("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
        }
    </script>
  

  </body>
</html>