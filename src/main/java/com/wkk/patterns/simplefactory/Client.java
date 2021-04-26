package com.wkk.patterns.simplefactory;

/**
 * @Time: 20-2-10上午8:26
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        AbstractPay creditcard = PayMethodFactory.getPayMethod("Creditcard");
        creditcard.pay();

    }
}
