<%-- 
    Document   : all
    Created on : Feb 27, 2014, 10:38:53 AM
    Author     : Trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Recommendations</title>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#BooksTable').dataTable();
            });
        </script>
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h2>Latest Recommendations</h2>
            </div>
            <table class="table table-hover dataTable" id="BooksTable">
                <thead>
                    <tr>
                        <th>Sender</th>
                        <th>Book Title</th>
                        <th>Author</th>
                        <th>Category</th>
                        <th>Cover</th>
                        <th>Rating</th>
                        <th>Comment</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="books">
                        <tr>
                            <td><s:property value="sender"/></td>
                            <td><s:property value="title"/></td>
                            <td><s:property value="author"/></td>
                            <td><s:property value="category"/></td>
                            <td><img width="200px" src="<s:property value="cover"/>"/></td>
                            <td><s:property value="rating"/></td>
                            <td><a href="#" id="comment<s:property value="id"/>" class="btn btn-success" data-toggle="popover" data-placement="top" 
                                   data-content="<s:property value="comment"/>">Click to see comment</a></td>
                        </tr>
                    <script type="text/javascript">
                        $('#comment<s:property value="id"/>').popover();
                    </script>
                </s:iterator>
                </tbody>
            </table>
        </div>
    </body>

</html>
