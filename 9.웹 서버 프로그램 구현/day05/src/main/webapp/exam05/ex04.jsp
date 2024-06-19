<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="C" uri="jakarta.tags.core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${param.age < 8}">
        유치원
    </c:when>
    <c:when test="${param.age < 14}">
        초등학생
    </c:when>
    <c:when test="${param.age < 17}">
        중학생
    </c:when>
    <c:when test="${param.age < 20}">
        고등학생
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>