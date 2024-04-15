<%@ page import="service.HistoryService" %>
<%@ page import="dto.HistoryDto" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>와이파이 정보 구하기</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="GeolocationApi.js"></script>
</head>
<%
    String lat = request.getParameter("lat");
    String lnt = request.getParameter("lnt");

    if (lat != null & lnt != null) {
        HistoryService historyService = new HistoryService();
        HistoryDto historyDto = new HistoryDto();
        
        historyDto.setMY_LAT(Double.parseDouble(lat));
        historyDto.setMY_LNT(Double.parseDouble(lnt));
        historyService.add(historyDto);
    }
%>
<body>
<header>
    <h2>와이파이 정보 구하기</h2>
    <%@ include file="header.jsp" %>
</header>
<form class="inputForm" action="index.jsp" method="get">
    <label for="lat">LAT: </label>
    <input type="text" id="lat" name="lat"
           value=<%= lat==null?"0.0":lat %> onclick="">
    <label for="lnt">, LNT: </label>
    <input type="text" id="lnt" name="lnt"
           value=<%= lnt==null?"0.0":lnt %>>

    <button id="getPositionBtn" type="button" onclick="">내 위치 가져오기</button>
    <button type="submit" onclick="">근처 WIFI 정보 보기</button>
</form>

<%@ include file="result.jsp" %>
</body>
</html>
