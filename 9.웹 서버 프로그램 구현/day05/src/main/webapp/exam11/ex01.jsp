<%@ page contentType="text/html; charter=UTF-8" %>
<%
    Cookie cookie1 = new Cookie("key1", "link1" );
    response.addCookie(cookie1);
    Cookie cookie2 = new Cookie("key2", "value2");
    response.addCookie(cookie2);
%>