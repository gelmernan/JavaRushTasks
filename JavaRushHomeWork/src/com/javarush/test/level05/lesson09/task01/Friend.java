package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String name = null;
    private int age = 0;
    private String gender = null;

    Friend (String name) {
        this.name = name;
    }

    Friend (String name, int age) {
        this.name = name;
        this.age = age;
    }

    Friend (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}