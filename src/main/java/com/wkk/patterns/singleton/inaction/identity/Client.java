package com.wkk.patterns.singleton.inaction.identity;

/**
 * @Time: 20-2-9上午10:07
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        IdentitiyCardInfo info1, info2;
        info1 = IdentitiyCardInfo.getInstance();
        info2 = IdentitiyCardInfo.getInstance();

//        System.out.println("身份证号码是否一致: " + (info1 == info2));
//        String a1, a2;
//        a1 = info1.getNum();
//        a2 = info2.getNum();
//        System.out.println("info1的身份证号码为: " + a1);
//        System.out.println("info2的身份证号码为: " + a2);
//        System.out.println("内容是否相同: " + a1.equalsIgnoreCase(a2));
//        System.out.println("是否是相同对象: " + (a1 == a2));

    }
}
