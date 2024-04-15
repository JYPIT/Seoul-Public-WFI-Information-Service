<%@ page import="service.HistoryService" %>
<%@ page import="java.util.List" %>
<%@ page import="dto.HistoryDto" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>위치 히스토리 목록</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        function callJavaFunction(ID) {
            // Ajax 요청을 통해 서버의 Java 함수 호출
            $.ajax({
                url: 'http://localhost:8080/history.jsp', // 호출할 서블릿 또는 컨트롤러의 URL
                type: 'POST', // HTTP 요청 방식 (POST 또는 GET)
                data: {
                    id: ID
                },
                success: function (response) {
                    location.replace(`history.jsp?id=${ID}`);
                },
                error: function () {
                    alert('Error occurred while calling Java function.');
                    // 오류 처리 등의 후속 작업 수행
                }
            });
        }
    </script>
</head>
<%
    HistoryService historyService = new HistoryService();
    List<HistoryDto> historyList = historyService.getHistory();

    if (request.getParameter("id") != null) {
        int historyId = Integer.parseInt(request.getParameter("id"));
        if (historyId > 0) {
            historyService.deleteHistory(historyId);
        }
    }
%>
<body>
<header>
    <h2>위치 히스토리 목록</h2>
    <%@ include file="header.jsp" %>
</header>
<table>
    <thead>
    <tr class="table-col">
        <th>ID</th>
        <th>X 좌표</th>
        <th>Y 좌표</th>
        <th>조회일자</th>
        <th>비고</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (HistoryDto history : historyList) {
            out.write("<tr>");
            out.write("<td>" + history.getID() + "</td>");
            out.write("<td>" + history.getMY_LAT() + "</td>");
            out.write("<td>" + history.getMY_LNT() + "</td>");
            out.write("<td>" + history.getSEARCHED_DATE() + "</td>");
            out.write("<td><button onclick=callJavaFunction(" + history.getID() + ")>삭제</button></td>");
            out.write("</tr>");
        }
    %>
    </tbody>
</table>
</body>
</html>