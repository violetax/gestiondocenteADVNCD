<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<main class="container-fluid">
	<section class="row">
		<header><h2>Login</h2></header>
		<c:if test="${param.error != null}">
			<div class="alert alert-danger">
				<p>Nombre de usuario o contraseña incorrectos.</p>
			</div>
		</c:if>
		<c:if test="${param.logout != null}">
			<div class="alert alert-success">
				<p>Se ha deslogueado correctamente.</p>
			</div>
		</c:if>
		<c:url var="loginURL" value="/login"/>
		<div class="">
			<form:form id="loginform" class="form-horizontal" role="form" action="${loginURL}" method="post">
				<div class="input-group">
	            	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
	                <input class="form-control" value="${SPRING_SECURITY_LAST_USERNAME}" type="text" id="userId" name="userId" required />                                        
	          	</div>
				<div class="input-group">
					<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
					<input class="form-control" type="password" id="password" name="password" required/>
				</div>
				<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
				
				<button  class="btn btn-block btn-primary">Log In</button>
			</form:form>
		</div>
	</section>
</main>
