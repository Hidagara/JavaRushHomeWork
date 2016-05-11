package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map <String, Cat> result = new HashMap<>();
        result.put("kot1", new Cat("kot1"));
        result.put("kot12", new Cat("kot12"));
        result.put("kot13", new Cat("kot13"));
        result.put("kot14", new Cat("kot14"));
        result.put("kot15", new Cat("kot15"));
        result.put("kot16", new Cat("kot16"));
        result.put("kot17", new Cat("kot17"));
        result.put("kot18", new Cat("kot18"));
        result.put("kot19", new Cat("kot19"));
        result.put("kot11", new Cat("kot11"));
        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> result = new HashSet<>();

        result.add(map.get("kot1"));
        result.add(map.get("kot12"));
        result.add(map.get("kot13"));
        result.add(map.get("kot14"));
        result.add(map.get("kot15"));
        result.add(map.get("kot16"));
        result.add(map.get("kot17"));
        result.add(map.get("kot18"));
        result.add(map.get("kot19"));
        result.add(map.get("kot11"));
        return  result;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
