package com.xiaov.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author xiaov_li
 * @create 2020-07-07 3:09 上午
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
