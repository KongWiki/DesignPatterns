package com.wkk.patterns.simplefactory;

/**
 * @Time: 20-2-10上午8:19
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class CashPay implements AbstractPay {
    @Override
    public void pay() {
        System.out.println("现金支付");
    }
}
