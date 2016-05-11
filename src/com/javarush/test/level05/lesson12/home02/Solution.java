package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man kek = new Man("ivan" , 10 , "krags");
        Man kek1 = new Man("ivan1" , 101 , "kra4s");
        Woman kekachka = new Woman("masha", 20 ,"kra2sa");
        Woman kekachka1 = new Woman("masha1", 220 ,"kra3s");

        //выведи их на экран тут
        System.out.println(kek);
        System.out.println(kekachka);
        System.out.println(kek1);
        System.out.println(kekachka1);

    }

    //добавьте тут ваши классы
    public static class Man
            {
                String name;
                int age;
                String address;
                public Man ( String name , int age , String adress)
        {
            this.name = name;
            this.age = age;
            this.address = adress;

        }
                public String toString(){ return name+" "+age+" "+address; }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;
      public Woman( String name , int age , String adress)
      {
          this.name = name;
          this.age = age;
          this.address = adress;

      }
        public String toString(){ return name+" "+age+" "+address; }
    }

}
