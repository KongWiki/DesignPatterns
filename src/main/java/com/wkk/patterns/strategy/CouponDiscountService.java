package com.wkk.patterns.strategy;

/**
 * 优惠券的设计
 * @author weikunkun
 * @since 2021/4/26
 */
public class CouponDiscountService {

    /**
     * 优惠券类型
     * @param type 优惠类型 1 直减 2 满减 3 折扣券 4 n元购
     * @param typeContent 优惠券金额
     * @param skuPrice 商品金额
     * @param typeExt
     * @return
     */
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        if (1 == type) {
            return skuPrice - typeContent;
        } else if (2 == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return  skuPrice - typeContent;
        } else if (3 == type) {
            return  skuPrice * typeContent;
        } else if (4 == type) {
            return typeContent;
        } else {
            return 0D;
        }
    }
}
