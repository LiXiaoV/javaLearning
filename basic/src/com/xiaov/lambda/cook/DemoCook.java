package com.xiaov.lambda.cook;

public class DemoCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了...");
            }
        });

//        invokeCook(() -> {
//            System.out.println("吃饭了...");
//        });

        invokeCook(() -> System.out.println("吃饭了..."));
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
