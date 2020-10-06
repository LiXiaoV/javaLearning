package com.xiaov.druid;

import com.xiaov.druid.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xiaov_li
 * @create 2020-07-07 3:40 上午
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        //向user表插入一条记录
        Connection conn = null;
        PreparedStatement pStmt = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "INSERT INTO user VALUES(null,?,?)";
            //3.获取pStmt对象
            pStmt = conn.prepareStatement(sql);
            //4.给？赋值
            pStmt.setString(1,"xiaov");
            pStmt.setString(2,"123456");
            //5.执行sql
            int count = pStmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6. 释放资源
            JDBCUtils.close(pStmt,conn);
        }
    }
}
