package com.xiaov.extendsandabstract.polymorphism;

/**
 * @author xiaov
 * @create_time 2020-10-15 12:46 上午
 */
public class Demo01Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        System.out.println("=========");
        Animal animal1 = new Dog();
        animal1.eat();

        System.out.println("==========");

//        Dog dog = (Dog) animal; //错误，还原失败
//        dog.eat();

        if(animal1 instanceof Cat){
            System.out.println("animal1 = 猫");
        }else {
            System.out.println("animal1 = 狗");
        }
    }
}
