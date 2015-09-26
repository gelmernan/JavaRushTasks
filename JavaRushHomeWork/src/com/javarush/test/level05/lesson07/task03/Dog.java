package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private int height;
    private String color;

    public void initialize (String name) { this.name = name;
    }

    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

//    Dog (String name) {
//        this.name = name;
//    }
//
//    Dog (String name, int height) {
//        this.name = name;
//        this.height = height;
//    }
//
//    Dog (String name, int height, String color) {
//        this.name = name;
//        this.height = height;
//        this.color = color;
//    }

//    public static void main (String... args) {
//        Dog dog = new Dog("Bulldog");
//        Dog dog1 = new Dog("TerTeryer", 7);
//        Dog dog2 = new Dog("Flabber", 9, "Brown");
//
//        System.out.println(dog.name);
//        System.out.println(dog1.name + " " + dog1.height);
//        System.out.println(dog2.name + " " + dog2.height + " " + dog2.color);
//    }

}
