<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="DbSection.DbConnection" %>
<%@ page import="dto.WifiInfoDto" %>
<%@ page import="java.util.List" %>
<%@ page import="dto.WifiInfoDto" %>
<%@ page import="dto.WifiInfoDto" %>
<%@ page import="service.WifiInfoService" %>
<%@ page import="service.HistoryService" %>
<%@ page import="dto.HistoryDto" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>와이파이 정보 가져오기</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="load-Wifi">
    <%
        DbConnection dbConn = new DbConnection();
        dbConn.dbCreate();
        dbConn.dbInsert();

        WifiInfoService wifiInfoService = new WifiInfoService();
        List<WifiInfoDto> wifiInfoDtoList = wifiInfoService.getWifiInfo();

        out.write("<h2>" + wifiInfoDtoList.size() + "개의 WIFI 정보를 정상적으로 저장하였습니다.</h2>");
    %>

    <a href="/">홈으로 가기</a>
</div>
</body>
</html>