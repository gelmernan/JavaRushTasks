package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int count = 0;
        int counter = 0;

        String matchString = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!(matchString = reader.readLine()).equals("сумма"))

        {
            counter++;
            count = Integer.parseInt(reader.readLine());
        }


        System.out.println(count + "||" + counter);
    }
}
