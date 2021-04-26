package com.wkk.patterns.strategy.event;

import com.wkk.patterns.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * N元购
 * @author weikunkun
 * @since 2021/4/26
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
