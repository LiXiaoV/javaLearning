package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 4:36 下午
 */
public class ConcatTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] array = {};

        System.out.println(formatConvert(arr));
        System.out.println(formatConvert(array));
    }

    public static String formatConvert(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str.concat(String.valueOf(arr[i]));
            } else {
                str = str.concat(String.valueOf(arr[i]) + "#");
            }
        }
        str = str.concat("]");
        return str;
    }
}
