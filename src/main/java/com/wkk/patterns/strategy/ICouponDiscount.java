package com.wkk.patterns.strategy;

import java.math.BigDecimal;

/**
 * @author weikunkun
 * @since 2021/4/26
 */
public interface ICouponDiscount<T> {

    /**
     * 优惠券金额计算
     * @param couponInfo  券折扣信息：直减、满减、折扣、N元购
     * @param skuPrice    sku金额
     * @return            优惠后的金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
