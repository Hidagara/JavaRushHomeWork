package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        File file = new File(scanner.nextLine());
        scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if (Integer.valueOf(line)%2 == 0){
                list.add(Integer.valueOf(line));
            }
        }

        scanner.close();
        Collections.sort(list);
        //list.forEach(System.out::println);
        for (int i : list)
        {
            System.out.println(i);
        }
    }
}
