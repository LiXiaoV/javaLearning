package com.xiaov.extendsandabstract.extendslearn.readpacket;

/**
 * @author xiaov
 * @create_time 2020-10-13 4:45 下午
 */
public class User {

    // 成员变量

    /**
     * 用户名
     */
    private String username;

    /**
     * 余额
     */
    private double leftMoney;

    public User() {
    }

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", leftMoney=" + leftMoney +
                '}';
    }
}
