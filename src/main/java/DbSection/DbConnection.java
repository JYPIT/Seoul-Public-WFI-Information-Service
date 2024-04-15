package DbSection;

import ApiSection.SeoulWifiApi;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.sql.*;

public class DbConnection {
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    final String url = "jdbc:sqlite:database/SEOUL_WIFI.db";

    public Connection getConnect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public void close(ResultSet rs, Statement statement, Connection connection) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(ResultSet rs, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dbCreate() {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();

            statement.executeUpdate("drop table if exists information;");
            statement.executeUpdate("create table information (\n" +
                    "X_SWIFI_MGR_NO varchar(15),\n" +
                    "X_SWIFI_WRDOFC varchar(50),\n" +
                    "X_SWIFI_MAIN_NM varchar(50),\n" +
                    "X_SWIFI_ADRES1 varchar(50),\n" +
                    "X_SWIFI_ADRES2 varchar(50),\n" +
                    "X_SWIFI_INSTL_FLOOR varchar(50),\n" +
                    "X_SWIFI_INSTL_TY varchar(50),\n" +
                    "X_SWIFI_INSTL_MBY varchar(50),\n" +
                    "X_SWIFI_SVC_SE varchar(50),\n" +
                    "X_SWIFI_CMCWR varchar(50),\n" +
                    "X_SWIFI_CNSTC_YEAR varchar(10),\n" +
                    "X_SWIFI_INOUT_DOOR varchar(50),\n" +
                    "X_SWIFI_REMARS3 varchar(50),\n" +
                    "LAT integer,\n" +
                    "LNT integer,\n" +
                    "WORK_DTTM date)");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void dbInsert() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String[] columns = {"X_SWIFI_MGR_NO",
                "X_SWIFI_WRDOFC",
                "X_SWIFI_MAIN_NM",
                "X_SWIFI_ADRES1",
                "X_SWIFI_ADRES2",
                "X_SWIFI_INSTL_FLOOR",
                "X_SWIFI_INSTL_TY",
                "X_SWIFI_INSTL_MBY",
                "X_SWIFI_SVC_SE",
                "X_SWIFI_CMCWR",
                "X_SWIFI_CNSTC_YEAR",
                "X_SWIFI_INOUT_DOOR",
                "X_SWIFI_REMARS3",
                "LAT",
                "LNT",
                "WORK_DTTM"};

        try {
            connection = DriverManager.getConnection(url);

            String sql = " insert into information(" +
                    "X_SWIFI_MGR_NO, " +
                    "X_SWIFI_WRDOFC, " +
                    "X_SWIFI_MAIN_NM, " +
                    "X_SWIFI_ADRES1, " +
                    "X_SWIFI_ADRES2, " +
                    "X_SWIFI_INSTL_FLOOR, " +
                    "X_SWIFI_INSTL_TY, " +
                    "X_SWIFI_INSTL_MBY, " +
                    "X_SWIFI_SVC_SE, " +
                    "X_SWIFI_CMCWR, " +
                    "X_SWIFI_CNSTC_YEAR, " +
                    "X_SWIFI_INOUT_DOOR, " +
                    "X_SWIFI_REMARS3, " +
                    "LAT, " +
                    "LNT, " +
                    "WORK_DTTM) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ";

            preparedStatement = connection.prepareStatement(sql);

            SeoulWifiApi seoulWifiApi = new SeoulWifiApi();
            JsonArray jsonArray = seoulWifiApi.get();

            int affected = 0;

            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject object = jsonArray.get(i).getAsJsonObject();
                for (int j = 0; j < columns.length; j++) {
                    if (columns[j].equals("X_SWIFI_MGR_NO")) {
                        preparedStatement.setString(j + 1, object.get(columns[j]).getAsString().replace("-", ""));
                    } else {
                        preparedStatement.setString(j + 1, object.get(columns[j]).getAsString());
                    }
                }
                affected = preparedStatement.executeUpdate();
            }

            if (affected > 0) {
                System.out.println(" 저장 성공 :) ");
            } else {
                System.out.println(" 저장 실패 :( ");
            }

        } catch (Exception e) {
            e.printStackTrace(System.err);
        } finally {
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
