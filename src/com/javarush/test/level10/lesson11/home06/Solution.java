package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы

        String name;
        int age;
        boolean sex;
        int weight;
        String fatherName;
        String motherName;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(boolean sex)
        {
            this.sex = sex;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String motherName, String fatherName)
        {
            this.motherName = motherName;
            this.fatherName = fatherName;
        }

        public Human(int age, boolean sex)
        {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String motherName, boolean sex)
        {
            this.name = name;
            this.motherName = motherName;
            this.sex = sex;
        }

        public Human(String motherName, String fatherName, int weight, boolean sex, int age, String name)
        {
            this.motherName = motherName;
            this.fatherName = fatherName;
            this.weight = weight;
            this.sex = sex;
            this.age = age;
            this.name = name;
        }

        public Human(String name, String fatherName, int weight, boolean sex)
        {
            this.name = name;
            this.fatherName = fatherName;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }
    }
}
