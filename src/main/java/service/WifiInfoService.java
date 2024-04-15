package service;

import DbSection.DbConnection;
import dto.WifiInfoDto;
import utils.Distance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WifiInfoService extends DbConnection {
    public List<WifiInfoDto> getWifiInfo() {
        List<WifiInfoDto> wifiInfoList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        DbConnection dbConn = new DbConnection();
        try {

            conn = dbConn.getConnect();

            String sql = "select * from information";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                WifiInfoDto wifiInfoDto = new WifiInfoDto();

                String X_SWIFI_MGR_NO = rs.getString("X_SWIFI_MGR_NO");
                String X_SWIFI_WRDOFC = rs.getString("X_SWIFI_WRDOFC");
                String X_SWIFI_MAIN_NM = rs.getString("X_SWIFI_MAIN_NM");
                String X_SWIFI_ADRES1 = rs.getString("X_SWIFI_ADRES1");
                String X_SWIFI_ADRES2 = rs.getString("X_SWIFI_ADRES2");
                String X_SWIFI_INSTL_FLOOR = rs.getString("X_SWIFI_INSTL_FLOOR");
                String X_SWIFI_INSTL_TY = rs.getString("X_SWIFI_INSTL_TY");
                String X_SWIFI_INSTL_MBY = rs.getString("X_SWIFI_INSTL_MBY");
                String X_SWIFI_SVC_SE = rs.getString("X_SWIFI_SVC_SE");
                String X_SWIFI_CMCWR = rs.getString("X_SWIFI_CMCWR");
                String X_SWIFI_CNSTC_YEAR = rs.getString("X_SWIFI_CNSTC_YEAR");
                String X_SWIFI_INOUT_DOOR = rs.getString("X_SWIFI_INOUT_DOOR");
                String X_SWIFI_REMARS3 = rs.getString("X_SWIFI_REMARS3");
                Double LAT = rs.getDouble("LAT");
                Double LNT = rs.getDouble("LNT");
                String WORK_DTTM = rs.getString("WORK_DTTM");

                wifiInfoDto.setX_SWIFI_MGR_NO(X_SWIFI_MGR_NO);
                wifiInfoDto.setX_SWIFI_WRDOFC(X_SWIFI_WRDOFC);
                wifiInfoDto.setX_SWIFI_MAIN_NM(X_SWIFI_MAIN_NM);
                wifiInfoDto.setX_SWIFI_ADRES1(X_SWIFI_ADRES1);
                wifiInfoDto.setX_SWIFI_ADRES2(X_SWIFI_ADRES2);
                wifiInfoDto.setX_SWIFI_INSTL_FLOOR(X_SWIFI_INSTL_FLOOR);
                wifiInfoDto.setX_SWIFI_INSTL_TY(X_SWIFI_INSTL_TY);
                wifiInfoDto.setX_SWIFI_INSTL_MBY(X_SWIFI_INSTL_MBY);
                wifiInfoDto.setX_SWIFI_SVC_SE(X_SWIFI_SVC_SE);
                wifiInfoDto.setX_SWIFI_CMCWR(X_SWIFI_CMCWR);
                wifiInfoDto.setX_SWIFI_CNSTC_YEAR(X_SWIFI_CNSTC_YEAR);
                wifiInfoDto.setX_SWIFI_INOUT_DOOR(X_SWIFI_INOUT_DOOR);
                wifiInfoDto.setX_SWIFI_REMARS3(X_SWIFI_REMARS3);
                wifiInfoDto.setLAT(LAT);
                wifiInfoDto.setLNT(LNT);
                wifiInfoDto.setWORK_DTTM(WORK_DTTM);

                wifiInfoList.add(wifiInfoDto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        dbConn.close(rs, pstmt, conn);

        return wifiInfoList;
    }

    public List<WifiInfoDto> joinNearWifiInfo(String lat, String lnt) {
        List<WifiInfoDto> nearWifiInfoList = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        DbConnection dbConn = new DbConnection();
        try {

            conn = dbConn.getConnect();
            stmt = conn.createStatement();

            stmt.executeUpdate(" alter table information add column DISTANCE");

            while (rs.next()) {
                WifiInfoDto wifiInfoDto = new WifiInfoDto();
                Distance distance = new Distance();

                double latRS = rs.getDouble("LAT");
                double lntRS = rs.getDouble("LNT");

                double distanceValue = distance.getDistance(
                        latRS,
                        lntRS,
                        Double.parseDouble(lat),
                        Double.parseDouble(lnt));

                String updateSql = "UPDATE information SET DISTANCE = ? WHERE LAT = ? AND LNT = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateSql);
                updateStmt.setDouble(1, distanceValue);
                updateStmt.setDouble(2, latRS);
                updateStmt.setDouble(3, lntRS);

                updateStmt.executeUpdate();

                wifiInfoDto.setDISTANCE(distanceValue);
                wifiInfoDto.setX_SWIFI_MGR_NO(rs.getString("X_SWIFI_MGR_NO"));
                wifiInfoDto.setX_SWIFI_WRDOFC(rs.getString("X_SWIFI_WRDOFC"));
                wifiInfoDto.setX_SWIFI_MAIN_NM(rs.getString("X_SWIFI_MAIN_NM"));
                wifiInfoDto.setX_SWIFI_ADRES1(rs.getString("X_SWIFI_ADRES1"));
                wifiInfoDto.setX_SWIFI_ADRES2(rs.getString("X_SWIFI_ADRES2"));
                wifiInfoDto.setX_SWIFI_INSTL_FLOOR(rs.getString("X_SWIFI_INSTL_FLOOR"));
                wifiInfoDto.setX_SWIFI_INSTL_TY(rs.getString("X_SWIFI_INSTL_TY"));
                wifiInfoDto.setX_SWIFI_INSTL_MBY(rs.getString("X_SWIFI_INSTL_MBY"));
                wifiInfoDto.setX_SWIFI_SVC_SE(rs.getString("X_SWIFI_SVC_SE"));
                wifiInfoDto.setX_SWIFI_CMCWR(rs.getString("X_SWIFI_CMCWR"));
                wifiInfoDto.setX_SWIFI_CNSTC_YEAR(rs.getString("X_SWIFI_CNSTC_YEAR"));
                wifiInfoDto.setX_SWIFI_INOUT_DOOR(rs.getString("X_SWIFI_INOUT_DOOR"));
                wifiInfoDto.setX_SWIFI_REMARS3(rs.getString("X_SWIFI_REMARS3"));
                wifiInfoDto.setLAT(rs.getDouble("LAT"));
                wifiInfoDto.setLNT(rs.getDouble("LNT"));
                wifiInfoDto.setWORK_DTTM(rs.getString("WORK_DTTM"));

                nearWifiInfoList.add(wifiInfoDto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        dbConn.close(rs, stmt, conn);

        return nearWifiInfoList;
    }
}
