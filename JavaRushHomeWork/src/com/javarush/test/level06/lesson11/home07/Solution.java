package com.javarush.test.level06.lesson11.home07;

import java.util.ArrayList;

/* Три статические переменных name
Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name
*/

public class Solution
{
    public static String name = "Solution";

    public static class Cat
    {
        public static String name = "Cat";
    }

    public static class Dog
    {
        public static String name = "Dog";
    }

//    public static void main(String[] args)
//    {
//        System.out.println(Solution.name);
//        System.out.println(Cat.name);
//        System.out.println(Dog.name);
//    }
}
