package com.xiaov.test;

import com.xiaov.dao.IUserDao;
import com.xiaov.domain.QueryVo;
import com.xiaov.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author xiaov_li
 * @create 2020-04-22 6:16 上午
 */
public class MybatisTest {
    /**
     * 入门案例
     *
     * @param args
     */
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao iUserDao;

    @Before //用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        iUserDao = sqlSession.getMapper(IUserDao.class);
    }

    @After //用于在测试方法执行之后执行
    public void destroy() throws IOException {
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {

        //5.使用代理对象执行查询方法
        List<User> users = iUserDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 测试保存
     */
    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("mybatis");
        user.setAddress("湖北省武汉市");
        user.setSex("男");
        user.setBirthday(new Date());

        System.out.println("保存前：" + user);
        //5.使用代理对象执行保存方法
        iUserDao.saveUser(user);
        System.out.println("保存后：" + user);
    }

    /**
     * 测试更新
     */
    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(51);
        user.setUsername("xiaov");
        user.setAddress("湖北省武汉市");
        user.setSex("男");
        user.setBirthday(new Date());

        //5.使用代理对象执行更新方法
        iUserDao.updateUser(user);
    }

    /**
     * 测试删除用户
     */
    @Test
    public void testDeleteUser() {

        //5.使用代理对象执行删除方法
        iUserDao.deleteUser(52);
    }

    /**
     * 测试根据用户ID查询用户信息
     */
    @Test
    public void testFindById() {

        //5.使用代理对象执行删除方法
        User user = iUserDao.findById(51);
        if (user != null) {
            System.out.println(user);
        }

    }

    /**
     * 测试根据用户名进行模糊查询
     */
    @Test
    public void testFindByUsername() {

        String username = "王";
        //5.使用代理对象执行删除方法
        List<User> users = iUserDao.findByUsername("%" + username + "%");
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 测试查询用户总数
     */
    @Test
    public void testCountUsers() {

        //5.使用代理对象执行删除方法
        Integer count = iUserDao.countUsers();
        System.out.println(count);

    }

    /**
     * 测试根据QueryVo进行模糊查询
     */
    @Test
    public void testFindByQueryVo() {

        QueryVo queryVo = new QueryVo();
        User user = new User();
        String username = "王";
        user.setUsername("%" + username + "%");
        queryVo.setUser(user);

        //5.使用代理对象执行查询方法
        List<User> users = iUserDao.findByVo(queryVo);
        for (User user1 : users) {
            System.out.println(user1);
        }

    }
}
