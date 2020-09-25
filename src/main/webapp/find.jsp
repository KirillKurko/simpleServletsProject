<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Find Value</title>
        <link rel="stylesheet" href="resources/css/style.css" type="text/css">
    </head>
    <body>
        <% String value = (String)request.getAttribute("value"); %>
        <div class="login-page">
            <div class="form">
                <form class="login-form" action="controller" method="post">
                    <input type="text" placeholder="key" name="key"/>
                    <input type='<% out.print(value != null ? "text" : "hidden"); %>' placeholder="value" value='<% out.print(value != null ? value : "not found"); %>'>
                    <button name="findButton">Search</button>
                </form>
            </div>
        </div>
         <div class="login-page">
             <div class="form">
                 <form class="login-form" action="controller" method="post">
                    <button name="backButton">Back</button>
                 </form>
             </div>
         </div>
    </body>
</html>