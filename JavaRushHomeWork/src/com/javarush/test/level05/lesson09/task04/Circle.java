package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    private double centerX = Double.MIN_NORMAL;
    private double centerY = Double.MIN_NORMAL;
    private double radius = Double.MIN_NORMAL;
    private double width = Double.MIN_NORMAL;

    private String color = null;

    Circle(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    Circle(double centerX, double centerY, double radius, double width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    Circle(double centerX, double centerY, double radius, double width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
