package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("mice", 5, 22, 15);
        Cat cat2 = new Cat("mice", 5, 22, 15);
        Cat cat3 = new Cat("mice", 5, 22, 15);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}