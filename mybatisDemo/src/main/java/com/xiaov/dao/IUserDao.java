package com.xiaov.dao;

import com.xiaov.domain.QueryVo;
import com.xiaov.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户的持久层接口
 *
 * @author xiaov_li
 * @create 2020-04-20 4:08 上午
 */
public interface IUserDao {
    /**
     * 查询所有操作
     *
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     *
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据ID删除用户
     *
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 根据用户名进行模糊查询
     *
     * @param username
     * @return
     */
    List<User> findByUsername(String username);

    /**
     * 查询用户总数
     *
     * @return
     */
    Integer countUsers();

    /**
     * 根据QueryVo进行模糊查询
     *
     * @param username
     * @return
     */
    List<User> findByVo(QueryVo queryVo);
}
