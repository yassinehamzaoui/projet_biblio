<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>
<link href="css/login/style.css" rel="stylesheet" type="text/css" />
	<meta charset="UTF-8">
	<link rel="icon" type="image/png" href="css/login/images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="css/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="css/login/util.css">
	<link rel="stylesheet" type="text/css" href="css/login/main.css">
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
					<span class="login100-form-title-1">
						Register
					</span>
				</div>
				<p style="font-size:50px;padding-left:40px;padding-top:20px;margin-left:80px;color:#FF0000">Erreur veuillez réessayer</p>
				<form class="login100-form validate-form" method="post" action="RegisterController">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Nom</span>
						<input class="input100" type="text" name="Nom" placeholder="Entrer vote nom">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Prenom</span>
						<input class="input100" type="text" name="Prenom" placeholder="Entrer votre prénom">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Adresse</span>
						<input class="input100" type="text" name="Adresse" placeholder="Entrer votre adresse">
						<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Email</span>
						<input class="input100" type="text" name="Email" placeholder="Entrer votre email">
						<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="Pass" placeholder="Entrer password">
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
					<!-- 	<button class="login100-form-btn">Login</button> -->
					<input class="login100-form-btn" type="submit" value="Validate"/>
					</div>
				</form>
				<div class="pp" style="padding-bottom:50px;margin-top:-142px">
					<form action="login.jsp">
   					<input class="login100-form-btn" style="margin-left:400px;margin-bottom:80px" type="submit" value="Back"/>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="css/login/js/main.js"></script>

</body>
</html>