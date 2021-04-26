package com.wkk.patterns.strategy;

import java.math.BigDecimal;

/**
 * @author weikunkun
 * @since 2021/4/26
 */
public class Context<T> {
    /**
     * 折扣策略
     */
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * 不同折扣策略执行不同打折
     * @param couponInfo
     * @param skuPrice
     * @return
     */
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
