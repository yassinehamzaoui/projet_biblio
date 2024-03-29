<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.app.controller.LoginController"%>
<%@page import="org.app.beans.User"%>
<%@page import="org.app.beans.Administrateur"%>
<%@page import="org.app.beans.Livre"%>
<%@page import="org.app.service.AdministrateurService"%>
<%@page import="org.app.service.LivreService"%>
<%@page import="org.app.controller.UploadController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Upload 2</title>

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
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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
                          <li><a href="ajouterlivres.jsp">Ajouter Des Livres</a></li>
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
          <section class="wrapper2">
                      <div class="row mt"">
                      <!--CUSTOM CHART START -->
                      <div style="margin-left:500px">
                      </div>
					</div><!-- /row -->	
					
			<%
			String nomlivre5 = (String)session.getAttribute("nomlivre7");
			out.println(nomlivre5);
			LivreService bookservice = new LivreService();
			Livre livre2 = null;
			livre2 = bookservice.findByName(nomlivre5);
			%>
						  	<!-- BASIC FORM ELELEMNTS -->
          	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i></i> Form Upload</h4>
                      <form class="form-horizontal style-form" method="post" action="${pageContext.request.contextPath}/espace_admin/UploadAdminController" encType="multipart/form-data">
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Titre (Nom du fichier)</label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control round-form" name="titrelivre" value="<%out.print(livre2.getTitreLivre());%>">
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Auteur</label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control round-form" name="auteurlivre" value="<%out.print(livre2.getAuteurLivre());%>" disabled>
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Th�me</label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control round-form" name="themelivre" value="<%out.print(livre2.getThemeLivre());%>" disabled>
                              </div>
                          </div>
                           <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Langue</label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control round-form" name="languelivre" value="<%out.print(livre2.getLangueLivre());%>" disabled>
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Date de parution</label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control round-form " name="Dateparution" value="<%out.print(livre2.getDateParution());%>" disabled>
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Nombre de page</label>
                              <div class="col-sm-10">
                                 <input type="text" class="form-control round-form" name="Nbrpage" value="<%out.print(livre2.getNbrPageLivre());%>" disabled>
                              </div>
                          </div>
                     
					  <div class="upload-btn-wrappern"><br>
					    <input type="file" name="file" value="select files ..."/><br><br>
					    <input class="btnn" type="submit" value="upload"/><br><br>
					  </div>
                  </div>
                   </form><br>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
          	
                      </div><!-- /content-panel -->
					 
                  </div><!-- /col-md-12 -->
              </div><!-- /row -->
                  </div><!-- /col-lg-9 END SECTION MIDDLE -->
                  
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  
                  
               

      <!--main content end-->
	  
              
      <!--footer start-->
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