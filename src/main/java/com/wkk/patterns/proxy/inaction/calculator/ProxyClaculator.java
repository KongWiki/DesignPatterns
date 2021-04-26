package com.wkk.patterns.proxy.inaction.calculator;

/**
 * @Time: 20-2-8下午1:44
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class ProxyClaculator implements Calculator {
    private RealCalculator calculator;

    public void setCalculator(RealCalculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public double add(double x, double y) {

        return calculator.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        return calculator.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        return calculator.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        return calculator.div(x, y);
    }
}
