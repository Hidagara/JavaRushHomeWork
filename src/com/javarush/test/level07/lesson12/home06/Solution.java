package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки,
 две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        Human ded = new Human("kek",72, true);
        Human ded1 = new Human("n1", 82, true);
        Human bab = new Human("babuwka1", 72 , false);
        Human bab1 = new Human("babuwka2", 82 , false);
        Human father = new Human("otec1", 32 , true);
        Human mother = new Human("nmat1", 22 , false);
        Human child1 = new Human("rebenok1",19,false, father,mother);
        Human child2 = new Human("rebenok2",12,true, father,mother);
        Human child3 = new Human("rebenok3",16,false, father,mother);
        System.out.println(ded);
        System.out.println(ded1);
        System.out.println(bab);
        System.out.println(bab1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
                public Human (String name, int age, boolean sex)
                {
                    this.name= name;
                    this.age = age;
                    this.sex = sex;

                }
        public Human (String name, int age, boolean sex, Human father, Human mother)
        {
            this.name= name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }
                public Human()
                {

                }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
