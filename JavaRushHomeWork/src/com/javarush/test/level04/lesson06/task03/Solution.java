package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        Integer[] nums = new Integer[3];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        java.util.Arrays.sort(nums, Collections.reverseOrder());
        for (int num : nums){
            System.out.println(num);
        }

    }
}
