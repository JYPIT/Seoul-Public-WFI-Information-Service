<%@ page import="dto.WifiInfoDto" %>
<%@ page import="java.util.List" %>
<%@ page import="service.WifiInfoService" %>
<%@ page import="utils.Distance" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Result 페이지</title>
</head>

<%
    WifiInfoService wifiInfoService = new WifiInfoService();
    List<WifiInfoDto> wifiInfoDtoList = wifiInfoService.getWifiInfo();
%>
<body>
<table>
    <thead>
    <tr class="table-col">
        <%
            String[] wifiCol = {"거리(Km)", "관리번호", "자치구", "와이파이명", "도로명주소", "상세주소", "설치위치(층)", "설치유형",
                    "설치기관", "서비스구분", "망종류", "설치년도", "실내외구분", "WIFI 접속환경", "X좌표", "Y좌표", "작업일자"};

            for (String col : wifiCol) {
                out.write("<th > " + col + " </th > ");
            }
        %>
    </tr>
    </thead>
    <tbody>
    <%
        if (lat == null) {
            out.print("<tr >" +
                    "<td class=\"table-annotation\" colspan=\"17\" ><p>위치 정보를 입력한 후에 조회해 주세요.</p></td>" +
                    "</tr>");
        } else {
            for
            (WifiInfoDto wifiInfoDto : wifiInfoDtoList) {
                Distance distance = new Distance();
                double d = distance.getDistance(
                        wifiInfoDto.getLAT(),
                        wifiInfoDto.getLNT(),
                        Double.parseDouble(lat),
                        Double.parseDouble(lnt));
                wifiInfoDto.setDISTANCE(d);
            }

            for (WifiInfoDto wifiInfoDto : wifiInfoDtoList) {
                out.write("<tr>");
                out.write("<td>" +
                        wifiInfoDto.getDISTANCE()
                        + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_MGR_NO() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_WRDOFC() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_MAIN_NM() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_ADRES1() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_ADRES2() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_INSTL_FLOOR() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_INSTL_TY() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_INSTL_MBY() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_SVC_SE() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_CMCWR() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_CNSTC_YEAR() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_INOUT_DOOR() + "</td>");
                out.write("<td>" + wifiInfoDto.getX_SWIFI_REMARS3() + "</td>");
                out.write("<td>" + wifiInfoDto.getLAT() + "</td>");
                out.write("<td>" + wifiInfoDto.getLNT() + "</td>");
                out.write("<td>" + wifiInfoDto.getWORK_DTTM() + "</td>");
            }
        }
    %>
    </tbody>
</table>
</body>
</html>