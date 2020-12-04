package com.xiaov.test;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author xiaov
 * @since 2020-11-03 5:09 下午
 */
public class TestMd5<list1> {
    @Test
    public void testMd5(){
        String str = "";
        String hex = DigestUtils.md5DigestAsHex(str.getBytes());
        System.out.println("hex = " + hex);
        List<Long> list = new ArrayList<>();
        list.add(100000L);
        list.add(300000L);
        list.add(200000L);
        list.add(800000L);
        list.add(400000L);
        list.add(600000L);
        list.sort(Comparator.comparingLong(Long::longValue));
        System.out.println("list = " + list);
        String tempStr = "";
        for (Long aLong : list) {
            tempStr = tempStr + aLong;
        }
        System.out.println("tempStr = " + tempStr);
        System.out.println("DigestUtils.md5DigestAsHex(tempStr.getBytes()) = " + DigestUtils.md5DigestAsHex(tempStr.getBytes()));
    }

    @Test
    public void testOr(){
        Integer viewpermission = 1;
        Integer commentpermission = 2;
        Integer tagpermission = 4;
        Integer mypermission = 3;
        System.out.println("mypermission|viewpermission = " + (mypermission|viewpermission));
        System.out.println("mypermission|commentpermission = " + (mypermission|commentpermission));
        System.out.println("mypermission|tagpermission = " + (mypermission|tagpermission));
    }

}

