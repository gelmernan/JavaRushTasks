package com.javarush.test.level07.lesson09.task03;


import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;


/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        List<String> list = new ArrayList<>(asList("мама", "мыла", "раму"));
        String exactly = "именно";

        for (int i = 1; i <= list.size(); i++) list.add(i++, exactly);

        for (String str : list) System.out.println(str);

    }
}
