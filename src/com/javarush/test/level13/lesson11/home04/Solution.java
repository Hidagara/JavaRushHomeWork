package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        OutputStream out = new FileOutputStream(file);
        PrintWriter printWriter = new PrintWriter(out);
        String enter = br.readLine();
        while (true)
        {
            if (enter.equals("exit"))
            {
                printWriter.println("exit");
                break;
            }
            printWriter.println(enter);
            enter = br.readLine();
        }
        printWriter.flush();
        br.close();
        out.close();
    }
}
