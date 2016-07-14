package codewars;

import java.io.IOException;

/**
 * Created by hidagara on 1/3/2016.
 */

public class Person {

    String name;
    public Person(String personName)
    {
        name = personName;
    }

    public String greet(String yourName)
    {
         return String.format("Hi %s, my name is %s", name, yourName);
    }


   public static void main(String[] args) throws IOException
   {

   }

}