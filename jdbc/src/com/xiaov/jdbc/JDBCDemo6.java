package com.xiaov.jdbc;

import java.sql.*;

/**
 * @author xiaov_li
 * @create 2020-07-04 4:39 下午
 *
 * 执行查询account表
 */
public class JDBCDemo6 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "liwei666");
             String sql = "SELECT * FROM account";
             stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);
             while (rs.next()){
                 int id = rs.getInt(1);
                 String name = rs.getString("name");
                 Double balance = rs.getDouble(3);
                 System.out.println(id+" "+name+" "+ balance);
             }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
