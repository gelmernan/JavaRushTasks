package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private double left = Double.MIN_VALUE;
    private double top = Double.MIN_VALUE;
    private double width = Double.MIN_VALUE;
    private  double height = Double.MIN_VALUE;

    Rectangle(double left, double top, double width, double height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    Rectangle(double left, double top){
        this.left = left;
        this.top = top;
        this.width = 0.0;
        this.height = 0.0;
    }

    Rectangle(double left, double top, double width){
        this.left = left;
        this.top = top;
        this.height = this.width = width;
    }

    Rectangle(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

}
