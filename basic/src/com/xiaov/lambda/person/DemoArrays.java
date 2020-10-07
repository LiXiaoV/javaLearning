package com.xiaov.lambda.person;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArrays {

    public static void main(String[] args) {
        Person[] arr = {
                new Person("小明", 18),
                new Person("小红", 19),
                new Person("小黎", 20)
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(arr,(Person o1, Person o2) -> {
//            return o1.getAge() - o2.getAge();
//        });

        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : arr) {
            System.out.println(person.toString());
        }
    }
}
