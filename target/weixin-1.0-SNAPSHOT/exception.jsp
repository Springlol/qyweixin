<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.Logger" %>  
<%@page import="java.text.SimpleDateFormat"%>   
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>微信</title>
    <style type="text/css">
    .top{ width: 135px; height:128px; margin: 0 auto; margin-top: 40px;}
    p{ text-align: center; font-family: '微软雅黑 '; font-size: 14px;}
    </style>
</head>
  
  <body>
            <%  
              final  Logger logger = Logger.getLogger(getClass());  
                logger.error(request.getAttribute("exception"));  
            %>
  	<div class="top"><img src="${pageContext.request.contextPath}/images/error.jpg" /></div>
  	<p>对不起，您访问的页面出错了！</p>
  </body>
</html>