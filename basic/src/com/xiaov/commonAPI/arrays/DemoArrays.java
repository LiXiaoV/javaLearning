package com.xiaov.commonAPI.arrays;

import java.util.Arrays;

/**
 * @author xiaov
 * @create_time 2020-10-07 7:49 下午
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray = {2, 1, 3, 10, 6};
        System.out.println(Arrays.toString(intArray));

        //sort默认按照生序排序
        //如果是字符串，sort默认按照字母升序
        //如果是自定义的类型，那么这个自定义的类型需要有Comparable或者Comparator接口的支持
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
