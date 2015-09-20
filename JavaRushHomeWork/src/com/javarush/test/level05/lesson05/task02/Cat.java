package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    };

    public Cat(int age, int weight, int strength)
    {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        return ((this.age + this.weight + this.strength) >
                (anotherCat.strength + anotherCat.weight + anotherCat.age)) ? true : false;
    }

//    public static void main(String... args){
//        Cat cat1 = new Cat(4,15,20);
//        Cat cat2 = new Cat(2,11,15);
//
//        System.out.println(cat1.fight(cat2));
//    }
}
