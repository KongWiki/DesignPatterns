package com.wkk.patterns.strategy.event;

import com.wkk.patterns.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * 直减
 * @author weikunkun
 * @since 2021/4/26
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
