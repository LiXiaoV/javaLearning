package com.xiaov.test;

import com.xiaov.dao.AccountDao;
import com.xiaov.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        
        //回去代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //查询所有数据
        List<Account> list = accountDao.findAll();

        for (Account account : list) {
            System.out.println(account.toString());
        }

        //关闭资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //回去代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //保存
        Account account = new Account();
        account.setName("小马");
        account.setMoney((double) 600);
        accountDao.saveAccount(account);

        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();
    }
}
