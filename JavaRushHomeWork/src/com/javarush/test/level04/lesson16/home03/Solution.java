package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int sum = 0;

        while (!(s = reader.readLine()).startsWith("-1"))
        {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum - 1);
    }
}
