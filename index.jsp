<%-- 
    Document   : index
    Created on : Jun 22, 2019, 5:52:10 PM
    Author     : PC User
--%>

<%@page language="java" contentType="text/html; charset-ISO-8859-1" pageEncoding="ISO-8859-1"%>
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC ""-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CIT360</title>
    <script type="text/javascript">
    function callServlet(methodType){
        document.getElementyById("hellowWorldForm").action."/myservletproject/serv";
        document.getElementById("helloWorldForm").method = methodType;
        document.getElementById("helloWorldForm").submit();
    }
    </script>
    
    </head>
 //   <body>
       // <form id="helloWorldForm">Name: <input type="text" name="uname" width="20"/>
        //    <button type="button" onclick="callServlet('GET')">doGet</button>
        //    <h1<button type="button" onclick="callServlet('POST')">doPost</button>
      //  </form>
//</body>

//</html>
