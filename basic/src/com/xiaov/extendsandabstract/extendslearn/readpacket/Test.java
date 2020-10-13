package com.xiaov.extendsandabstract.extendslearn.readpacket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-13 5:04 下午
 */
public class Test {
    public static void main(String[] args) {
        QunZhu qunZhu = new QunZhu("群主", 200);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入金额：");
        int money = scanner.nextInt();
        System.out.print("请输入个数：");
        int count = scanner.nextInt();

        //发红包
        ArrayList<Double> sendList = qunZhu.send(money, count);

        // 判断,如果余额不足
        if (sendList == null) {
            System.out.println(" 余额不足...");
            return;
        }

        //创建三个成员
        Member member = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        //打开红包
        member.openHongbao(sendList);
        member2.openHongbao(sendList);
        member3.openHongbao(sendList);

        // 展示信息
        System.out.println(qunZhu.toString());
        System.out.println(member.toString());
        System.out.println(member2.toString());
        System.out.println(member3.toString());
    }
}
