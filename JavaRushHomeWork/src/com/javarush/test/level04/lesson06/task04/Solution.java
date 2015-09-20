package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String firstName, lastName;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            firstName = reader.readLine();
            lastName = reader.readLine();

            if (firstName.equals(lastName))
            {
                System.out.println("Имена идентичны");
            }
            else
            {
                if (firstName.length() == lastName.length()){
                    System.out.println("Длины имен равны");
                }
            }
    }
}
