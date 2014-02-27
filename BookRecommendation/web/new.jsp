<%-- 
    Document   : new
    Created on : Feb 27, 2014, 12:37:34 PM
    Author     : Trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Recommendation</title>
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h2>New Recommendation</h2>
            </div>
            <s:form action="insert-recommendation" method="post" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
                <s:textfield label="Sender" name="sender"/>
                <s:textfield label="Book Title" name="title"/>
                <s:textfield label="Author" name="author"/>
                <s:textfield label="Category" name="category"/>
                <s:file label="Cover" name="cover"/>
                <s:textfield label="Rating" name="raing"/>
                <s:textarea label="Comment" rows="5" name="comment"/>
                <s:submit cssClass="btn btn-primary"/>
            </s:form>
        </div>
    </body>
</html>
