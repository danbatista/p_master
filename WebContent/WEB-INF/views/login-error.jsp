<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

    <link href="<c:url value='http://danbatista.com/assets/css/bootstrap.min.css' />" rel="stylesheet">

    <!-- Estilos customizados para esse template -->
    <link href="http://danbatista.com/assets/css/signin.css" rel="stylesheet">
</head>
<body class="text-center">

  
    <form:form  class="form-signin"  method="POST" modelAttribute="usuario" action="getlogin">
   
      <div class="text-center mb-4">
        <img class="mb-4" src="" alt="" width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">Realize seu login</h1>
        <p>Insira seu e-mail e senha nos campos abaixo</p>
          <p style="color:red;">E-mail ou senha inválidos</p>
      </div>

      <div class="form-label-group">
        <form:input type="email" path="email" id="email" class="form-control" placeholder="Endereço de email"  required ="required" autofocus ="autofocus" />
        <label class="sr-only" for="inputEmail">Endereço de email</label>
      </div>

      <div class="form-label-group">
        <form:input type="password" path="senha" id="senha" placeholder="Senha" class="form-control" required="required"/>
        <label class="sr-only" for="inputPassword">Senha</label>
      </div>

      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      <p class="mt-5 mb-3 text-muted text-center">&copy; DD Coding Group - 2019</p>
   </form:form>

</body>
</html>