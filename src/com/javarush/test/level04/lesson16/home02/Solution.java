package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
         int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
         int sr = 0;
        if ( (a>b && a<c) || (a<b && a>c))
        {
            sr = a;
        }
     else   if ( (b>a && b<c) || (b<a && b>c))
        {
            sr = b;
        }
       else if ( (c>b && c<a) || (c<b && c>a))
        {
            sr = c;
        }
        System.out.print(sr);
    }
}
