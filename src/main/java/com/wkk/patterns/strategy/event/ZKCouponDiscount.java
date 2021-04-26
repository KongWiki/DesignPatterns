package com.wkk.patterns.strategy.event;

import com.wkk.patterns.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * 折扣
 *
 * @author weikunkun
 * @since 2021/4/26
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(new
                BigDecimal(couponInfo).setScale(2, BigDecimal.ROUND_HALF_UP));

        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
