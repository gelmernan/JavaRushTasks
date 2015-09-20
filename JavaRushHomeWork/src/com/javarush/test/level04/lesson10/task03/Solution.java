package com.javarush.test.level04.lesson10.task03;

import java.util.Scanner;/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        try
        {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            int n = scanner.nextInt();

            while (!(n == 0)){
                System.out.println(name);
                n--;
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
