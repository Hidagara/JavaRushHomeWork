package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("mda");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("topkek");
        ArrayList<String> a3 = new ArrayList<>();
        a3.add("votetokek");
        ArrayList<String> [] list = new ArrayList[3];
        list[0] = a1;
        list[1] = a2;
        list[2] = a3;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}