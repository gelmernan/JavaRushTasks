package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<Integer> container = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        //напишите тут ваш код
       try
       {
           while (!((maximum = Integer.parseInt(reader.readLine())) <= 0))
           {
               container.add(maximum);
           }

           System.out.println(Collections.max(container));
       }
       catch (Exception e) {
           System.out.println(e);
       }
    }
}
