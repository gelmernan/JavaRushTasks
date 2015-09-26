package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name = null;
    private int weight = 0;
    private int age = 0;
    private String color = null;
    private String address = null;

    //- Имя,
    Cat (String name) {
        this.name = name;
        this.weight = setWeight();
        this.age = setAge();
    }
    //- Имя, вес, возраст
    Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    //- Имя, возраст (вес стандартный)
    Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = setWeight();
    }
    //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
    Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = setAge();
    }
    //- вес, цвет, адрес ( чужой домашний кот)
    Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = setAge();
    }

    int setAge() {
        return (this.age == 0) ? (this.age = 3) : (this.age = 0);
    }

    int setWeight() {
        return (this.weight == 0) ? (this.weight = 7) : (this.weight = 0);
    }

//    public static void main(String... args) {
//        Cat cat = new Cat("Barsik");
//        assert(cat.weight == 7);
//        assert(cat.age == 3);
//        System.out.println(cat.age + " " + cat.weight);
//    }
}
