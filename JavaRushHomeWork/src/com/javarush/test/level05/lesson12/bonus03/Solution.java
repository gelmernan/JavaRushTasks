package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] container = new int[Integer.parseInt(reader.readLine())];
        int maximum;
        int n = 0;

        //напишите тут ваш код

        for (; n < container.length; n++)
        {
            container[n] = Integer.parseInt(reader.readLine());
        }

        maximum = container[0];

        for (n = 0; n < container.length; n++)
        {
            if (maximum < container[n])
            {
                maximum = container[n];
            }
        }
//        System.out.println(Arrays.toString(container));
        System.out.println(maximum);

    }
}
