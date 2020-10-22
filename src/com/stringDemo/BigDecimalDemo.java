package com.stringDemo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println(d1 - d2);

        // BigDecimal, 大的浮点数精确计算
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        // 减法，subtract
        BigDecimal r1 = bd1.subtract(bd2);
        System.out.println(r1);
        // 加法
        BigDecimal r2 = bd1.add(bd2);
        System.out.println(r2);
        // 乘法
        BigDecimal r3 = bd1.multiply(bd2);
        System.out.println(r3);
        // 除法, 链式调用
        BigDecimal r4 = new BigDecimal("1.4").subtract(new BigDecimal("0.5")).divide(new BigDecimal("0.9"));
        System.out.println(r4);
    }
}
