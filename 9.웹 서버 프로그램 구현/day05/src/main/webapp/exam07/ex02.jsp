<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="num1" value="10000000000" />

<fmt:formatNumber value="${num1}" />
<fmt:formatNumber value="${num1}" groupingUsed="false"/><br>

type - percent : <fmt:formatNumber value="0.25" type="percent" /><br>
type - current : <fmt:formatNumber value="10000" type="currency" /><br>