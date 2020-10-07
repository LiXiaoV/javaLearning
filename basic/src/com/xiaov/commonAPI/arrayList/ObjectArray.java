package com.xiaov.commonAPI.arrayList;

/**
 * @author xiaov
 * @create_time 2020-10-06 9:22 下午
 */

/**
 * 缺点：长度固定
 */
public class ObjectArray {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("xiaoming", 18);
        arr[1] = new Person("xiaohong", 19);
        arr[2] = new Person("xiaov", 23);
        System.out.println(arr);
        System.out.println(arr[2].toString());
    }
}
