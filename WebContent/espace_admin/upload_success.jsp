<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.app.controller.ModifierlivresController"%>
<%@page import="org.app.controller.LoginController"%>
<%@page import="org.app.beans.User"%>
<%@page import="org.app.beans.Administrateur"%>
<%@page import="org.app.beans.Livre"%>
<%@page import="org.app.service.AdministrateurService"%>
<%@page import="org.app.service.LivreService"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Upload Successful</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/espace_etudiant/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="../css/espace_etudiant/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="../css/espace_etudiant/assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="../css/espace_etudiant/assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="../css/espace_etudiant/assets/lineicons/style.css">     
        
    <!-- Custom styles for this template -->
    <link href="../css/espace_etudiant/assets/css/style.css" rel="stylesheet">
    <link href="../css/espace_etudiant/assets/css/style-responsive.css" rel="stylesheet">

    <script src="../css/espace_etudiant/assets/js/chart-master/Chart.js"></script>
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
            <a href="index.html" class="logo"><b>Espace Admin</b></a>
            <!--logo end-->
                    <!-- settings end -->
                  
                <!--  notification end -->
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="../logout.jsp">Logout</a></li>
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
              
              	  <p class="centered"><a href="profile.html"><img src="../css/espace_etudiant/assets/img/ui-sam.png" class="img-circle" width="60"></a></p>
              	    <h5 class="centered">
					<%
             	    User newuser = (User) session.getAttribute("user");
    				String email = newuser.getEmailUser();
    				AdministrateurService e = new AdministrateurService();
    				Administrateur e1 = e.findByEmail(email);
            		%> 
					<%out.println(e1.getNomAdministrateur());%>
					<%out.println(e1.getPrenomAdministrateur());%>	
					</h5>
                  <li class="mt">
                      <a href="../espace_admin.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>Acceuil</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a class="active" href="javascript:;" >
                          <i class="fa fa-th"></i>
                          <span>Livre</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="rechercher.jsp">Rechercher</a></li>
                          <li><a  href="listelivres.jsp">Liste Des Livres</a></li>
                          <li><a  href="ajouterlivres.jsp">Ajouter Des Livres</a></li>
                          <li><a href="modifierlivres.jsp">Modifier Des Livres</a></li>
                          <li><a href="supprimerlivres.jsp">Supprimer Des Livres</a></li>
						  <li class="active"><a  href="upload.jsp">Uploader</a></li>
						  <li><a  href="download.jsp">Download</a></li>
						  <li><a  href="ajouterprofesseur.jsp">Ajouter Professeur</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Profil</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="afficherprofil.jsp">Afficher Informations</a></li>
                          <li><a  href="modifierprofil.jsp">Modifier Informations</a></li>
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
           		 <div class="row mt"">
              		  <div class="container">
								<div class="row">
<!-- *****************************************************************************************************-->
<br><br><br><br><br><br><br>
					<div class="showback">
      					<h4><i class="fa fa-angle-right"></i> Successful Upload</h4>
							<div class="alert alert-success"><b>Well done!</b> You successfully uploaded a file.</div>     				
      				</div><!-- /showback -->

			
<!-- ************************************************************************************************************-->
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
              </div><!-- /row -->
                  </div><!-- /col-lg-9 END SECTION MIDDLE -->
                  
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  
               

      <!--main content end-->
	  
         <!--footer start-->
	  <br><br><br><br><br><br><br><br><br><br><br><br>
      <footer class="site-footer">
          <div class="text-center">
              2018 - Yassine Hamzaoui - Meryem Rik | SIM
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="../css/espace_etudiant/assets/js/jquery.js"></script>
    <script src="../css/espace_etudiant/assets/js/jquery-1.8.3.min.js"></script>
    <script src="../css/espace_etudiant/assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="../css/espace_etudiant/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="../css/espace_etudiant/assets/js/jquery.scrollTo.min.js"></script>
    <script src="../css/espace_etudiant/assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="../css/espace_etudiant/assets/js/jquery.sparkline.js"></script>
    <!--common script for all pages-->
    <script src="../css/espace_etudiant/assets/js/common-scripts.js"></script>
    <script type="text/javascript" src="../css/espace_etudiant/assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="../css/espace_etudiant/assets/js/gritter-conf.js"></script>
    <!--script for this page-->
    <script src="../css/espace_etudiant/assets/js/sparkline-chart.js"></script>    
	<script src="../css/espace_etudiant/assets/js/zabuto_calendar.js"></script>	
	
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