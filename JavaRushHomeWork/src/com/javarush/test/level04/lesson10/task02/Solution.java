package com.javarush.test.level04.lesson10.task02;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int count = 1;
        List<Integer> nums = new LinkedList<Integer>();

        while (nums.size() < 10)
            nums.add(count++);



        count = count - 2;
        while (count >= 0){
            System.out.println(nums.get(count--));
        }

    }
}
