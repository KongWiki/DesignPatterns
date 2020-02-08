package com.wkk.patterns.proxypattern.inaction.calculator;


/**
 * @Time: 20-2-8下午1:44
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class RealCalculator  implements Calculator{
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mul(double x, double y) {
        return x * y;
    }

    @Override
    public double div(double x, double y) {
        if ( 0!=y){
            return x/y;
        }
        else {
            return -9999;
        }

    }
}
