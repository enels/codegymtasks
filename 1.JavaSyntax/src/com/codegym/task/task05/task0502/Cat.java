package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static boolean fight(Cat anotherCat) {
        //write your code here
        if ( anotherCat.strength > 0 )
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.strength = 5;
        System.out.println(fight(cat1));
    }
}
