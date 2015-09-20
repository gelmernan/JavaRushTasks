package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Arrays;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код


        int[] nums = new int[3];

        fillArr(nums);

        System.out.println(getMedian(sortArr(nums)));
    }

    public static int getMedian(int[] arr){
     return arr[arr.length/2];
    }

    public static int[] sortArr(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void fillArr(int[] arr){

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
