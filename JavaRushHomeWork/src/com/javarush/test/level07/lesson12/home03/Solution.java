package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        int[] arrayOfNumbers = new int[20];

        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = Integer.parseInt(reader.readLine());
        }


        int temp;
        boolean flag = true;

        while (flag)
        {
            flag = false;
            for (int i = 0; i < arrayOfNumbers.length - 1; i++)
            {
                if (arrayOfNumbers[i] > arrayOfNumbers[i + 1])
                {
                    temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = temp;
                    flag = true;
                }
            }
        }

        maximum = arrayOfNumbers[arrayOfNumbers.length - 1];
        minimum = arrayOfNumbers[0];

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
