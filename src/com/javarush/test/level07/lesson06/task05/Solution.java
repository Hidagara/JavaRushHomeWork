/*
package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

*/
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*//*

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         ArrayList stroka = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5; i++)
        {    String c = bufferedReader.readLine();
            stroka.add(Integer.parseInt(c));

        }
        System.out.print(stroka.size());
        for (int i=0; i<12;i++)
        {   String e = stroka[stroka.size()];

        }
    }
}
*/
