package com.xiaov.lambda.calculator;

public class DemoCalculator {
    public static void main(String[] args) {
        invokeCalc(25, a -> a * a);
    }

    public static void invokeCalc(int a, Calculator calculator) {
        int result = calculator.calc(a);
        System.out.println(a + " 的平方 = " + result);
    }
}