package com.wkk.patterns.strategy;

import com.wkk.patterns.strategy.event.MJCouponDiscount;
import com.wkk.patterns.strategy.event.NYGCouponDiscount;
import com.wkk.patterns.strategy.event.ZJCouponDiscount;
import com.wkk.patterns.strategy.event.ZKCouponDiscount;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * 策略模式的使用
 * @author weikunkun
 * @since 2021/4/26
 */
@Slf4j
public class ContextTest {

    /**
     * 测试直减结果
     */
    @Test
    public void test_zj() {
        // 直减 100 - 10
        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        log.info("结果: {}", discountAmount);
    }

    /**
     * 满减 100 - 20
     */
    @Test
    public void test_mj() {
        // 满减 满 100 - 20；
        Context<Map<String, String>> context = new Context<>(new MJCouponDiscount());
        Map<String, String> map = new HashMap<>();
        map.put("x", "100");
        map.put("n", "20");
        BigDecimal discountAmount = context.discountAmount(map, new BigDecimal(100));
        log.info("结果: {}", discountAmount);
    }

    /**
     * N元购买
     */
    @Test
    public void test_ny() {
        Context<Double> context = new Context<>(new NYGCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(70D, new BigDecimal(100));
        log.info("结果: {}", discountAmount);
    }

    /**
     * 折扣
     * 打7折
     */
    @Test
    public void test_zk() {
        Context<Double> context = new Context<>(new ZKCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(0.7, new BigDecimal(100));
        log.info("结果: {}", discountAmount);
    }
}