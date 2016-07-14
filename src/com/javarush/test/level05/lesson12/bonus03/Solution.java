package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int k = 0;
        int n;
        //напишите тут ваш код
        k = Integer.parseInt(reader.readLine());
        int maximum=Integer.parseInt(reader.readLine());
        if (k>0)
        {
            for (int i = 0; i < k-1; i++)
            {
                n = Integer.parseInt(reader.readLine());

                if (n > maximum)
                    maximum = n;
            }
        }

        System.out.println(maximum);
    }
}
