package com.xiaov.jdbcTemplate;
import com.xiaov.jdbcTemplate.domain.Emp;
import com.xiaov.jdbcTemplate.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xiaov_li
 * @create 2020-07-16 3:11 上午
 */
public class JdbcTemplateDemo1 {
    //1. 导入jar包
    //2. 创建JdbcTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 修改1号数据的 salary 为 10000
     */
    @Test
    public void test1(){
        String sql = "update emp set salary = 10000 where id = 1";
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 添加一条记录
     */
    @Test
    public void test2(){
        String sql = "INSERT into emp(ename,salary,dept_id) VALUES(?,?,?)";
        int count = template.update(sql, "王五", 2000, 2);
        System.out.println(count);

    }

    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3(){
        String sql = "Delete FROM emp where ename = ?";
        int count = template.update(sql, "王五");
        System.out.println(count);
    }


    /**
     * 查询id为1的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4(){
        String sql = "SELECT * FROM emp WHERE id = ?";
        Map<String, Object> empMap = template.queryForMap(sql, 1);
        System.out.println(empMap);
    }

    /**
     * 查询所有记录，将其封装为List
     */
    @Test
    public void test5(){
        String sql = "SELECT * FROM emp";
        List<Map<String, Object>> empList = template.queryForList(sql);
        System.out.println(empList);

        for (Map<String, Object> stringObjectMap : empList) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6(){
        String sql = "SELECT * FROM emp";

        List<Emp> empList = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();

                emp.setId(resultSet.getInt("id"));
                emp.setEname(resultSet.getString("ename"));
                emp.setJob_id(resultSet.getInt("job_id"));
                emp.setMgr(resultSet.getInt("mgr"));
                emp.setJoindate(resultSet.getDate("joindate"));
                emp.setSalary(resultSet.getDouble("salary"));
                emp.setBonus(resultSet.getDouble("bonus"));
                emp.setDept_id(resultSet.getInt("dept_id"));
                return emp;
            }
        });
        System.out.println(empList);

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test7(){
        String sql = "SELECT * FROM emp";
        List<Emp> empList = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        System.out.println(empList);

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

    /**
     * 查询总记录数
     */
    @Test
    public void test8(){
        String sql = "SELECT count(id) FROM emp";
        Long count = template.queryForObject(sql, Long.class);
        System.out.println(count);
    }

    @Test
    public void test9(){
        List<String> list = new ArrayList<String>();
        list.add("草莓");         //向列表中添加数据
        list.add("香蕉");        //向列表中添加数据
        list.add("菠萝");        //向列表中添加数据
        for (int i = 0; i < list.size(); i++) {    //通过循环输出列表中的内容
            System.out.println(i + ":" + list.get(i));
        }
        String o = "草莓";
        System.out.println("list对象中是否包含元素" + o + ":" + list.contains(o));//判断字符串中是否包含指定字符串对象
        System.out.println();
    }
}
