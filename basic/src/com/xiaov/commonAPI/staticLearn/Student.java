package com.xiaov.commonAPI.staticLearn;

/**
 * @author xiaov
 * @create_time 2020-10-07 5:16 下午
 */
public class Student {
    /**
     * id
     */
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * id计数
     */
    private static int idCount = 0;

    public Student() {
        this.id = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
