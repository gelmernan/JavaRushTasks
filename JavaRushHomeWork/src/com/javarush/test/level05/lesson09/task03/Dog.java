package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name = null;
    private int height = 0;
    private String color = null;

    Dog(String name){
        this.name = name;
        this.height = setHeight();
    }

    Dog(String name, int height){
        this.name = name;
        this.height = height;
    }

    Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    private int setHeight(){
        return (this.height == 0) ? (this.height = 9) : (this.height = 0);
    }

}
