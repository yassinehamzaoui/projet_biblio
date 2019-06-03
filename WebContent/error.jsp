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
						Sign In
					</span>
				</div>
				<p style="font-size:20px;margin-left:160px;color:#ff0000">Email ou Pass Incorrect, Réessayer SVP ! </p>
				<form class="login100-form validate-form" method="post" action="LoginController">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Email</span>
						<input class="input100" type="text" name="username" placeholder="Entrer Email">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="pass" placeholder="Entrer password">
						<span class="focus-input100"></span>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Se sourvenir de moi
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Password oublié ?
							</a>
						</div>
					</div>
					<div class="container-login100-form-btn">
					<!-- 	<button class="login100-form-btn">Login</button> -->
					<input class="login100-form-btn" type="submit" value="Login"/>
					</div>
				</form>
				<div class="pp" style="padding-bottom:50px;margin-top:-142px">
					<form action="register.jsp">
   					<input class="login100-form-btn" style="margin-left:400px;margin-bottom:30px" type="submit" value="Register"/>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="css/login/js/main.js"></script>

</body>
</html>