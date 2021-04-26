package com.wkk.patterns.simplefactory;

/**
 * @Time: 20-2-10上午8:21
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class PayMethodFactory {
    public static AbstractPay getPayMethod(String type) {
        if (type.equalsIgnoreCase("cash")) {
            return new CashPay();
        } else if (type.equalsIgnoreCase("creditcard")) {
            return new CreditcardPay();
        }
        return null;
    }
}
