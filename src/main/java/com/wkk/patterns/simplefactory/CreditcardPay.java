package com.wkk.patterns.simplefactory;

import javax.swing.*;

/**
 * @Time: 20-2-10上午8:19
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class CreditcardPay implements AbstractPay {
    @Override
    public void pay() {
        System.out.println("信用卡支付");
    }
}
