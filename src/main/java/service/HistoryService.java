package service;

import DbSection.DbConnection;
import dto.HistoryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryService extends DbConnection {
    public boolean add(HistoryDto historyDto) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        DbConnection dbConn = new DbConnection();
        try {
            conn = dbConn.getConnect();
            stmt = conn.createStatement();

//            stmt.executeUpdate("drop table if exists history");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS history (" +
                    "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "MY_LAT REAL, " +
                    "MY_LNT REAL, " +
                    "SEARCHED_DATE DATE)"
            );

            String sql = String.format("INSERT INTO history ( MY_LAT, MY_LNT, SEARCHED_DATE) " +
                            "VALUES ( %f, %f, '%s')",
                    historyDto.getMY_LAT(),
                    historyDto.getMY_LNT(),
                    dateFormat.format(today)
            );
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        dbConn.close(rs, stmt, conn);
        return true;
    }

    public List<HistoryDto> getHistory() {
        List<HistoryDto> historyList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        DbConnection dbConn = new DbConnection();
        try {

            conn = dbConn.getConnect();

            String sql = "select * from history order by ID desc";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                HistoryDto historyDto = new HistoryDto();

                Integer id = rs.getInt("ID");
                Double lat = rs.getDouble("MY_LAT");
                Double lnt = rs.getDouble("MY_LNT");
                String date = rs.getString("SEARCHED_DATE");

                historyDto.setID(id);
                historyDto.setMY_LAT(lat);
                historyDto.setMY_LNT(lnt);
                historyDto.setSEARCHED_DATE(date);

                historyList.add(historyDto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        dbConn.close(rs, pstmt, conn);

        return historyList;
    }

    public void deleteHistory(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        DbConnection dbConn = new DbConnection();


        String sql = "DELETE FROM history WHERE ID = ?";

        try {
            conn = dbConn.getConnect();
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        dbConn.close(rs, pstmt, conn);
    }
}
