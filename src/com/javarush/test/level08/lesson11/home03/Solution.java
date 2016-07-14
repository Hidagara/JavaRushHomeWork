package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> result = new HashMap<>();
        result.put("Kek","kekov1");
        result.put("Kek2","kekov2");
        result.put("Kek3","kekov3");
        result.put("Kek4","kekov4");
        result.put("Kek5","kekov5");
        result.put("Kek6","kekov6");
        result.put("Kek7","kekov7");
        result.put("Kek8","kekov8");
        result.put("Kek1","kekov9");
        result.put("Kek","kekov11");


        return result;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
