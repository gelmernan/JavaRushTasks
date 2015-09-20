package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

import java.util.Random;

public class Cat
{
    //напишите тут ваш код
    private String name;
    private String color;
    private String address;
    private int weight;
    private int age;


    //  Имя
    public void initialize (String name){
        this.name = name;
        this.weight = getDefaultWeight();
        this.age = getDefaultAge();
        this.address = null;
        this.color = getDefaultColor().toUpperCase();
    }

    //   Имя, вес, возраст
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = getDefaultColor().toUpperCase();
    }

    //   Имя, возраст (вес стандартный)
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.color = getDefaultColor().toUpperCase();
        this.weight = getDefaultWeight();
        this.address = null;
    }

    //   вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize (int weight, String color){
        this.name = null;
        this.age = getDefaultAge();
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    //   вес, цвет, адрес (чужой домашний кот)
    public void initialize (int weight, String color, String address){
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.age = getDefaultAge();
        this.address = address;
    }

    @Override
    public String toString () {
        return "Cat name is: " + name + "\nCat age is: " + age + "\nCat weight is: " + weight
                + "\nCat color is: " + color + "\nCat address is: " + address + "\n";
    }

    public String getDefaultColor () {
        String[] colors = {"Black", "White"};
        return colors[0];
    }

    public int getDefaultWeight (){
        Random random = new Random();
        int result = random.nextInt(6) * 3;
        if (result == 0)
            result++;
        return result;
    }

    public  int getDefaultAge () {
        Random random = new Random();
        int result = random.nextInt(4) * 2;
        if (result == 0)
            result++;
        return result;
    }

    public static void main (String... arg){

        Cat cat = new Cat();
        cat.initialize("Cat");
        System.out.println(cat);

        Cat cat1 = new Cat();
        cat1.initialize("Seconds cat", 9, 3);
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.initialize("Third name", 4);
        System.out.println(cat2);

        Cat cat3 = new Cat();
        cat3.initialize(3, "White");
        System.out.println(cat3);

        Cat cat4 = new Cat();
        cat4.initialize(5, "Grey", "Washington D.C.");
        System.out.println(cat4);

    }


}
