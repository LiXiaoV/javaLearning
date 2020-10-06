package com.xiaov.dao;

import com.xiaov.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户Dao
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("SELECT * FROM account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("INSERT INTO account(name , money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
