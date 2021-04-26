package com.wkk.patterns.strategy.event;

import com.wkk.patterns.strategy.ICouponDiscount;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * 满减
 * @author weikunkun
 * @since 2021/4/26
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    /**
     * 满减计算
     * @param couponInfo  券折扣信息：直减、满减、折扣、N元购
     * @param skuPrice    sku金额
     * @return
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("n");

        // 小于商品金额条件的， 直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;
        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1000);
        BigDecimal b = new BigDecimal(200);
        BigDecimal subtract = a.subtract(b);
        System.out.println(subtract);
    }
}
